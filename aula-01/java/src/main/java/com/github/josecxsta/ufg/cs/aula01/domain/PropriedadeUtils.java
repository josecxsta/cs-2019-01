package com.github.josecxsta.ufg.cs.aula01.domain;

/**
* Implementa propriedades matemáticas.
* @author José da Costa
*/
public final class PropriedadeUtils {

    /**
    * Limite para o argumento do método prop153.
    */
    public static final int LIMIT_PROP153 = 999;

    /**
    * Limite para o argumento do método prop3025.
    */
    public static final int LIMIT_PROP3025 = 9999;

    /**
    * Atributo que representa o número 1 a fim de evitar
    * a utilização de número mágico.
    */
    public static final int DIG_1 = 1;

    /**
    * Atributo que representa o número 2 a fim de evitar
    * a utilização de número mágico.
    */
    public static final int DIG_2 = 2;

    /**
    * Atributo que representa o número 3 a fim de evitar
    * a utilização de número mágico.
    */
    public static final int DIG_3 = 3;

    /**
    * Atributo que representa o número 4 a fim de evitar
    * a utilização de número mágico.
    */
    public static final int DIG_4 = 4;
    /**
    * Atributo que representa o número 5 a fim de evitar
    * a utilização de número mágico.
    */
    public static final int DIG_5 = 5;

    /**
    * Atributo que representa o número 7 a fim de evitar
    * a utilização de número mágico.
    */
    public static final int DIG_7 = 7;

    /**
    * Atributo que representa o número 10 a fim de evitar
    * a utilização de número mágico.
    */
    public static final int DIG_10 = 10;

    /**
    * Atributo que representa o número 100 a fim de evitar
    * a utilização de número mágico.
    */
    public static final int DIG_100 = 100;

    /**
    * Atributo que representa o número 1000 a fim de evitar
    * a utilização de número mágico.
    */
    public static final int DIG_1000 = 1000;

    /**
    * Atributo que representa o número 12 a fim de evitar
    * a utilização de número mágico.
    */
    public static final int DIG_12 = 12;

    /**
    * Atributo que representa o número 400 a fim de evitar
    * a utilização de número mágico.
    */
    public static final int DIG_400 = 400;

    /**
    * Construtor privado para evitar instância de classe utilitária.
    */
    private PropriedadeUtils() {
    }

    /**
    * Calcula se numero satisfaz a propriedade 153.
    * @param number numero.
    * @return se satisfaz propriedade 153
    * @throws IllegalArgumentException se argumento nao estiver entre 100 e 999.
    */
    public static boolean prop153(final int number) {

        if (number < 0 || number > LIMIT_PROP153) {
            throw new IllegalArgumentException("Argumento fora da faixa");
        }

        final int numeroPorCem = number / DIG_100;
        final int resto = number % DIG_100;
        final int restoPorDez = resto / DIG_10;
        final int restoDoResto = resto % DIG_10;
        final int numeroPorCemCubo = numeroPorCem * numeroPorCem * numeroPorCem;
        final int restoPorDezAoCubo = restoPorDez * restoPorDez * restoPorDez;
        final int restoDoRestoCubo = restoDoResto * restoDoResto * restoDoResto;

        return numeroPorCemCubo + restoPorDezAoCubo + restoDoRestoCubo == number;
    }

    /**
    * Calcula se numero satisfaz a propriedade 3025.
    * @param number numero.
    * @return se satisfaz propriedade 3025
    * @throws IllegalArgumentException se argumento
    nao estiver entre 100 e 9999.
    */
    public static boolean prop3025(final int number) {

        if (number < 0 || number > LIMIT_PROP3025) {
            throw new IllegalArgumentException("Argumento fora da faixa");
        }

        final int numeroPorCem = number / DIG_100;
        final int resto = number % DIG_100;
        final int soma = Math.round(numeroPorCem + resto);
        final int quadradoSoma = soma * soma;

        return quadradoSoma == number;
    }

}