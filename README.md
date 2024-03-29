# Api Gestão de Convidados - java/Spring Boot

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Adriano1976/api-gestao-convidados-springboot/blob/master/LICENSE) 

## Por que devo trabalhar com o Framework Spring Boot?

Existem várias razões pelas quais você deve aprender a trabalhar com o Spring Boot, um dos frameworks mais populares para o desenvolvimento de aplicativos Java:

* Produtividade: O Spring Boot permite que você crie aplicativos Java de maneira rápida e fácil, com configuração mínima. Isso significa que você pode se concentrar no desenvolvimento de recursos de negócios em vez de configuração de infraestrutura.

* Flexibilidade: O Spring Boot é altamente flexível e pode ser facilmente integrado com outras tecnologias Java, como o Spring Framework, Hibernate, JPA, entre outros. Além disso, o Spring Boot suporta diferentes bancos de dados e sistemas operacionais.

* Eficiência: O Spring Boot é altamente otimizado para desempenho e escalabilidade, permitindo que seus aplicativos sejam executados rapidamente e gerenciem grandes volumes de dados.

* Segurança: O Spring Boot inclui várias funcionalidades de segurança, como autenticação e autorização, que ajudam a proteger seus aplicativos contra ameaças externas.

* Comunidade: O Spring Boot é um framework de código aberto com uma grande comunidade de desenvolvedores ativos. Isso significa que você pode encontrar muitos recursos, tutoriais e exemplos disponíveis online para ajudá-lo a aprender e desenvolver aplicativos.

Em resumo, aprender a trabalhar com o Spring Boot pode ajudá-lo a desenvolver aplicativos Java com facilidade, flexibilidade, eficiência e segurança, permitindo que você se concentre no desenvolvimento de recursos de negócios em vez de configuração de infraestrutura. Além disso, a comunidade ativa do Spring Boot oferece suporte e recursos valiosos para ajudá-lo a se tornar um desenvolvedor mais habilidoso.

## Sobre o Projeto

Gestão de Convidados é uma aplicação back End web e mobile construída seguindo as instruções da apostila Produtividade no Desenvolvimento de Aplicações Web com Spring Boot, sendo essa a 2ª Edição e foi organizados por [Normandes José Moreira Junior]( https://www.linkedin.com/in/normandesjr "Site LinkedIn") e [Alexandre Afonso](https://www.linkedin.com/in/alexandreafon "Site LinkedIn").

A aplicação consiste em uma lista de controle de convidados de festas e eventos, onde os dados são coletados, como nome, sobrenome e quantidades de acompanhantes, e depois são listados no app web. Porém, foram feitos algumas modificações para melhor explorar as possibilidades disponíveis e almentar a experiência com a api. Essas visualizações são possíveis por meio do Swagger e JavaDoc.

## Modelo conceitual das Dependências

![gestao-festa 1](https://user-images.githubusercontent.com/17755195/193862725-8d40379c-4074-4f53-b7f1-61f244cb9d29.png)

## Modelo conceitual UML

![gestao-festa 2](https://user-images.githubusercontent.com/17755195/193863043-3b972491-3b3e-4210-b9b2-130cdaf50393.png)

## Documentação JavaDoc

Caso queira navegar e conhecer a extrutura do projeto, basta usar os recursos disponíveis pelo java doc por meio do link disponibilizado para que você posso já ter uma experiência com o projeto antes mesmo de instalar em sua máquina.

![documentação gestão de festa javadoc](https://user-images.githubusercontent.com/17755195/193870848-7341ee92-fc6c-4d51-9764-3f3b0d75036d.png)
* https://adriano1976.github.io/gestao-de-festa-javadoc/

# Tecnologias utilizadas
- Intellij Ide
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

Swagger é uma ferramenta de software livre para documentar e testar APIs RESTful. Aprender a trabalhar com Swagger pode trazer vários benefícios, como:

* Documentação clara e precisa: O Swagger permite que você crie uma documentação clara e precisa para sua API RESTful, incluindo informações sobre recursos, parâmetros e respostas de API. Isso torna mais fácil para outros desenvolvedores entenderem sua API e usá-la corretamente.

* Testes de API automatizados: O Swagger permite testar sua API RESTful de forma automatizada, poupando tempo e esforço ao permitir testar o comportamento da API, testes de integração, entre outros.

* Padronização: O Swagger ajuda a padronizar a documentação e o teste da sua API, o que pode tornar mais fácil para outros desenvolvedores trabalhar em sua API e evitar erros comuns.

* Integração com outras ferramentas: O Swagger pode ser facilmente integrado com outras ferramentas de desenvolvimento, como frameworks de teste automatizado, gerenciamento de dependências e automação de compilação.

* Comunidade: A ferramenta Swagger tem uma grande comunidade de usuários e desenvolvedores, o que significa que você pode encontrar muitos recursos, tutoriais e exemplos online para ajudá-lo a aprender e usar a ferramenta.

Em resumo, aprender a trabalhar com o Swagger pode ajudá-lo a documentar e testar suas APIs RESTful de maneira mais clara, precisa e padronizada, o que pode tornar mais fácil para outros desenvolvedores trabalharem em sua API e evitar erros comuns. Além disso, a comunidade ativa do Swagger oferece suporte e recursos valiosos para ajudá-lo a se tornar um desenvolvedor mais habilidoso.

Vejamos que depois de executar o projeto via terminal ou via IDE, você poderá fazer os testes com os recursos disponibilizados pelo Swagger de acordo com o projeto atual.

![gestao-festa - swagger-ui](https://user-images.githubusercontent.com/17755195/193941528-027f6b9b-8a0f-4f62-ad84-a51f43bd584b.png)

* http://localhost:8080/swagger-ui.html

# Autor do Projeto

Adriano Santos

https://www.linkedin.com/in/adrianosantos-dev/

<hr>

<div align="center">
<br><p align="centre"><b>Contagem de visitantes</b></p>  
<p align="center"><img align="center" src="https://profile-counter.glitch.me/{api-gestao-convidados-springboot}/count.svg" /></p> 
<br>  

<img width=100% src="https://capsule-render.vercel.app/api?type=waving&color=87CEFA&height=120&section=footer"/>**** 
</div>
