# MusicRadarAI Backend

<p align="center">
  <img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white" alt="Java 17">
  <img src="https://img.shields.io/badge/H2-000000?style=for-the-badge&logo=h2&logoColor=white" alt="H2 Database">
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Spring Boot">
  <img src="https://img.shields.io/badge/WebFlux-6DB33F?style=for-the-badge&logo=spring&logoColor=white" alt="Spring WebFlux">
  <img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white" alt="Maven">
  <img src="https://img.shields.io/badge/OpenAI-412991?style=for-the-badge&logo=openai&logoColor=white" alt="OpenAI">
</p>

---

### 🇧🇷 Versão em Português

O **MusicRadarAI** é um sistema de recomendação musical inovador. Este backend, desenvolvido em **Java** com **Spring Boot WebFlux**, atua como o cérebro da aplicação, gerando sugestões de músicas e artistas de forma personalizada com base em um catálogo de músicas, usando a API da OpenAI.

O projeto utiliza uma arquitetura **reativa** e **não-bloqueante**, garantindo que a aplicação possa lidar com um grande volume de requisições de forma eficiente. O **H2 Database** em memória é usado para simplicidade e rapidez no desenvolvimento e testes.

#### Tecnologias Utilizadas

* **Framework**: Spring Boot 3.5.4 (com WebFlux)
* **Linguagem**: Java 17
* **Acesso a Dados**: Spring Data (JPA, com H2)
* **Banco de Dados**: H2 Database (em memória)
* **Gerenciamento de Dependências**: Maven
* **Integração com IA**: API da OpenAI

#### Como Iniciar

1.  **Pré-requisitos**: Garanta que tenha o [Java 17](https://www.java.com/pt-BR/) e o [Maven](https://maven.apache.org/) instalados.
2.  **Instalação das Dependências**: As dependências serão instaladas automaticamente pelo Maven na primeira execução.
3.  **Configuração da API**: Adicione a sua chave da API da OpenAI como uma variável de ambiente na sua IDE.
4.  **Execução do Servidor**: Para iniciar, use o comando:
    ```bash
    ./mvnw spring-boot:run
    ```
    O servidor rodará em `http://localhost:8080`.

---

### 🇺🇸 English Version

The **MusicRadarAI** is an innovative music recommendation system. This backend, developed in **Java** with **Spring Boot WebFlux**, acts as the application's brain, generating personalized music and artist suggestions based on a music catalog using the OpenAI API.

The project uses a **reactive** and **non-blocking** architecture, ensuring the application can handle a large volume of requests efficiently. The in-memory **H2 Database** is used for simplicity and speed during development and testing.

#### Technologies Used

* **Framework**: Spring Boot 3.5.4 (with WebFlux)
* **Language**: Java 17
* **Data Access**: Spring Data (JPA, with H2)
* **Database**: H2 Database (in-memory)
* **Dependency Management**: Maven
* **AI Integration**: OpenAI API

#### Getting Started

1.  **Prerequisites**: Ensure you have [Java 17](https://www.java.com/en/) and [Maven](https://maven.apache.org/) installed.
2.  **Install Dependencies**: Dependencies will be automatically installed by Maven on the first run.
3.  **API Configuration**: Add your OpenAI API key as an environment variable in your IDE.
4.  **Server Execution**: To start the server, use the command:
    ```bash
    ./mvnw spring-boot:run
    ```
    The server will run on `http://localhost:8080`.
