package com.github.josecxsta.ufg.cs.aula01.domain;

/**
* Implementa métodos para validar Data.
* @author José da Costa
*/
public class Data {

    /**
    * Último dia válido na validação de dia.
    */
    public static final int LAST_DAY = 31;

    /**
    * Último mês válido na validação de mês.
    */
    public static final int LAST_MONTH = 12;
    /**
    * Primeiro ano válido na validação de ano.
    */
    public static final int FIRST_YEAR = 12;

    /**
    * Último ano válido na validação de ano.
    */
    public static final int LAST_YEAR = 1753;

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
    * Evita a instanciação da clase.
    * @throws UnsupportedOperationException
    */
    protected Data() {
        throw new UnsupportedOperationException();
    }

    /**
    * Valida o dia.
    * @param day dia
    * @return se o dia é válido (entre 1 e 31)
    */
    public static boolean dayValidate(final int day) {
        return day >= DIG_1 && day <= LAST_DAY;
    }

    /**
    * Valida o mês.
    * @param month mês
    * @return se o mês é válido (entre 1 e 12)
    */
    public static boolean monthValidate(final int month) {
        return month >= DIG_1 && month <= LAST_MONTH;
    }

    /**
    * Valida o ano.
    * @param year ano
    * @return se o ano é válido (entre 12 e 1753)
    */
    public static boolean yearValidate(final int year) {
        return year >= FIRST_YEAR && year <= LAST_YEAR;
    }

    /**
    * Calcula o dia da semana de uma determinada data.
    * @param dia dia
    * @param mes mês
    * @param ano ano
    * @return numero referente ao dia da semana
    * @throws IllegalArgumentException se data for invalida
    */
    public static int diaDaSemana(final int dia, final int mes, final int ano) {

        if (!dayValidate(dia) || !monthValidate(mes) || !yearValidate(ano)) {
            throw new IllegalArgumentException("data invalida");
        }

        int month = mes;
        int year = ano;

        if (month == 1 || month == 2) {
            month = month + DIG_12;
            year = year - 1;
        }

        int s = (dia + (DIG_2 * month) + (DIG_3 * (month + 1) / DIG_5)
        + year + (year / DIG_4) - (year / DIG_100) + (year / DIG_400));

        return (int) Math.floor(s % DIG_7);

    }

}
