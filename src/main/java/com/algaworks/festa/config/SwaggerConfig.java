package com.algaworks.festa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Classe responsável por habilitar o Swagger na aplicação.
 * A anotação @EnableSwagger2 é responsável em informar ao Spring Boot para ativar o Swagger.
 * A anotação @EnableWebMvc é responsável por habilitar o processo MVC.
 */
@Configuration
@EnableWebMvc
@EnableSwagger2
public class SwaggerConfig implements WebMvcConfigurer {

    /**
     * Método responsável por controlar e configurar os caminhos do Swegger.
     *
     * @param registry Objeto responsável em receber e manipular os dados da configuração do Swagger.
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry
                .addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry
                .addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

    /**
     * Método responsável por definir os aspécitos dos endpoints expostos por ele.
     *
     * @return Retorna as configurações predefinidas e a url "/swagger-ui.html".
     */
    @Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.algaworks.festa.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * Método responsável por controlar, configurar e adicionar algumas informações da api.
     * @return Retorna as informações da api.
     */
    private ApiInfo getApiInfo() {

        return new ApiInfoBuilder()
                .title("Spring Boot REST API - Lista de Convidados")
                .description("Um exemplo de aplicação Spring Boot REST API")
                .version("1.0.0")
                .license("Apache License Version 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
                .contact(new Contact("Adriano Santos", "https://github.com/Adriano1976", "adrianosantos.git@gmail.com"))
                .build();
    }
}


