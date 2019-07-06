/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.josecxsta.ufg.cs.aula12.application.api;

import com.github.josecxsta.ufg.cs.aula12.domain.Numero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        Numero.porExtenso(350);
        SpringApplication.run(Application.class, args);
    }
}
