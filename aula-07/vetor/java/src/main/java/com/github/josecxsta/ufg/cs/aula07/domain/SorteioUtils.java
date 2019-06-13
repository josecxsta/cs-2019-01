package com.github.josecxsta.ufg.cs.aula07.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

/**
 *
 */
public final class SorteioUtils {

    /**
     *
     */
    public final static int QUANTIDADE = 1000000;

    /**
     *
     */
    public final static int MAXIMO = 1000;

    /**
    * Sortea aleatoriamente 1.000.000 de valores inteiros de 0 a 1000 e
    * identifica o número que mais foi sorteado.
    * Se mais de um número foi o “mais frequente”, então todos eles
    * deverão ser retornados (em uma coleção) juntamente com a quantidade
    * de vezes em que ocorrerão.
    * @return numero com mais repeticoes e quantidade de repeticoes
    */
    public static Entry<Integer, Integer> sorteio() {
        final int quantidade = QUANTIDADE;
        final int numeroMaximo = MAXIMO;
        final Map<Integer, Integer> sorteados = new HashMap<>();
        for (int indice = 0; indice < quantidade; indice++) {
            int numero = numeroAleatorio(0, numeroMaximo);
            final Integer repeticoesNum = sorteados.get(numero);
            final boolean numInserido = repeticoesNum != null;
            if (!numInserido) {
                sorteados.put(numero, 1);
            } else {
                sorteados.put(numero, repeticoesNum + 1);
            }

        }

        Entry<Integer, Integer> sorteadosEmOrdem = sorteados.entrySet()
        .stream().max(Map.Entry.comparingByValue()).get();

        return sorteadosEmOrdem;
    }


    /**
    * Calcula um numero aleatório entre um intervalo.
    * @param min início do intervalo.
    * @param max fim do intervalo.
    * @return numero aleatório.
    */
    public static int numeroAleatorio(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

}