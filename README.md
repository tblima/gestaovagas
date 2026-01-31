# Gestão de Vagas

[![Java](https://img.shields.io/badge/Java-25-ED8B00?style=flat&logo=openjdk&logoColor=white)](#)
[![Spring](https://img.shields.io/badge/Spring%20MVC-%236DB33F.svg?style=flat&logo=spring&logoColor=white)](#)
[![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-%236DB33F.svg?style=flat&logo=spring&logoColor=white)](#)
[![Maven](https://img.shields.io/badge/Maven-3.x-C71A36?style=flat&logo=apachemaven&logoColor=white)](#)

Aplicação para **Gestão de Vagas**, construída com **Spring MVC** e **Spring Data JPA** (com imports **Jakarta**), usando **Lombok** e **Java 25**.

---

## Sumário

- [Visão geral](#visão-geral)
- [Stack](#stack)
- [Pré-requisitos](#pré-requisitos)
- [Estrutura do projeto](#estrutura-do-projeto)
- [English version](#english-version)

---

## Visão geral

O **Gestão de Vagas** expõe endpoints HTTP para criar, consultar e administrar dados relacionados a vagas e/ou candidaturas (conforme implementado no projeto).

**Principais objetivos:**
- Centralizar regras de negócio de vagas
- Persistir dados com JPA
- Expor API via Spring MVC

---

## Stack

- **Java 25**
- **Spring MVC**
- **Spring Data JPA**
- **Jakarta**
- **Lombok** 
- **Maven**
- **Docker**
- **PostgreSQL**

---

## Pré-requisitos

Para rodar localmente:

- **Java 25** instalado e configurado no `JAVA_HOME`
- **Docker** + **Docker Compose** para subir dependências
- Não precisa instalar Maven: o projeto inclui **Maven Wrapper** (`mvnw` / `mvnw.cmd`)

---

## Estrutura do projeto

Visão geral:

- `src/main/java`: código fonte
- `src/main/resources`: configurações, propriedades, etc.
- `src/test/java`: testes unitários
- `src/test/resources`: recursos para testes
- `pom.xml`: configuração do Maven
- `README.md`: documentação do projeto
- `docker-compose.yml`: configuração do Docker Compose (se aplicável)
- `.gitignore`: arquivos e diretórios ignorados pelo Git

---

## English version

<details>
  <summary><strong>Click to expand (English)</strong></summary>

  # Job Management

  A **Job Management** application built with **Spring MVC** and **Spring Data JPA** (using **Jakarta** imports), with **Lombok** and **Java 25**.

  ---

  ## Table of Contents

  - [Overview](#overview)
  - [Tech Stack](#tech-stack)
  - [Prerequisites](#prerequisites)
  - [Project Structure](#project-structure)

  ---

  ## Overview

  **Job Management** exposes HTTP endpoints to create, query, and manage data related to job positions and/or applications (as implemented in the project).

  **Main goals:**
  - Centralize job-related business rules
  - Persist data with JPA
  - Expose an API via Spring MVC

  ---

  ## Tech Stack

  - **Java 25**
  - **Spring MVC**
  - **Spring Data JPA**
  - **Jakarta**
  - **Lombok**
  - **Maven**
  - **Docker**
  - **PostgreSQL**

  ---

  ## Prerequisites

  To run locally:

  - **Java 25** installed and configured in `JAVA_HOME`
  - **Docker** + **Docker Compose** to start dependencies
  - No need to install Maven: the project includes **Maven Wrapper** (`mvnw` / `mvnw.cmd`)

  ---

  ## Project Structure

  High-level overview:

  - `src/main/java`: source code
  - `src/main/resources`: configuration, properties, etc.
  - `src/test/java`: unit tests
  - `src/test/resources`: test resources
  - `pom.xml`: Maven configuration
  - `README.md`: project documentation
  - `docker-compose.yml`: Docker Compose configuration (if applicable)
  - `.gitignore`: files and directories ignored by Git

</details>
