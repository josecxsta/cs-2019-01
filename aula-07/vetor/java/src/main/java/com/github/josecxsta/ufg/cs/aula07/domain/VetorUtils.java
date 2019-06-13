package com.github.josecxsta.ufg.cs.aula07.domain;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
* Implementa métodos estáticos para manipulação de vetores
*/
public final class VetorUtils {

    /**
    * Evita instanciação da classe.
    */
    private VetorUtils() {
    }

    /**
    * Retorna a quantidade de elementos do vetor recebido como primeiro argumento
    * cujos valores são iguais ao valor do segundo argumento fornecido.
    * @param vetor1 primeiro vetor
    * @param vetor2 segundo vetor
    * @return coleção de valores em comuns entre os vetores
    */
    public static String[] comparaVetores(String[] vetor1, String[] vetor2) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(vetor1));
        hashSet.retainAll(Arrays.asList(vetor2));
        String[] intersection = {};
        intersection = hashSet.toArray(intersection);

        return intersection;
    }

    /**
    * Encontra a menor temperatura em um vetor de valores recebido como argumento.
    * @param temperaturas vetor de valores
    * @return menor valor no vetor
    */
    public static double menorTemperatura(double[] temperaturas) {
        double minValue = temperaturas[0];
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] < minValue) {
                minValue = temperaturas[i];
            }
        }

        return minValue;
    }

    /**
    * Localiza a palavra mais frequente em uma sequência de caracteres.
    * @param frase frase em que a palavra será localizada.
    * @return palavra mais frequente.
    */
    public static String palavraMaisFrequente(String frase) {
        String[] palavras = frase.split(" ");
        HashMap<String, Integer> repeticoes = new HashMap<>();
        for (String palavra: palavras) {
            final Integer repeticoesPalavra = repeticoes.get(palavra);
            if (repeticoesPalavra == null) {
                repeticoes.put(palavra, 1);
            } else {
                repeticoes.put(palavra, repeticoesPalavra + 1);
            }
        }

        Entry<String, Integer> palavra = repeticoes.entrySet()
        .stream().max(Map.Entry.comparingByValue()).get();

        return palavra.getKey();
    }

    /**
    * Retorna a quantidade de veze que cada uma das
    letras presentes em uma sequência de caracteres aparece.
    * @param sequencia
    * @return quantidade de letras
    */
    public static HashMap<Character, Integer> quantidadeLetras(String sequencia) {

        HashMap<Character, Integer> quantidade = new HashMap<>();
        for (int index = 0; index < sequencia.length(); index++) {
            final String sequenciaMinuscula = sequencia.toLowerCase();
            final Character letra = sequenciaMinuscula.charAt(index);
            final Integer repLetra = quantidade.get(letra);
            final boolean ehLetra = letra >= 'a' && letra <='z';
            final boolean letraInserida = repLetra != null;

            if (!ehLetra) {
                continue;
            }

            if (!letraInserida) {
                quantidade.put(letra, 1);
            } else {
                quantidade.put(letra, repLetra + 1);
            }
        }

        return quantidade;
    }

    /**
    * Retorna a soma de números ímpares contidos em um vetor de inteiros.
    * @param numerosInteiros vetor de números inteiros
    * @return soma dos números ímpares
    */
    public static int somaNumerosImpares(int[] numerosInteiros) {
        List<Integer> list = Arrays.stream(numerosInteiros).boxed().collect(Collectors.toList());
        final Stream<Integer> impares = list.stream()
        .filter(x -> ehImpar(x));
        return impares.reduce(0, (x,y) -> x + y);
    }

    /**
    * Verifica se número é ímpar
    * @param numero
    * @return se é ímpar
    */
    public static boolean ehImpar(final int numero) {
        return numero % 2 != 0;
    }

}