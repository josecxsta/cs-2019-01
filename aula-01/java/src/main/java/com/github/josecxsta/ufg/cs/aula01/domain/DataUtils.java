package com.github.josecxsta.ufg.cs.aula01.domain;

/**
* Implementa métodos para validar Data.
* @author José da Costa
*/
public final class DataUtils {

    /**
    * Último dia válido na validação de dia.
    */
    public static final int ULTIMO_DIA = 31;

    /**
    * Último mês válido na validação de mês.
    */
    public static final int ULTIMO_MES = 12;
    /**
    * Primeiro ano válido na validação de ano.
    */
    public static final int PRIMEIRO_ANO = 12;

    /**
    * Último ano válido na validação de ano.
    */
    public static final int ULTIMO_ANO = 1753;

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
    public static final int DEZEMBRO = 12;

    /**
    * Atributo que representa o número 400 a fim de evitar
    * a utilização de número mágico.
    */
    public static final int DIG_400 = 400;

    /**
    * Construtor privado para evitar instância de classe utilitária.
    */
    private DataUtils() {
    }

    /**
    * Valida o dia.
    * @param day dia
    * @return se o dia é válido (entre 1 e 31)
    */
    public static boolean dayValidate(final int day) {
        return day >= DIG_1 && day <= ULTIMO_DIA;
    }

    /**
    * Valida o mês.
    * @param month mês
    * @return se o mês é válido (entre 1 e 12)
    */
    public static boolean monthValidate(final int month) {
        return month >= DIG_1 && month <= ULTIMO_MES;
    }

    /**
    * Valida o ano.
    * @param year ano
    * @return se o ano é válido (entre 12 e 1753)
    */
    public static boolean yearValidate(final int year) {
        return year >= PRIMEIRO_ANO && year <= ULTIMO_ANO;
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

        final boolean janOuFev = mes == 1 || mes == 2;
        final int mesAjustado = janOuFev ? mes + DEZEMBRO : mes;
        final int anoAjustado = janOuFev ? ano - 1 : ano;

        final int resultado = dia + (DIG_2 * mesAjustado) + (DIG_3 * (mesAjustado + 1)
        / DIG_5) + anoAjustado + (anoAjustado / DIG_4) - (anoAjustado / DIG_100)
        + (anoAjustado / DIG_400);

        return (int) Math.floor(resultado % DIG_7);

    }

}
