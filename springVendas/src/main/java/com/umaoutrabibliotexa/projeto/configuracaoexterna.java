package com.umaoutrabibliotexa.projeto;

import io.github.rafaelvasconceos.Development;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;



@Development
public class configuracaoexterna {
    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("Rodando a Configuração de Desenvolvimento");
        };
    }
}
