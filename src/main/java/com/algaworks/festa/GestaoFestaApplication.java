package com.algaworks.festa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe responsavel pelo ponto de partida para a procura dos demais componentes da aplicação.
 * A anotacao @SpringBootApplication informa que a classe faz parte da configuração do Spring.
 */
@SpringBootApplication
public class GestaoFestaApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestaoFestaApplication.class, args);
    }
}
