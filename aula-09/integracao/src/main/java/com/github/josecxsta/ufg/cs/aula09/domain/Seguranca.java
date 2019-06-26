package com.github.josecxsta.ufg.cs.aula09.domain;

import java.nio.charset.StandardCharsets;

import com.google.common.hash.Hashing;

/**
 *
 */
public class Seguranca {

    /**
     *
     */
    public final static String sha256(byte[] notaFiscal){
        return Hashing.sha256()
            .hashString(new String(notaFiscal), StandardCharsets.US_ASCII)
            .toString();
    }

}