# Gestao de Convidado

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Adriano1976/api-gestao-convidados-springboot/blob/master/LICENSE) 

# Sobre o projeto

Gestão de Convidados é uma aplicação back End web e mobile construída seguindo as instruções da apostila Produtividade no Desenvolvimento de Aplicações Web com Spring Boot, sendo essa a 2ª Edição e foi organizados por [Normandes José Moreira Junior]( https://www.linkedin.com/in/normandesjr "Site LinkedIn") e [Alexandre Afonso](https://www.linkedin.com/in/alexandreafon "Site LinkedIn").

A aplicação consiste em uma lista de controle de convidados de festas e eventos, onde os dados são coletados, como nome, sobrenome e quantidades de acompanhantes, e depois são listados no app web. Porém, foram feitos algumas modificações para melhor explorar as possibilidades disponíveis e almentar a experiência com a api. Essas visualizações são possíveis por meio do Swagger e JavaDoc.

## Modelo conceitual das Dependências

![gestao-festa 1](https://user-images.githubusercontent.com/17755195/193862725-8d40379c-4074-4f53-b7f1-61f244cb9d29.png)

## Modelo conceitual UML

![gestao-festa 2](https://user-images.githubusercontent.com/17755195/193863043-3b972491-3b3e-4210-b9b2-130cdaf50393.png)

## Documentação JavaDoc

![documentação gestão de festa javadoc](https://user-images.githubusercontent.com/17755195/193870848-7341ee92-fc6c-4d51-9764-3f3b0d75036d.png)
* https://adriano1976.github.io/gestao-de-festa-javadoc/

# Tecnologias utilizadas
- Java
- Spring Boot
- Spring Web
- Spring Devtools
- JPA / Hibernate
- H2
- Postgresql
- Thymeleaf
- Webjars / Bootstrap / Webjars-locator
- Swagger-ui / Suagger2
- HTML / CSS
- Maven

# Como executar o projeto

## Back end
Pré-requisitos: Java 17

```bash
# Clonar repositório
git clone https://github.com/Adriano1976/api-gestao-convidados-springboot.git

# Entrar na pasta do projeto gestao-festa
cd backend

# Executar o Projeto
./mvnw spring-boot:run
```

```bash
# Instalar dDpendências
yarn install

# Executar o Projeto
yarn start
```

# Front End com Swagger

Depois de executar o projeto via terminal ou via IDE, você poderá fazer os testes com os recursos disponibilizados pelo Swagger de acordo com o projeto atual.

* http://localhost:8080/swagger-ui.html

# Autor

Adriano Santos

https://www.linkedin.com/in/adrianosantos-dev/
