package com.github.josecxsta.ufg.cs.aula08.domain;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.validation.Path;

public class Arquivo {

    private static String bytesToHex(byte[] hashInBytes) {

        StringBuilder sb = new StringBuilder();
        for (byte b : hashInBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();

    }

    public static boolean ehJPEG(final String nomeArquivo) {

        primeiros2Bytes(nomeArquivo);
        ultimos2Bytes(nomeArquivo);

        final boolean primeirosBytesOk = primeiros2Bytes(nomeArquivo).equals("ffd8");
        final boolean ultimosBytesOk = ultimos2Bytes(nomeArquivo).equals("ffd9");

        return primeirosBytesOk && ultimosBytesOk;
    }


    public static String ultimos2Bytes(final String nomeArquivo) {

        java.nio.file.Path logPath = Paths.get(nomeArquivo);
        ByteBuffer buffer = ByteBuffer.allocate(2);

        try {
            FileChannel channel = FileChannel.open(logPath, StandardOpenOption.READ);
            channel.read(buffer, channel.size() - 2);
            channel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return bytesToHex(buffer.array());
    }

    public static String primeiros2Bytes(final String nomeArquivo) {

        byte[] bs = new byte[2];

        try {
            FileInputStream fis = new FileInputStream(nomeArquivo);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            fis.read(bs, 0, 2);
            fis.close();
            isr.close();
        } catch (Exception error) {
            System.out.println(error);
        }

        return bytesToHex(bs);
    }

}