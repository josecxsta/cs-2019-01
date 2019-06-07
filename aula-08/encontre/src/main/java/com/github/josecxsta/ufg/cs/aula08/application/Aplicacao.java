package com.github.josecxsta.ufg.cs.aula08.application;

import java.util.Scanner;
import com.github.josecxsta.ufg.cs.aula08.domain.Arquivo;

/**
 *
 */
public class Aplicacao {

    /**
     *
     */
    public static void main(String args[]) {
        final Scanner escaner = new Scanner(System.in);

        System.out.println("Insira o endereço do arquivo de texto: ");
        final String arquivo = escaner.nextLine();

        System.out.println("Insira a sequência a ser localizada no arquivo: ");
        final String sequencia = escaner.nextLine();

        new Arquivo(arquivo, sequencia);
        // new Arquivo("input/texto.txt", "bom");

        escaner.close();
    }
}