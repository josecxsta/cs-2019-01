package com.github.josecxsta.ufg.cs.aula07.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

/**
* Implementa métodos estáticos para manipulação
* de vetores
*/
public class VetorUtils {

    private VetorUtils() {
        throw new UnsupportedOperationException();
    }

    /**
    * Retorna a quantidade de elementos do vetor recebido como primeiro
    * argumento cujos valores são iguais ao valor do segundo argumento fornecido.
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
    * Localizar a palavra mais frequente em uma sequência de caracteres.
    * @param frase
    * @return palavra mais frequente
    */
    // public static String palavraMaisFrequente(String frase) {

        //     String[] palavras = frase.split(' ');
        //     ArrayList<String> repeticoes = new ArrayList<String>();

        //     for (String palavra: palavras) {
            //         if (!repeticoes.find(rep => rep.palavra == palavra)) {
                //             repeticoes.push({
                    //                 palavra: palavra,
                    //                 repeticoes: 0
                    //             });
                    //         } else {
                        //             repeticoes.find(rep => rep.palavra == palavra).repeticoes++;
                        //         }

                        //     }

                        //     String palavra = repeticoes.sort((a, b) => b.repeticoes - a.repeticoes)[0].palavra;
                        //     return palavra;
                        // }


                        /**
                        * Retornar a quantidade de cada uma das letras presentes em uma sequência de caracteres.
                        * @param sequencia
                        * @return quantidade de letras
                        */
                        // public static int[] quantidadeLetras(String sequencia) {

                            //     int[] quantidade ;

                            //     for (int index = 0; index < sequencia.length(); index++) {


                                //         String sequenciaMinuscula = sequencia.toLowerCase();
                                //         quantidade[sequenciaMinuscula.charAt(index)] = 0;

                                //         if (sequenciaMinuscula.charAt(index) < 'a' || sequenciaMinuscula.charAt(index) > 'z') {
                                    //             continue;
                                    //         }

                                    //         if (quantidade[sequenciaMinuscula.charAt(index)] == 0) {
                                        //             quantidade[sequenciaMinuscula.charAt(index)] = 1;
                                        //         } else {
                                            //             quantidade[sequenciaMinuscula.charAt(index)] += 1;
                                            //         }

                                            //     }

                                            //     return quantidade;
                                            // }


                                            /**
                                            * Retorna a soma de números ímpares contidos em um vetor de inteiros.
                                            * @param numerosInteiros vetor de números inteiros
                                            * @return soma dos números ímpares
                                            */
                                            // public static int[] somaNumerosImpares(int[] numerosInteiros) {
                                                //     final int[] impares = numerosInteiros.stream()
                                                //     .filter(ehImpar());
                                                //     return impares.reduce(somaNumeros(), 0);
                                                // }

                                                /**
                                                * Verifica se número é ímpar
                                                * @param numero
                                                * @return se é ímpar
                                                */
                                                public static boolean ehImpar(final int numero) {
                                                    return numero % 2 != 0;
                                                }

                                                /**
                                                * Soma dois números
                                                * @param num1 primeiro número
                                                * @param num2 segundo número
                                                * @return soma dos dois números
                                                */
                                                public static int somaNumeros(final int num1, final int num2) {
                                                    return num1 + num2;
                                                }

                                                /**
                                                * Sortea aleatoriamente 1.000.000 de valores inteiros de 0 a 1000 e
                                                * identifica o número que mais foi sorteado.
                                                * Se mais de um número foi o “mais frequente”, então todos eles
                                                * deverão ser retornados (em uma coleção) juntamente com a quantidade
                                                * de vezes em que ocorrerão.
                                                */
                                                // public static ArrayList sorteio() {
                                                    //     final int quantidade = 1000000;
                                                    //     final int numeroMaximo = 1000;
                                                    //     final int[] sorteados = [];
                                                    //     for (int index = 0; index < quantidade; index++) {
                                                        //         int numero = numeroAleatorio(0, numeroMaximo);

                                                        //         if (!sorteados.find(sort => sort.numero == numero)) {
                                                            //             sorteados.push({
                                                                //                 numero: numero,
                                                                //                 quantidade: 0
                                                                //             });
                                                                //         } else {
                                                                    //             sorteados.find(sort => sort.numero == numero).quantidade++;
                                                                    //         }
                                                                    //     }

                                                                    //     final int sorteadosEmOrdem = sorteados.sort((a, b) => b.quantidade - a.quantidade);
                                                                    //     let maiores = sorteadosEmOrdem.filter(sort => sort.quantidade == sorteadosEmOrdem[0].quantidade);
                                                                    //     let resultado;
                                                                    //     if (maiores.length == 1) {
                                                                        //         resultado = maiores[0].numero;
                                                                        //     } else {
                                                                            //         for (int numero: maiores) {
                                                                                //             resultado.push(numero);
                                                                                //         }
                                                                                //     }

                                                                                //     return maiores;
                                                                                // }

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