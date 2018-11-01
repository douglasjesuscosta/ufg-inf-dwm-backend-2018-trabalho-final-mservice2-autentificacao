# ufg-inf-dwm-backend-2018-trabalho-final-mservice2-autentificacao
Segundo microsserviço elaborado para a disciplina Programação Backend Avançada na Especialização em Desenvolvimento Web e Mobile Full-Stack. 

# Alunos: 
Douglas de Jesus Costa, <br />
Douglas Winston Ribeiro Soares <br />
Lucas de Castro Rieiro <br />

# Utilização
Esse microserviço tem como função auxiliar a autentificação de usuário para a realização do cadastro de compras. Dessa forma, o serviço recebe os dados do usuário em Json como no exemplo abaixo: <br />
{<br />
	"id": null, <br />
	"email": "douglas.jesuscosta@gmail.com", <br />
	"senha": "1234567" <br />
}<br />
<br />
Após receber esse objeto, o serviço verifica se existe tal usuário no banco e, se existir, acrescenta o "id" que existe apenas no banco de dados desse microserviço.
# Tecnologias utilizada
O microserviço utiliza as seguintes tecnologias: <br />
  1 - Lingugagem Java versão 8; <br />
  2 - Framework Spring boot e Spring data 2.0.6; <br />
  3 - Banco de dados PostgreSQL 10.5; <br />
  
# Instalação

1 - Realizar o download e instalar o bando de dados PostgreSQL; <br />
2 - Criar um banco de dados chamado "mservice2 executando o seguinte comando: "create database mservice2"<br />
3 - Realizar o git clone do repositório;<br />
4 - Fazer o download do plugin Maven ou - caso possua a IDE Eclise - Importar o projeto para o Eclipse através de:<br />
    File > Import > Maven > Existing Maven Projects<br />
Maven:<br />
5.1 - Através do terminal, navegar até a pasta raiz do projeto e executar maven install para download das dependências;<br />
5.2 - executar a aplicação com o comando: mvn spring-boot:run<br />
<br />
Eclipse:<br />
5.1 - Aguardar a IDE realizar o download automático das dependências descritas no arquivo pom.xml<br />
5.2 - Após a realização do building do projeto, executar como Java Application o arquivo Mservice2Application.java<br />
