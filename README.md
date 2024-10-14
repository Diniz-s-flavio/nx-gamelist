# NeeX GameList API

Essa é uma API Spring Boot, com foco em recursos REST para uma listar jogos em que se pode ordenar o jogos como quiser, 
sendo possivel o realizar  com Drag-and-Drop.
Desenvolvido em Spring Boot, utilizando Java 17, foi implementada uma API RESTful, com tratamentos de erros de forma simples
e especificada, realização de operações POST, DELETE, GET, PUT, PATCH e retorno de códigos de status apropriados. Também foi
utilizado o LOMBOK visando reduzir o boilerplate.
Foram explorados a utilização da especificação Bean Validation para criação de Annotations e customização de validadores e
a configuração de Internacionalização.

## Tecnologias Utilizadas

- Java 17
- Padrão MVC
- Spring Boot
- LOMBOK
- H2 DataBase
- PostGressSQL
- Padrão DTO

## Recursos e Funcionalidades

- **CRUD de Jogos:** Adicione, atualize, consulte e exclua jogos.

## Configuração do Ambiente

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/Diniz-s-flavio/nx-gamelist
   ```

2. **Compilação e Execução:**

   ```shell
   mvn spring-boot:run
   ```

## Teste da API

Os testes foram realizado pelo JUnit e Postman.

## Endpoints da API

Para testar a API adentre pela URL: http://localhost:8080/ o Guia de End-Points pelo Swagger-UI deve ser implementado em breve.


## Contato

Se você tiver alguma dúvida ou sugestão, sinta-se à vontade para entrar em contato:

- Nome: Flávio Diniz de Sousa
- Email: dinizdesousaflavio@gmail.com
- LinkedIn: https://www.linkedin.com/in/flavio-diniz-de-sousa-bb7729259/