package com.github.josecxsta.ufg.cs.aula08.application;

import java.io.IOException;
import java.util.Scanner;
import com.github.josecxsta.ufg.cs.aula08.domain.Arquivo;

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
     *
     * @param args não utilizado
     */
    public static void main(final String args) {
        final Scanner escaner = new Scanner(System.in);

        System.out.println("Insira o endereço do arquivo de texto: ");
        final String arquivo = escaner.nextLine();

        System.out.println("Insira a sequência a ser localizada no arquivo: ");
        final String sequencia = escaner.nextLine();

        try {
            new Arquivo(arquivo, sequencia);
        } catch (IOException e) {
        }
        // new Arquivo("input/texto.txt", "bom");

        escaner.close();
    }
}
