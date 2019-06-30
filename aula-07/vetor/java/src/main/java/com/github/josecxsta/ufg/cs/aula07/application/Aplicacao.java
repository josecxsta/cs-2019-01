package com.github.josecxsta.ufg.cs.aula07.application;

import com.github.josecxsta.ufg.cs.aula07.domain.SorteioUtils;

/**
 * Implementa o método main da aplicação.
 */
public final class Aplicacao {

    /**
     * Para evitar instanciação.
     */
    private Aplicacao() {
    }

    /**
     * Método main.
     * @param args não utilizado.
     */
    public static void main(final String[] args) {
        SorteioUtils.sorteio();
    }
}
