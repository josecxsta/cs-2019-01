package com.github.josecxsta.ufg.cs.aula08.application;

import java.util.Scanner;
import com.github.josecxsta.ufg.cs.aula08.domain.Arquivo;

/**
 * Implementa o método main do programa para verificar,
 * através do Arquivo, se um arquivo é ou não JPEG.
 */
class Aplicacao {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o endereço do arquivo: ");
        boolean ehJPEG = Arquivo.ehJPEG(sc.nextLine());

        if (ehJPEG) {
            System.out.println("Arquivo selecionado é um JPEG");
        } else {
            System.out.println("Arquivo selecionado não é um JPEG");
        }

        // System.out.println(Arquivo.ehJPEG("input/is-she.jpg"));

        sc.close();
    }
}