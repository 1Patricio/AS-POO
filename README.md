# Projeto de Avaliação Semestral - Programação Orientada a Objetos

Este repositório contém o projeto de avaliação semestral da disciplina de *Programacao Orientada a Objetos*, focado no desenvolvimento de um CRUD utilizando a ferramenta Spring Boot.

## :clipboard: Funcionalidades

- Criação, Edição, Remoção e Leitura.
- 
## :rocket: Tecnologias Utilizadas

- **Linguagem principal:** Java
- **Frameworks/Plataformas:** Spring Boot
- **Gerenciamento de requisições:** Postman
- **Data Base**: Postgres
- **Visualização do Banco de dados:** pgAdmin
- **Executar banco de dados:** Docker

## :tools: Configuração do Ambiente

1. Certifique-se de ter o [Java](https://docs.oracle.com/en/java/) instalado.
2. Certifique-se de ter uma IDE com as extensões do Java instaladas corretamente(Ex.: VS Code, Intellij).
3. Certifique-se de ter uma ferramenta instalda para fazer as requisições HTTP (Ex.: Postman, Insomnia).
4. Certifique-se de ter o Docker instalado para iniciar um contêiner que executa o banco de dados.
   
6. Clone este repositório:
   bash
   git clone https://github.com/1Patricio/AS-POO.git

7. Configure o seu [Banco de Dados]((https://www.postgresql.org/docs/))

## 📄 Configuração do Banco de Dados

- Inicie seu banco de dado no console do [Docker](https://docs.docker.com/)

1. Execute no terminal o comando abaixo para iniciar o banco
   ```
   docker run --name meu-postgres -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=1234 -p 5432:5432 -d postgres

2. Configure seu Data Base em **`/resources/application.properties `**
![WhatsApp Image 2024-12-04 at 20 33 50_1f8524ca](https://github.com/user-attachments/assets/41f4cedf-3007-4b82-b469-f73f08ef96bb)

2.1 Para primeira utilização use 
   bash
   spring.jpa.hibernate.ddl-auto=create
2.2 Para as demais utilizações use
   bash 
   spring.jpa.hibernate.ddl-auto=update

3. Configuração completa, agora voce pode usar a ferramenta de sua preferencia para visualizar o banco de dados e excecutar os comados DML

   **Ferramenta utilizada no projeto:** [pgAdmin](https://www.pgadmin.org/download/)
