package com.github.josecxsta.ufg.cs.aula09.domain;

import java.nio.charset.StandardCharsets;

import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

/**
 * Implementa algoritmos de encriptação.
 */
public final class SegurancaUtils {


    /**
     * Hash function.
     */
    private static final HashFunction
    HASHFUNCTION = Hashing.sha256();

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
        final HashCode hcode = HASHFUNCTION
        .hashString(sequencia, StandardCharsets.US_ASCII);
        return hcode.toString();
    }

}
