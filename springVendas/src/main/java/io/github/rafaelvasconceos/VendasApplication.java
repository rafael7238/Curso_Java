package io.github.rafaelvasconceos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages = {"io.github.rafaelvasconceos","com.umaoutrabibliotexa.projeto"})
//Escaneia os pacotes que não estão dentro do pacote atual
@RestController
public class VendasApplication {

    @Autowired
    @Qualifier("outraConfiguracao")
    private String outraConfiguracao;

    @Value("${application.name}")
    private String applicationName;

    @GetMapping("/hello")
    public String helloWorld() {
        return applicationName;
    }

    @GetMapping("/outra")
    public String outraConfiguracao() {
        return outraConfiguracao;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}