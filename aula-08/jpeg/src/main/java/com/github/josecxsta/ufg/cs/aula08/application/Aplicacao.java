package com.github.josecxsta.ufg.cs.aula08.application;

import java.io.IOException;
import java.util.Scanner;
import com.github.josecxsta.ufg.cs.aula08.domain.ArquivoUtils;

/**
 * Implementa o método main do programa para verificar, através do Arquivo, se
 * um arquivo é ou não JPEG.
 */
public final class Aplicacao {

    /**
     * Para evitar instanciação.
     */
    private Aplicacao() {
    }

    /**
     * Método main.
     *
     * @param args não utilizado
     * @throws IOException se houver erro de entrada/saída.
     */
    public static void main(final String[] args) throws IOException {
        final Scanner escanner = new Scanner(System.in);
        System.out.println("Insira o endereço do arquivo: ");
        final boolean ehJPEG = ArquivoUtils.ehJPEG(escanner.nextLine());

        if (ehJPEG) {
            System.out.println("Arquivo selecionado é um JPEG");
        } else {
            System.out.println("Arquivo selecionado não é um JPEG");
        }

        // System.out.println(Arquivo.ehJPEG("input/is-she.jpg"));

        escanner.close();
    }
}
