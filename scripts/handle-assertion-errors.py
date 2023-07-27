import sys
import os

def found_errors(mvnfile):
    errors={}
    found = False
    
    # Using readlines()
    file = open(mvnfile, 'r')
    while (file):
        text = file.readline()
        text = text.strip()
        
        if (text == "Failed tests:"):
            found = True
        else:
            if (found):
                text = text.strip()
                if (len(text)>0):
                    (line,problem) = process_expected(text)
                    errors[line] = problem
                else:
                    break
    file.close()    
    return errors

# Process a test failure creating a dictionary with a dictionary in the
# following format:
#
# {<line>: {"expected":<expected_value>, "was":<obtained_value>}}
def process_expected(text):
    errors = text.split()
    line = int(errors[0].split(":")[1])
    expected = errors[1].split(":")[1]
    expected = expected.replace('<','').replace('>','')
    expected = expected.strip()    
    
    was = errors[3].split(":")[1]
    was = was.replace('<','').replace('>','')
    was = was.strip()
    
    return (line, {"expected":expected, "was":was})

#
# Receives a dictionary with errors and try to fix accordantly
#
def correcting_errors_found(errors,testfile,newfile):
    inputfile = open(testfile, 'r')
    outputfile = open(newfile, 'w')
    
    linecount = 0
    
    for text in inputfile:
        linecount = linecount + 1
        
        # Check for line with error
        if (linecount in errors):
            expected = errors[linecount]["expected"]
            was = errors[linecount]["was"]
            text = text.replace(expected,was)
        
        outputfile.write(text)
         
    inputfile.close()
    outputfile.close()
        
def main():
    if len(sys.argv) < 3:
        print("error: handle-assertion-errors.py")
        print("Example: handle-assertion-errors.py <maven_output_file> <failing_test_file> <new_test_file>")
        sys.exit(1)
    else:
        mvnout = sys.argv[1]
        failingtestfile = sys.argv[2]
        newtestfile = sys.argv[3]
        
        print("Processing file:", failingtestfile)
        errors = found_errors(mvnout)
        print("Problems found:")
        print(errors)
        
        print("Creating new file", newtestfile, "with corrections")
        correcting_errors_found(errors, failingtestfile, newtestfile)
        print("File",newtestfile,"create successfuly")
if __name__ == "__main__":
    main()
