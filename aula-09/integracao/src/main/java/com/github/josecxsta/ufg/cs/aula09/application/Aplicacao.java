package com.github.josecxsta.ufg.cs.aula09.application;

import java.io.IOException;

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
     * @param args não utilizado
     * @throws InterruptedException se houver interrupção
     * @throws IOException se houver erro de entrada/saída
     */
    public static void main(final String[] args)
    throws InterruptedException, IOException {
        ConversaoUseCase.iniciarMonitoramento();
    }
}
