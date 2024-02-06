package com.srusu.designpatterns.behavioral.strategy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DesignPatternsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(AttackService attackService) {
        return args -> {
            attackService.invokeAttackFor(new Character(CharacterClass.MAGE));
        };
    }
}
