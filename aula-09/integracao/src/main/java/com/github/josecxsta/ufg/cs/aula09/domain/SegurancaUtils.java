package com.github.josecxsta.ufg.cs.aula09.domain;

import java.nio.charset.StandardCharsets;

import com.google.common.hash.Hashing;

/**
 * Implementa algoritmos de encriptação.
 */
public final class SegurancaUtils {

    /**
     * Previne a instanciação da classe.
     */
    private SegurancaUtils() {
    }

    /**
     * Encripta uma sequência com o algoritmo sha-256.
     *
     * @param sequencia sequencia a ser encriptada.
     * @return hash sha-256 da sequência.
     */
    public static String sha256(final String sequencia) {
        return Hashing.sha256()
            .hashString(sequencia, StandardCharsets.US_ASCII).toString();
    }

}
