import sys
import os
import requests
import re

def read_java_files(folder_path):
    print(f"Lendo códigos fonte {clazz} \n")
    java_files = []
    for file_name in os.listdir(folder_path):
        if file_name.endswith(".java"):
            file_path = os.path.join(folder_path, file_name)
            with open(file_path, "r") as file:
                text = file.read()
                java_files.append(f"```{text}```")
    return java_files
    

def request_test_generation(code, clazz, temperature):
    url = "https://api.openai.com/v1/chat/completions"
    headers = {
        "Content-Type": "application/json",
        "Authorization": "Bearer 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"
    }
    data = {
        "model": "gpt-3.5-turbo",
        "messages": [
            {
                "role": "user",
                "content": f"Generate test cases just for the {clazz} Java class in one file with imports using Junit 4 and Java 8:\n\n{code}"
                }
            ],
        "temperature": temperature,
    }
    response = requests.post(url, headers=headers, json=data)
    response_json = response.json()
    content = response_json["choices"][0]["message"]["content"]
    print(f"Request enviada com sucesso para o projeto: {clazz} \n")
    return content


def remove_other_test_classes(code):
    lines = code.split("\n")
    n_class = 0
    code_with_one_test_class = ""
    for line in lines:
        if line.startswith("import") and n_class != 0:
            return code_with_one_test_class
        
        if line.startswith("public class"):
            n_class = n_class + 1
            
        if n_class > 1:
            return code_with_one_test_class
        
        code_with_one_test_class = code_with_one_test_class + "\n" + line
    return code_with_one_test_class
            
    
def generate_tests(code, clazz, temperature):
    generated_tests = request_test_generation(code, clazz, temperature)
    generated_tests.replace("package ds;", "")
    generated_tests = "package ds;" + generated_tests
    generated_tests = generated_tests.replace("```", "")
    generated_tests = remove_other_test_classes(generated_tests)
    return generated_tests

def get_test_path(prj, clazz, number):
    return os.path.join("..", "projetos", prj, "src", "test", "java", "ds", f"{clazz}Test{number}.java")

def set_temperature(i):
    if(i < 3): return 0.7
    if(i < 6): return 0.8
    if(i < 9): return 0.9
    return 1.0


if len(sys.argv) < 1:
    print("error: gera-chatgpt.py")
    print("Example: gera-chatgpt.py")
    sys.exit(1)


dados = open('files.txt', 'r')
for x in dados: 
    x = x.strip()
    info = x.split(':')
    prj = info[0]
    clazz = info[1].replace("ds.", "")

    source_path = os.path.join("..", "projetos", prj, "src", "main", "java", "ds")
    os.makedirs(os.path.dirname(get_test_path(prj, clazz, 0)), exist_ok=True)

    code = read_java_files(source_path)
    
    for i in range(12):
        temperature = set_temperature(i)
        generated_tests = generate_tests(code, clazz, temperature)
        
        with open(get_test_path(prj, clazz, i), "w") as file:
            file.write(generated_tests)
            
        print(f"Arquivo de testes numero {i} gerado. Projeto: {prj} \n")     

dados.close()


