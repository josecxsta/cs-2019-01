package com.github.josecxsta.ufg.cs.aula08.domain;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 */
public class Arquivo {

    private int ocorrencias = 0;
    private ArrayList<String> textoOcorrencias = new ArrayList<String>();

    /**
     *
     */
    public Arquivo(final String nomeArquivo, final String sequencia) {

        ArrayList<String> linhas = textoArquivo(nomeArquivo);

        for (String linha : linhas) {

            final int coluna = encontraSequencia(linha, sequencia);
            final boolean sequenciaEncontrada = coluna > 0;
            final int numeroLinha = linhas.indexOf(linha);

            if (sequenciaEncontrada) {
                this.ocorrencias++;
                this.textoOcorrencias.add(montaTexto(numeroLinha, coluna, linha));
            }

        }

        System.out.println("Encontradas: " + this.ocorrencias);

        for (String texto : this.textoOcorrencias) {
            System.out.println(texto);
        }

    }

    /**
     *
     * @param nomeArquivo
     * @return
     */
    public ArrayList<String> textoArquivo(final String nomeArquivo){

        ArrayList<String> linhas = new ArrayList<String>();

        try {

            final FileInputStream fileStream = new FileInputStream(nomeArquivo);
            final InputStreamReader inputStream = new InputStreamReader(fileStream, "UTF-8");
            final BufferedReader buffReader = new BufferedReader(inputStream);

            String linha;
            while ((linha = buffReader.readLine()) != null) {
                linhas.add(linha);
            }

            buffReader.close();

        } catch (Exception e) {
            linhas.clear();
        }

        return linhas;

    }

    /**
     *
     * @param linha
     * @param sequencia
     * @return
     */
    public int encontraSequencia(final String linha, final String sequencia) {
        return linha.toLowerCase().indexOf(sequencia.toLowerCase());
    }

    /**
     *
     * @param numeroLinha
     * @param numeroColuna
     * @param textoLinha
     * @return
     */
    public String montaTexto(final int numeroLinha,
    final int numeroColuna, final String textoLinha) {

        final String texto = "L" + numeroLinha + " C" +
        numeroColuna + ": " + textoLinha;

        return texto;
    }


}