# MusicRadarAI Backend

<p align="center">
  <img src="https://img.shields.io/badge/Spring_Boot-WebFlux-brightgreen?logo=spring" alt="Spring Boot WebFlux">
  <img src="https://img.shields.io/badge/Language-Java%2017-orange?logo=java&logoColor=white" alt="Java Language">
  <img src="https://img.shields.io/badge/Database-H2-000000?logo=h2&logoColor=white" alt="H2 Database">
  <img src="https://img.shields.io/badge/Powered_by-OpenAI-412991?logo=openai&logoColor=white" alt="OpenAI">
  <img src="https://img.shields.io/badge/License-MIT-success" alt="License">
</p>

---

### 🇧🇷 Versão em Português

## 🎶 Sobre o Projeto

O **MusicRadarAI** é um sistema de recomendação musical inovador, onde o backend, desenvolvido em **Java** com **Spring Boot WebFlux**, atua como o cérebro da aplicação. O objetivo principal é criar um serviço que gerencia um catálogo de músicas e, com base nesse acervo, um **LLM** (Large Language Model) como o da OpenAI sugere novas músicas e artistas de forma personalizada.

O projeto utiliza uma arquitetura **reativa** e **não-bloqueante**, garantindo que a aplicação possa lidar com um grande volume de requisições de forma eficiente, especialmente as chamadas para a API externa do LLM, que podem demorar mais.

## ✨ Funcionalidades Principais

* 🎵 **Catálogo de Músicas**: A API permite adicionar, visualizar, editar e remover músicas do catálogo.
* 🤖 **Recomendações com IA**: O núcleo da aplicação. Com base na lista de músicas no catálogo, a IA gera e retorna uma lista de novas sugestões.
* ⚡ **API Reativa**: Endpoints construídos com WebFlux para um desempenho otimizado e uma experiência de usuário fluida.
* 💾 **Banco de Dados em Memória**: Utiliza o H2 para simplicidade e rapidez no desenvolvimento e testes, sem a necessidade de uma configuração de banco de dados externa.

## ⚙️ Arquitetura do Projeto

O backend segue o padrão de arquitetura modular do Spring, com um foco especial na programação reativa para o fluxo de dados.

-   **`Controller`**: Recebe as requisições HTTP de forma não-bloqueante e as encaminha para a camada de serviço.
-   **`Service`**: Contém a lógica de negócio, incluindo a comunicação com a API externa do LLM e a persistência dos dados.
-   **`Repository`**: Interage com o banco de dados H2 de forma reativa, utilizando `Mono` e `Flux` para abstrair as operações de acesso a dados.
-   **`Entity` / `DTO`**: Estrutura os dados de persistência e de transferência entre as camadas, garantindo segurança e consistência.

## 💻 Tecnologias Utilizadas

* **Framework**: Spring Boot 3.5.4 (com WebFlux)
* **Linguagem**: Java 17
* **Acesso a Dados**: Spring Data R2DBC
* **Banco de Dados**: H2 Database (em memória)
* **Gerenciamento de Dependências**: Maven
* **Integração com IA**: API da OpenAI (ou similar)
* **Segurança**: Spring Security
* **Desenvolvimento**: Lombok

## 🚀 Como Iniciar o Ambiente de Desenvolvimento

Para rodar o projeto localmente, siga estes passos:

1.  **Pré-requisitos**: Certifique-se de ter o [Java 17](https://www.java.com/) e o [Maven](https://maven.apache.org/) instalados.
2.  **Instalação**:
    -   Clone o repositório:
        ```bash
        git clone [https://github.com/seu-usuario/MusicRadarAI.git](https://github.com/seu-usuario/MusicRadarAI.git)
        cd MusicRadarAI
        ```
    -   As dependências serão instaladas automaticamente pelo Maven na primeira execução.
3.  **Configuração da API**:
    -   Crie um arquivo `.env` na raiz do projeto.
    -   Adicione a sua chave da API da OpenAI (ou do LLM que você for usar):
        ```
        OPENAI_API_KEY=sua_chave_aqui
        ```
4.  **Execução do Servidor**: Para iniciar o servidor em modo de desenvolvimento, use o comando:
    ```bash
    ./mvnw spring-boot:run
    ```
    O servidor rodará em `http://localhost:8080`.

---

### 🇺🇸 English Version

## 🎶 About the Project

The **MusicRadarAI** is an innovative music recommendation system, where the backend, developed in **Java** with **Spring Boot WebFlux**, serves as the application's brain. The main goal is to create a service that manages a music catalog, and based on this collection, an **LLM** (Large Language Model) like OpenAI's suggests new, personalized music and artists.

The project uses a **reactive** and **non-blocking** architecture, ensuring the application can handle a large volume of requests efficiently, especially calls to the external LLM API, which can be time-consuming.

## ✨ Key Features

* 🎵 **Music Catalog**: The API allows adding, viewing, editing, and removing songs from the catalog.
* 🤖 **AI-Powered Recommendations**: The core of the application. Based on the list of songs in the catalog, the AI generates and returns a list of new suggestions.
* ⚡ **Reactive API**: Endpoints built with WebFlux for optimized performance and a fluid user experience.
* 💾 **In-Memory Database**: Uses the H2 database for simplicity and speed during development and testing, without the need for an external database setup.

## ⚙️ Project Architecture

The backend follows the Spring modular architecture pattern, with a special focus on reactive programming for data flow.

-   **`Controller`**: Receives non-blocking HTTP requests and forwards them to the service layer.
-   **`Service`**: Contains the business logic, including communication with the external LLM API and data persistence.
-   **`Repository`**: Interacts with the H2 database reactively, using `Mono` and `Flux` to abstract data access operations.
-   **`Entity` / `DTO`**: Structures the data for persistence and for transfer between layers, ensuring security and consistency.

## 💻 Technologies Used

* **Framework**: Spring Boot 3.5.4 (with WebFlux)
* **Language**: Java 17
* **Acesso a Dados**: Spring Data R2DBC
* **Database**: H2 Database (in-memory)
* **Dependency Management**: Maven
* **AI Integration**: OpenAI API (or similar)
* **Security**: Spring Security
* **Desenvolvimento**: Lombok

## 🚀 Getting Started

To run the project locally, follow these steps:

1.  **Prerequisites**: Make sure you have [Java 17](https://www.java.com/en/) and [Maven](https://maven.apache.org/) installed.
2.  **Installation**:
    -   Clone the repository:
        ```bash
        git clone [https://github.com/your-username/MusicRadarAI.git](https://github.com/your-username/MusicRadarAI.git)
        cd MusicRadarAI
        ```
    -   Dependencies will be automatically installed by Maven on the first run.
3.  **API Configuration**:
    -   Create a `.env` file in the project root.
    -   Add your OpenAI API key (or for the LLM you plan to use):
        ```
        OPENAI_API_KEY=your_key_here
        ```
4.  **Server Execution**: To start the server in development mode, use the command:
    ```bash
    ./mvnw spring-boot:run
    ```
    The server will run on `http://localhost:8080`.
