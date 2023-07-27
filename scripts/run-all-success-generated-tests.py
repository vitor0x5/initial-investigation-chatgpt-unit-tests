import sys
import os
import csv

def get_successfull_executed_tests(arquivo_csv, prj):
    valores_exec = []
    
    # Verifica se o arquivo CSV existe
    if not os.path.exists(arquivo_csv):
        print(f"Arquivo '{arquivo_csv}' não encontrado.")
        return valores_exec
    
    with open(arquivo_csv, newline='') as csvfile:
        reader = csv.DictReader(csvfile, delimiter=';')
        
        for row in reader:
            if row['PRJ'] == prj:
                valores_exec.append(int(row['Exec']))
    
    return valores_exec

def create_all_tests_java_code(test_class_list, clazz):
    code = "package ds;\nimport org.junit.runner.RunWith;\nimport org.junit.runners.Suite;\n\n@RunWith(Suite.class)\n"
    code = code + "@Suite.SuiteClasses({ "
    
    if len(test_class_list) > 0 :
        first_class = test_class_list.pop(0)
        code = code + f"{clazz}Test{first_class}.class"
    
    for n in test_class_list:
        code = code + f", {clazz}Test{n}.class"
    
    code = code + " })\npublic class All { }"
    return code
    



dados = open('files.txt', 'r')
report_file = "./reports/allExec.csv"

for x in dados: 
    x = x.strip()
    info = x.split(':')
    prj = info[0]
    clazz = info[1].replace("ds.", "")
    cmd = f"mkdir -p ../projetos/{prj}/src/test/java/ds/"
    os.system(cmd)

    successfull_executed_tests = get_successfull_executed_tests(report_file, prj)

    for n in successfull_executed_tests:
        cmd = f"cd ../projetos/{prj}; cp ./gpt-tests/{clazz}Test{n}.java ./src/test/java/ds"
        os.system(cmd)
        
    all_tests_file = open(f"../projetos/{prj}/src/test/java/ds/All.java", 'w')
    code = create_all_tests_java_code(successfull_executed_tests, clazz)
    all_tests_file.write(code)
    all_tests_file.close()

    print(f"Executando testes do projeto {prj}.")
    cmd = "cd " + "../projetos/" + prj + "; mvn -DclassName=\"" +"ds."+ clazz + "\" -DtestName=\""+ f"ds.All\""
    cmd = cmd + " clean install org.pitest:pitest-maven:mutationCoverage"
    os.system(cmd)
    
    
# x = '01Max:ds.Max'
# x = x.strip()
# info = x.split(':')
# prj = info[0]
# clazz = info[1].replace("ds.", "")
# cmd = f"mkdir -p ../projetos/{prj}/src/test/java/ds/"
# os.system(cmd)

# successfull_executed_tests = get_successfull_executed_tests(report_file, prj)

# # for n in successfull_executed_tests:
# #     cmd = f"cd ../projetos/{prj}; cp ./gpt-tests/{clazz}Test{n}.java ./src/test/java/ds"
# #     os.system(cmd)
    
# all_tests_file = open(f"../projetos/{prj}/src/test/java/ds/All.java", 'w')
# code = create_all_tests_java_code(successfull_executed_tests, clazz)
# all_tests_file.write(code)
# all_tests_file.close()

# print(f"Executando testes do projeto {prj}.")
# cmd = "cd " + "../projetos/" + prj + "; mvn -DclassName=\"" +"ds."+ clazz + "\" -DtestName=\""+ f"ds.All\""
# cmd = cmd + " clean install org.pitest:pitest-maven:mutationCoverage"
# os.system(cmd)

dados.close()
    
    
    
