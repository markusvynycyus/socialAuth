# Social Authentication API

## Descrição
Este projeto é uma API de autenticação construída com **Spring Boot** e **PostgreSQL**. Ele permite aos usuários fazer login de duas maneiras:

1. **Login tradicional**: Autenticação com nome de usuário e senha cadastrados.
2. **Login com provedores externos**: Autenticação via **Google**, **Facebook**, **LinkedIn** e **Instagram** utilizando OAuth2.

Além da autenticação, a API implementa autorização baseada em permissões e funções (RBAC), utilizando JWT para gerenciar sessões autenticadas.

## Funcionalidades
- **Autenticação**:
  - Login tradicional com nome de usuário e senha.
  - Login via OAuth2 (Google, Facebook, LinkedIn, Instagram).
  - Geração e validação de JWT.
  
- **Autorização**:
  - Controle de acesso baseado em permissões.
  - Role-Based Access Control (RBAC).

## Tecnologias Utilizadas
- **Java 17+**
- **Spring Boot**
- **Spring Security**
- **OAuth2 Client**
- **PostgreSQL**
- **JWT (JSON Web Token)**

## Pré-requisitos
- **Java 17+**
- **Maven**
- **PostgreSQL**

## Configuração

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/socialAuth.git
