package com.github.josecxsta.ufg.cs.aula08.domain;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Manipula arquivo.
 */
public final class Arquivo {

    /**
     * Quantidade de bytes.
     */
    public static final int NUM_BYTES = 4;

    /**
     * Evita a instanciação.
     */
    private Arquivo() {
    }

    /**
     * Converte bytes em hexadecimal.
     * @param hashInBytes bytes
     * @return sequência contendo o hexadecimal
     */
    private static String bytesToHex(final byte[] hashInBytes) {
        final StringBuilder sequencia = new StringBuilder();
        for (final byte b : hashInBytes) {
            sequencia.append(String.format("%02x", b));
        }
        return sequencia.toString();
    }

    /**
     * Obtém os primeiros 4 bytes de um arquivo em
     * um inteiro de 32 bits.
     * @param nomeArquivo caminho do arquivo.
     * @return inteiro de 32 bits.
     */
    public static String inteiro32Bits(final String nomeArquivo) {
        final byte[] bytes = new byte[NUM_BYTES];

        try {
            final FileInputStream fileInput =
                new FileInputStream(nomeArquivo);
            final InputStreamReader inputStream =
                new InputStreamReader(fileInput, "UTF-8");
            final BufferedReader buff =
                new BufferedReader(inputStream);

            fileInput.read(bytes, 0, NUM_BYTES);
            buff.close();
        } catch (Exception error) {
            System.out.println("Erro");
        }

        return bytesToHex(bytes);
    }

}
