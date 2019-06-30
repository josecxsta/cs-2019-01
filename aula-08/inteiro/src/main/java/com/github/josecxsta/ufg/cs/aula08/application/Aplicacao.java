package com.github.josecxsta.ufg.cs.aula08.application;

import java.util.Scanner;
import com.github.josecxsta.ufg.cs.aula08.domain.Arquivo;

/**
 * Implementa o método main.
 */
public final class Aplicacao {

    /**
     * Evita a instanciação.
     */
    private Aplicacao() {
    }

    /**
     * Método main.
     * @param args não utilizado
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o endereço do arquivo: ");
        System.out.println(Arquivo.inteiro32Bits(sc.nextLine()));
        sc.close();
    }
}
