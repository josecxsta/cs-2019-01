/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.josecxsta.ufg.cs.aula12.application.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Implementa o método main.
 */
@SpringBootApplication
public class Application {

    /**
     * Evita a instanciação.
     */
    private Application() {
    }

    /**
     * Método main da aplicação.
     * @param args utilizado na execução.
     */
    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
