# Projeto de Avaliação Semestral - Programação Orientada a Objetos

Este repositório contém o projeto de avaliação semestral da disciplina de *Programacao Orientada a Objetos*, focado no desenvolvimento de um CRUD utilizando a ferramenta Spring Boot.

## :clipboard: Funcionalidades

- Criação, Edição, Remoção e Leitura.
- 
## :rocket: Tecnologias Utilizadas

- *Linguagem principal:* Java
- *Frameworks/Plataformas:* Spring Boot
- *Gerenciamento de requisições:* Postman
- *Data Base*: Postgres
- *Visualização do Banco de dados:* pgAdmin
- *Executar banco de dados:* Docker

## :tools: Configuração do Ambiente

1. Certifique-se de ter o [Java](https://docs.oracle.com/en/java/) instalado.
2. Certifique-se de ter uma IDE com as extensões do Java instaladas corretamente(Ex.: VS Code, Intellij).
3. Certifique-se de ter uma ferramenta instalda para fazer as requisições HTTP (Ex.: Postman, Insomnia).
4. Certifique-se de ter o Docker instalado para iniciar um contêiner que executa o banco de dados.
   
6. Clone este repositório:
   bash
   git clone https://github.com/1Patricio/AS-POO.git

7. Configure o seu [Banco de Dados]((https://www.postgresql.org/docs/))

## 📄 Configuração do Firebase

- Inicie seu banco de dado no console do [Docker](https://docs.docker.com/)

1. Execute no terminal o comando abaixo para iniciar o banco
   bash
   docker run --name meu-postgres -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=1234 -p 5432:5432 -d postgres

2. Instalar o flutterFire vai nos ajudar a configurar o firebase no projeto
- :rotating_light: É necessário ter o Dart instalado na Variável de Ambiente do seu computador :rotating_light:
   bash
   dart pub global activate flutterfire_cli

3. Dentro do diretório do projeto, execute
   bash
   flutterfire configure
- Durante a configuração, vai ser solicitado o packageName da aplicação, no android conseguimos pegar dentro da pasta app de android:
  ![image](https://github.com/user-attachments/assets/6f062392-fa31-47e1-a035-a612de2a3971)
  ![Copiar a String de que está após namespace = ](https://github.com/user-attachments/assets/8ee7bcfe-8100-491d-9168-9a03e70d0385)

