/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.josecxsta.ufg.cs.aula12.application.console;

import com.github.josecxsta.ufg.cs.aula12.domain.Numero;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Programa que exibe o número em extenso
 * para determinado número.
 *
 */
public final class ProgramaNumero {

    private static final Logger logger =
            LogManager.getLogger(ProgramaNumero.class);

    /**
     * Restringe criação de instância.
     */
    private ProgramaNumero() {
        // Apenas evita criação de instância.
    }

    /**
     * Ponto de entrada da aplicação. Apenas para ilustrar
     * chamada de método.
     *
     * @param args Ignorados.
     */
    public static void main(final String[] args) {

        logger.info("iniciado");
        System.out.println(Numero
                .porExtenso(2));

    }

}
