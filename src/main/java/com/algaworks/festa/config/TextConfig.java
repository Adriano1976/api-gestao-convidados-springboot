package com.algaworks.festa.config;

import com.algaworks.festa.model.Convidado;
import com.algaworks.festa.repositoty.ConvidadosRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

/**
 * Classe responsável por fazer os testes de Mostrar, Inserir, Alterar e Apagar os dados
 * conforme a base de dados seguindo a anotação @Profile("dev" ou "test" ou "prod").
 */
@Configuration
@Profile("dev")
public class TextConfig implements CommandLineRunner {

    @Autowired
    private ConvidadosRepositoty convidadosRepositoty;

    @Override
    public void run(String... args) throws Exception {
        Convidado convidado = new Convidado(null, "Roberto", "dos Santos", 2);
        Convidado convidado1 = new Convidado(null, "Marcos Gomes", "Gama", 0);
        Convidado convidado2 = new Convidado(null, "Adriano", "Santos", 4);
        Convidado convidado3 = new Convidado(null, "Josevaldo", "Rodrigues", 9);
        Convidado convidado4 = new Convidado(null, "Karla", "dos Santos", 2);

        convidadosRepositoty.saveAll(Arrays.asList(convidado, convidado1, convidado2, convidado3, convidado4));

    }
}
