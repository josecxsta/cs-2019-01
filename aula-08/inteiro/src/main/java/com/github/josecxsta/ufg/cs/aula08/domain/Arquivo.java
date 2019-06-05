package com.github.josecxsta.ufg.cs.aula08.domain;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arquivo {

    private static String bytesToHex(byte[] hashInBytes) {

        StringBuilder sb = new StringBuilder();
        for (byte b : hashInBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();

    }

    public static String inteiro32Bits(final String nomeArquivo) {
        byte[] bs = new byte[4];

        try {
            FileInputStream fis = new FileInputStream(nomeArquivo);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);

            fis.read(bs, 0, 4);

            br.close();
        } catch (Exception error) {
            System.out.println(error);
        }

        return bytesToHex(bs);
    }

}