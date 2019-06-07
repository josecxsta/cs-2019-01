package com.github.josecxsta.ufg.cs.aula08.domain;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


/**
 * Implementa métodos estáticos para verificar se um Arquivo
 * é ou não do formato JPEG.
 */
public class Arquivo {

    /**
     * Verifica se dado arquivo é JPEG através do conjunto dos primeiros
     * e dos últimos bytes do arquivo.
     * @param nomeArquivo nome/diretório do arquivo.
     * @return se arquivo é ou não um JPEG de acordo com seu conjunto
     * de bytes.
     */
    public static boolean ehJPEG(final String nomeArquivo) {
        primeiros2Bytes(nomeArquivo);
        ultimos2Bytes(nomeArquivo);

        //TO-DO: fix magic numbers
        final boolean primeirosBytesOk = primeiros2Bytes(nomeArquivo).equals("ffd8");
        final boolean ultimosBytesOk = ultimos2Bytes(nomeArquivo).equals("ffd9");

        return primeirosBytesOk && ultimosBytesOk;
    }

    /**
     * Busca os 2 últimos bytes de um arquivo em hexadecimal.
     * @param nomeArquivo nome/diretório do arquivo.
     * @return últimos 2 bytes do arquivo em hexadecimal.
     */
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

    /**
     * Busca os 2 primeiros bytes de um arquivo em hexadecimal.
     * @param nomeArquivo nome/diretório do arquivo.
     * @return primeiros 2 bytes do arquivo em hexadecimal.
     */
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

    /**
     * Transforma bytes em hexadecimais.
     * @param valorBytes valor em bytes.
     * @return valor em hexadecimal.
     */
    private static String bytesToHex(byte[] valorBytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : valorBytes) {
            sb.append(String.format("%02x", b));
        }

        return sb.toString();
    }

}