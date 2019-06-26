package com.github.josecxsta.ufg.cs.aula09.application;

import java.io.IOException;

import com.github.josecxsta.ufg.cs.aula09.domain.ConversaoUseCase;

/**
*
*/
public final class Aplicacao {

    /**
    *
    */
    private Aplicacao() {
    }

    /**
    * Método principal da aplicação.
    * @param args não utilizado
    * @throws InterruptedException
    * @throws IOException
    */
    public static void main(final String args[]) {
        ConversaoUseCase.iniciarMonitoramento();
    }
}
