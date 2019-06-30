package com.github.josecxsta.ufg.cs.aula07.domain;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
* Implementa métodos estáticos para manipulação de vetores.
*/
public final class VetorUtils {

    /**
    * Evita instanciação da classe.
    */
    private VetorUtils() {
    }

    /**
    * Quantidade de elementos do vetor recebido como 1º argumento
    * cujos valores são iguais ao valor do segundo argumento fornecido.
    * @param vetor1 primeiro vetor
    * @param vetor2 segundo vetor
    * @return coleção de valores em comuns entre os vetores
    */
    public static String[] comparaVetores(final String[] vetor1,
    final String... vetor2) {
        final HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(vetor1));
        hashSet.retainAll(Arrays.asList(vetor2));
        final String[] intersection = {};

        return hashSet.toArray(intersection);
    }

    /**
     * Encontra a menor temperatura em um vetor de valores
     * recebido como argumento.
     * @param temperaturas vetor de valores
     * @return menor valor no vetor
     */
    public static double menorTemperatura(final double... temperaturas) {
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
    public static String palavraMaisFrequente(final String frase) {
        final String[] palavras = frase.split(" ");
        final HashMap<String, Integer> repeticoes = new HashMap<>();
        for (final String palavra: palavras) {
            final Integer repeticoesPalavra = repeticoes.get(palavra);
            if (repeticoesPalavra == null) {
                repeticoes.put(palavra, 1);
            } else {
                repeticoes.put(palavra, repeticoesPalavra + 1);
            }
        }

        return repeticoes.entrySet().stream()
        .max(Map.Entry.comparingByValue()).get().getKey();
    }

    /**
    * Retorna a quantidade de veze que cada uma das
    letras presentes em uma sequência de caracteres aparece.
    * @param sequencia sequência de caracteres
    * @return quantidade de letras
    */
    public static Map<Character, Integer> quantidadeLetras(
        final String sequencia) {

        final Map<Character, Integer> quantidade =
            new ConcurrentHashMap<>();
        for (int index = 0; index < sequencia.length(); index++) {
            final String seqMinuscula = sequencia
                .toLowerCase(Locale.getDefault());
            final Character letra = seqMinuscula.charAt(index);
            final Integer repLetra = quantidade.get(letra);
            final boolean ehLetra = letra >= 'a' && letra <= 'z';
            final boolean letraInserida = repLetra != null;

            if (!ehLetra) {
                continue;
            }

            if (letraInserida) {
                quantidade.put(letra, repLetra + 1);
            } else {
                quantidade.put(letra, 1);
            }
        }

        return quantidade;
    }

    /**
     * Retorna a soma de números ímpares contidos em um vetor de inteiros.
     * @param numerosInteiros vetor de números inteiros
     * @return soma dos números ímpares
     */
    public static int somaNumerosImpares(final int... numerosInteiros) {
        final List<Integer> list = Arrays.stream(numerosInteiros)
            .boxed().collect(Collectors.toList());
        final Stream<Integer> impares = list.stream()
        .filter(x -> ehImpar(x));
        return impares.reduce(0, (x, y) -> x + y);
    }

    /**
     * Verifica se número é ímpar.
     * @param numero numero
     * @return se é ímpar
     */
    public static boolean ehImpar(final int numero) {
        return numero % 2 != 0;
    }

}
