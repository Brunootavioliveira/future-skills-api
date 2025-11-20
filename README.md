# 🌐 FutureSkills API – Plataforma de Upskilling e Reskilling 2030+
### 🚀 Global Solution 2025 – O Futuro do Trabalho  
### 👨‍💻 Java 21 • Spring Boot 3.5.7 • MySQL 8.4

---

## 📘 1. Visão Geral do Projeto

O futuro do trabalho está sendo impactado por tecnologias como IA, automação, data analytics e ambientes híbridos. Cada vez mais, empresas demandam profissionais:

- em constante **aperfeiçoamento** (upskilling)  
- em **requalificação profissional** (reskilling)  
- com **competências digitais** e **habilidades humanas avançadas**  
- preparados para carreiras de **2030+**

Este projeto implementa uma **API RESTful** que oferece:

- Cadastro de usuários
- Cadastro de trilhas de aprendizagem
- Inscrição de usuários em trilhas (expansão futura)
- Validação, segurança, documentação e persistência em banco de dados

Conecta-se diretamente às ODS:
- **ODS 4 – Educação de Qualidade**  
- **ODS 8 – Trabalho Decente e Crescimento Econômico**  
- **ODS 9 – Inovação e Infraestrutura**  
- **ODS 10 – Redução das Desigualdades**

---

## 📌 2. Tecnologias Utilizadas

| Tecnologia | Versão |
|-----------|--------|
| **Java** | 21 |
| **Spring Boot** | 3.5.7 |
| Spring Web | ✔ |
| Spring Data JPA | ✔ |
| Spring Security (HTTP Basic) | ✔ |
| Lombok | ✔ |
| MySQL | 8.4 |
| Swagger (springdoc-openapi) | ✔ |

---

## 📁 3. Estrutura do Projeto

src/main/java/com/global_solution_app <br>
│<br>
├── controller<br>
│ ├── UsuarioController.java<br>
│ └── TrilhaController.java<br>
│<br>
├── dto<br>
│ ├── UsuarioDTO.java<br>
│ └── TrilhaDTO.java<br>
│<br>
├── entity
│ ├── Usuario.java<br>
│ └── Trilha.java<br>
│<br>
├── exception<br>
│ ├── ResourceNotFoundException.java<br>
│ └── GlobalExceptionHandler.java<br>
│<br>
├── repository<br>
│ ├── UsuarioRepository.java<br>
│ └── TrilhaRepository.java<br>
│<br>
├── service<br>
│ ├── UsuarioService.java<br>
│ └── TrilhaService.java<br>
│<br>
├── security<br>
│ └── SecurityConfig.java<br>
│<br>
└── GlobalSolutionAppApplication.java<br>


---

## 🛠️ 4. Como Executar o Projeto

### ✔ 4.1. Pré-requisitos

- Java 21 instalado  
- Maven instalado (ou wrapper do projeto)  
- MySQL 8+ instalado  
- IntelliJ (opcional, mas recomendado)

---

## 🗄️ 5. Configuração do Banco de Dados MySQL

### 🛢️ 5.1. Criar o banco

No terminal do MySQL rodar:

~~~sql
CREATE DATABASE global_solution;
~~~

## 6. Exemplos de Requisições (Postman / Insomnia / curl)
### GET – Listar usuários

~~~URL:

GET http://localhost:8080/api/usuarios
~~~

### GET – Buscar usuário por ID

~~~URL:

GET http://localhost:8080/api/usuarios/{id}
~~~

### POST – Criar usuário

~~~URL:

POST http://localhost:8080/api/usuarios
~~~

~~~Payload JSON:

{
  "nome": "Julia Souza",
  "email": "julia@email.com",
  "profissao": "Desenvolvedora"
}
~~~

### PUT – Atualizar usuário

~~~URL:

PUT http://localhost:8080/api/usuarios/{id}
~~~

### DELETE – Excluir usuário

~~~URL:

DELETE http://localhost:8080/api/usuarios/{id}
~~~

---

## 7. Documentação das APIs (Swagger)

#### O projeto inclui documentação automática com Swagger/OpenAPI.
#### Acesso ao Swagger UI

### Após iniciar a aplicação, acesse:
~~~
http://localhost:8080/swagger-ui.html
ou:
http://localhost:8080/swagger-ui/index.html
~~~
