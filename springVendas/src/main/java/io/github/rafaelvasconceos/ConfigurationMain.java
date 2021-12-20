package io.github.rafaelvasconceos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration

public class ConfigurationMain {
    @Bean(name = "outraConfiguracao")
    public String outraConfiguracao(){
        return "Outras Vendas";
    }
}
