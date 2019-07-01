package com.github.josecxsta.ufg.cs.aula09.application;

import com.github.josecxsta.ufg.cs.aula09.domain.ConversaoUseCase;

/**
 * Classe que implementa o método main.
 */
public final class Aplicacao {

    /**
     * Evita instanciação.
     */
    private Aplicacao() {
    }

    /**
     * Método principal da aplicação.
     *
     * @param args não utilizado
     */
    public static void main(final String[] args) {
        try {
            ConversaoUseCase.iniciarMonitoramento();
        } catch (Exception e) {
            System.exit(1);
        }
    }
}
