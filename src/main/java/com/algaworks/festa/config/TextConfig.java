package com.algaworks.festa.config;

import com.algaworks.festa.model.Convidado;
import com.algaworks.festa.repositoty.ConvidadosRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
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
