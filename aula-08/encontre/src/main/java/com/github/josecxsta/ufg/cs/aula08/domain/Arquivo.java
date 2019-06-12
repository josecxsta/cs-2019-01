package com.github.josecxsta.ufg.cs.aula08.domain;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Implementa os métodos estáticos para encontrar determinada sequência em um
 * arquivo de texto.
 */
public class Arquivo {

    /**
     * Número de vezes em que uma sequência foi encontrada no arquivo.
     */
    private int ocorrencias = 0;

    /**
     * Coleção de texto de cada ocorrência.
     */
    private ArrayList<String> textoOcorrencias
        = new ArrayList<String>();

    /**
     * Construtor da classe que faz chamada dos métodos necessários para
     * localização de sequência em arquivo de texto.
     * @param nomeArquivo caminho/nome do arquivo.
     * @param sequencia   sequência a ser encontrada.
     * @throws IOException caso haja problema com arquivo
     */
    public Arquivo(final String nomeArquivo, final String sequencia)
        throws IOException {
        ArrayList<String> linhas = textoArquivo(nomeArquivo);
        for (final String linha: linhas) {

            final int coluna = encontraSequencia(linha, sequencia);
            final boolean seqEncontrada = coluna > 0;
            final int numeroLinha = linhas.indexOf(linha);

            if (seqEncontrada) {
                this.ocorrencias++;
                this.textoOcorrencias
                    .add(montaTexto(numeroLinha, coluna, linha));
            }

        }

        System.out.println("Encontradas: " + this.ocorrencias);

        for (final String texto: this.textoOcorrencias) {
            System.out.println(texto);
        }
    }

    /**
     * Lê arquivo de texto e insere linhas em uma coleção de strings.
     *
     * @param nomeArquivo caminho para arquivo de texto.
     * @return vetor com texto do arquivo.
     * @throws IOException caso haja problema com arquivo
     */
    public final ArrayList<String> textoArquivo(final String nomeArquivo)
        throws IOException {

        final ArrayList<String> linhas = new ArrayList<String>();

        final FileInputStream fileStream = new FileInputStream(nomeArquivo);
        final InputStreamReader inSt = new
        InputStreamReader(fileStream, "UTF-8");
        final BufferedReader buffReader = new BufferedReader(inSt);

        String linha;
        while ((linha = buffReader.readLine()) != null) {
            linhas.add(linha);
        }

        buffReader.close();

        return linhas;
    }

    /**
     * Encontra o número da coluna em que se encontra a sequência
     * em determinada linha.
     * @param linha linha da sequência.
     * @param sequencia sequência de texto a ser encontrada.
     * @return coluna em que se encontra a sequência.
     */
    public final int encontraSequencia(final String linha,
                                        final String sequencia) {
        return linha.toLowerCase().indexOf(sequencia.toLowerCase());
    }

    /**
     * Monta o texto da linha no formado L[número linha] C[número linhas].
     * @param numeroLinha número da linha.
     * @param numeroColuna número da coluna.
     * @param textoLinha texto da linha.
     * @return texto no formato definido.
     */
    public final String montaTexto(final int numeroLinha,
    final int numeroColuna, final String textoLinha) {
        return "L" + numeroLinha + " C"
        + numeroColuna + ": " + textoLinha;
    }


}

