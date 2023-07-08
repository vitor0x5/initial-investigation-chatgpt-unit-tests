import sys
import os
import re
import traceback
from bs4 import BeautifulSoup as bs
from datetime import datetime

error = open('log-error.txt', 'a+')


dados = open('files.txt', 'r')
for x in dados: 
    x = x.strip()
    info = x.split(':')
    prj = info[0]
    clazz = info[1]
    
    output = open('./reports/'+ prj + '.csv', 'w') 
    output.write("PRJ;Execucao;Cobertos;Gerados;Cobertura;Mortos;Total;Escore\n")
    
    for x in range(12):
        try:
            with open("../projetos/" + prj+ "/reports/"+clazz+"Test"+str(x)+"/index.html",'r') as html:
                soup = bs(html, 'html.parser')
                divs = soup.findAll(attrs={'class':'coverage_percentage'})
                covs = soup.findAll(attrs={'class':'coverage_legend'})

                output.write(prj + ";")
                output.write(str(x) + ";")
                output.write(covs[2].text.split("/")[0].strip() + ";")
                output.write(covs[2].text.split("/")[1].strip() + ";")
                output.write(divs[0].text.strip() + ";")
                output.write(covs[3].text.split("/")[0].strip() + ";")
                output.write(covs[3].text.split("/")[1].strip() + ";")
                output.write(divs[1].text.strip())	
                output.write("\n")
                output.flush()
        except:
            var = traceback.format_exc()
            now = datetime.now()
            current_time = now.strftime("%H:%M:%S")
            error.write(current_time)
            error.write(" - "+prj+" - ERROR: /reports/"+clazz+"Test"+str(x)+"/index.html\n")
            error.write(var)
            error.write("\n")
    
dados.close()
output.close()
error.close()
    
        