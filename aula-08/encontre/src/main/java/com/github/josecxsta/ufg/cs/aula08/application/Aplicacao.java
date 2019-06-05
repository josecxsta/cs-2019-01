package com.github.josecxsta.ufg.cs.aula08.application;

import java.util.Scanner;

import com.github.josecxsta.ufg.cs.aula08.domain.Arquivo;


class Aplicacao {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o endereço do arquivo de texto: ");
        final String arquivo = sc.nextLine();

        System.out.println("Insira a sequência a ser localizada no arquivo: ");
        final String sequencia = sc.nextLine();

        new Arquivo(arquivo, sequencia);
        // new Arquivo("input/texto.txt", "bom");

        sc.close();
    }
}