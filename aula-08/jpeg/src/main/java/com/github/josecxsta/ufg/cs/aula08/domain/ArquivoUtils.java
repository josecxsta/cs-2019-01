package com.github.josecxsta.ufg.cs.aula08.domain;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Implementa métodos estáticos para verificar se um Arquivo é ou não do formato
 * JPEG.
 */
public final class ArquivoUtils {

    /**
     * Previne a instanciação da classe.
     */
    private ArquivoUtils() {
    }

    /**
     * Verifica se dado arquivo é JPEG através do conjunto dos primeiros e dos
     * últimos bytes do arquivo.
     *
     * @param nomeArquivo nome/diretório do arquivo.
     * @return se arquivo é ou não um JPEG de acordo com seu conjunto de bytes.
     * @throws IOException
     */
    public static boolean ehJPEG(final String nomeArquivo) throws IOException {
        final boolean primeirosBytesOk = primeiros2Bytes(nomeArquivo).equals("ffd8");
        final boolean ultimosBytesOk = ultimos2Bytes(nomeArquivo).equals("ffd9");

        return primeirosBytesOk && ultimosBytesOk;
    }

    /**
     * Busca os 2 últimos bytes de um arquivo em hexadecimal.
     * @param nomeArquivo nome/diretório do arquivo.
     * @return últimos 2 bytes do arquivo em hexadecimal.
     * @throws IOException
     */
    public static String ultimos2Bytes(final String nomeArquivo)
        throws IOException {

        final java.nio.file.Path logPath = Paths.get(nomeArquivo);
        final ByteBuffer buffer = ByteBuffer.allocate(2);

        final FileChannel channel = FileChannel
        .open(logPath, StandardOpenOption.READ);
        channel.read(buffer, channel.size() - 2);
        channel.close();

        return bytesToHex(buffer.array());
    }

    /**
     * Busca os 2 primeiros bytes de um arquivo em hexadecimal.
     *
     * @param nomeArquivo nome/diretório do arquivo.
     * @return primeiros 2 bytes do arquivo em hexadecimal.
     * @throws IOException
     */
    public static String primeiros2Bytes(final String nomeArquivo)
        throws IOException {
        final byte[] bs = new byte[2];

        final FileInputStream fis = new FileInputStream(nomeArquivo);
        final InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        fis.read(bs, 0, 2);
        fis.close();
        isr.close();

        return bytesToHex(bs);
    }

    /**
     * Transforma bytes em hexadecimais.
     * @param valorBytes valor em bytes.
     * @return valor em hexadecimal.
     */
    private static String bytesToHex(final byte[] valorBytes) {
        final StringBuilder stringBuild = new StringBuilder();
        for (final byte b : valorBytes) {
            stringBuild.append(String.format("%02x", b));
        }

        return stringBuild.toString();
    }

}
