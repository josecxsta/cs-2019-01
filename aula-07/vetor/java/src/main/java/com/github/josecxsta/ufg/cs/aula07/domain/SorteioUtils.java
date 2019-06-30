package com.github.josecxsta.ufg.cs.aula07.domain;

import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Classe que implementa o sorteio de números.
 */
public final class SorteioUtils {

    /**
     * Quantidade de vezes que será sorteado.
     */
    public static final int QUANTIDADE = 1000000;

    /**
     * Número máximo a ser sorteado.
     */
    public static final int MAXIMO = 1000;

    /**
     * Evita instanciação da classe.
     */
    private SorteioUtils() {
    }

    /**
    * Sortea aleatoriamente 1.000.000 de valores inteiros de 0 a 1000 e
    * identifica o número que mais foi sorteado.
    * Se mais de um número foi o “mais frequente”, então todos eles
    * deverão ser retornados (em uma coleção) juntamente com a quantidade
    * de vezes em que ocorrerão.
    * @return numero com mais repeticoes e quantidade de repeticoes
    */
    public static Entry<Integer, Integer> sorteio() {
        final Map<Integer, Integer> sorteados = new ConcurrentHashMap<>();
        for (int indice = 0; indice < QUANTIDADE; indice++) {
            final int numero = numeroAleatorio(0, MAXIMO);
            final Integer repeticoesNum = sorteados.get(numero);
            final boolean numInserido = repeticoesNum != null;
            if (numInserido) {
                sorteados.put(numero, repeticoesNum + 1);
            } else {
                sorteados.put(numero, 1);
            }

        }

        return sorteados.entrySet().stream()
        .max(Map.Entry.comparingByValue()).get();
    }


    /**
    * Calcula um numero aleatório entre um intervalo.
    * @param min início do intervalo.
    * @param max fim do intervalo.
    * @return numero aleatório.
    */
    public static int numeroAleatorio(final int min, final int max) {
        final Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

}
