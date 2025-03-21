# 🛒 Supermarket Cashier API

Sistema desenvolvido com Spring Boot que gerencia operações básicas de um caixa de supermercado, com autenticação segura, CRUD de funcionários, clientes, produtos e vendas.

## ⚙️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.x**
- **Spring Security** (Autenticação HTTP Basic)
- **Spring Data JPA**
- **Banco de Dados H2** (em memória)
- **Springdoc OpenAPI (Swagger)**
- **Lombok**

## 🚀 Principais Funcionalidades

- **Autenticação:**
  - Login seguro com autenticação HTTP Basic.

- **Gestão de Funcionários:**
  - Cadastro, listagem, e desativação de funcionários.

- **Gestão de Clientes:**
  - Cadastro e listagem de clientes, busca por CPF.

- **Gestão de Produtos:**
  - Cadastro e listagem de produtos.

- **Gestão de Vendas:**
  - Criação de vendas, adição de itens, e cálculo automático do total.

- **Gestão do Caixa:**
  - Abertura e fechamento de caixas.

- **Documentação Automática:**
  - Swagger disponível automaticamente para testes e documentação da API.

## 🔐 Segurança

A aplicação utiliza **Spring Security** com autenticação HTTP Basic para proteger todos os endpoints da API, exceto o login e recursos públicos como Swagger e H2.

## 🧑‍💻 Usuário Padrão

Ao iniciar a aplicação pela primeira vez, é automaticamente criado um usuário padrão:

| Campo | Valor      |
|-------|------------|
| Login | `admin`    |
| Senha | `admin123` |

## 🔨 Executando o Projeto

Clone o repositório:

```bash
git clone https://github.com/seu-usuario/supermarket-cashier.git
```

Navegue até o diretório:

```bash
cd supermarket-cashier
```

Execute com Maven:

```bash
./mvnw spring-boot:run
```

## 📚 Documentação da API (Swagger)

Acesse a documentação interativa Swagger após iniciar a aplicação:

[http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

## 🗃️ Console do Banco de Dados H2

Para acessar o banco de dados em memória:

[http://localhost:8080/h2-console](http://localhost:8080/h2-console)

| Campo    | Valor                        |
|----------|------------------------------|
| JDBC URL | `jdbc:h2:mem:supermercado`   |
| Usuário  | `sa`                         |
| Senha    | *(deixe em branco)*          |

## 🚧 Tratamento de Exceções

Todas as exceções são tratadas globalmente, com respostas padronizadas em formato JSON para melhor clareza e facilidade de debugging.

## 📦 Estrutura do Projeto

```
src
└── main
    └── java
        └── com
            └── example
                └── supermarketcashier
                    ├── config
                    ├── controller
                    ├── dto
                    ├── exception
                    ├── model
                    ├── repository
                    ├── service
                    └── SupermarketCashierApplication.java
```

🎯 - Este projeto foi desenvolvido para fins educacionais e práticos, demonstrando boas práticas de desenvolvimento backend com Spring Boot
   - Projeto baseado e desenvolvido a partir do material apresentado no bootcamp Decola Tech 2025 da plataforma DIO (Digital Inovation One).

