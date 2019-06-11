package com.github.josecxsta.ufg.cs.aula01.domain;

/**
* Representa o CPF (Cadastro de Pessoa Física) e implementa
* métodos para validar e apoiar a validação do número do CPF.
* @author José da Costa
*/
public final class CpfUtils {

    /**
    * Constante númerica correspondente ao dígito.
    */
    public static final int DIG_1 = 1;

    /**
    * Constante númerica correspondente ao dígito.
    */
    public static final int DIG_2 = 2;

    /**
    * Constante númerica correspondente ao dígito.
    */
    public static final int DIG_3 = 3;

    /**
    * Constante númerica correspondente ao dígito.
    */
    public static final int DIG_4 = 4;

    /**
    * Constante númerica correspondente ao dígito.
    */
    public static final int DIG_5 = 5;

    /**
    * Constante númerica correspondente ao dígito.
    */
    public static final int DIG_6 = 6;

    /**
    * Constante númerica correspondente ao dígito.
    */
    public static final int DIG_7 = 7;

    /**
    * Constante númerica correspondente ao dígito.
    */
    public static final int DIG_8 = 8;

    /**
    * Constante númerica correspondente ao dígito.
    */
    public static final int DIG_9 = 9;

    /**
    * Constante númerica correspondente ao dígito.
    */
    public static final int DIG_10 = 10;

    /**
    * Constante númerica correspondente ao dígito.
    */
    public static final int DIG_11 = 11;

    /**
    * Constante númerica correspondente ao dígito.
    */
    public static final int DIG_12 = 12;

    /**
    * Construtor privado para evitar instância de classe utilitária.
    */
    private CpfUtils() {
    }

    /**
    * Converte cada caracteres de um sequência produzindo um vetor
    de inteiros correspondente.
    * @param sequencia A sequência de caracteres para a qual um
    vetor de inteiros será criado.
    * @return coleção de inteiros
    */
    public static int[] converteSequenciaEmInteiros(final String sequencia) {

        int[] inteiros = new int[sequencia.length()];
        for (int i = 0; i < sequencia.length(); i++) {
            inteiros[i] = Character.getNumericValue(sequencia.charAt(i));
        }

        return inteiros;
    }

    /**
    * Verifica se o CPF fornecido é válido.
    * @param sequencia coleção de números que formam o cpf
    * @throws IllegalArgumentException se argumento tiver quantidade
    de caracteres diferente de 11
    * @return se CPF é válido.
    */
    public static boolean validaCpf(final String sequencia) {

        final int[] cpf = converteSequenciaEmInteiros(sequencia);

        if (cpf.length != DIG_11) {
            throw new IllegalArgumentException("CPF precisa ter 11 caracteres");
        }

        final int calculo1 = cpf[0] + (DIG_2 * cpf[DIG_1])
        + (DIG_3 * cpf[DIG_2])
        + (DIG_4 * cpf[DIG_3]) + (DIG_5 * cpf[DIG_4]) + (DIG_6 * cpf[DIG_5])
        + (DIG_7 * cpf[DIG_6]) + (DIG_8 * cpf[DIG_7]) + (DIG_9 * cpf[DIG_8]);

        final int calculo2 = cpf[DIG_1] + (DIG_2 * cpf[DIG_2]) + (DIG_3
        * cpf[DIG_3])
        + (DIG_4 * cpf[DIG_4]) + (DIG_5 * cpf[DIG_5]) + (DIG_6 * cpf[DIG_6])
        + (DIG_7 * cpf[DIG_7]) + (DIG_8 * cpf[DIG_8]) + (DIG_9 * cpf[DIG_9]);

        final int verificador1 = (calculo1 % DIG_11) % DIG_10;
        final int verificador2 = (calculo2 % DIG_11) % DIG_10;

        return verificador1 == cpf[DIG_9] && verificador2 == cpf[DIG_10];

    }

    /**
    * Verifica se o CPF fornecido é válido.
    * @param sequencia coleção de números que formam o cpf
    * @throws IllegalArgumentException se argumento tiver quantidade
    de caracteres diferente de 11
    * @return se CPF é válido.
    */
    public static boolean validaCpf2(final String sequencia) {

        final int[] inteiros = converteSequenciaEmInteiros(sequencia);

        if (inteiros.length != DIG_11) {
            throw new IllegalArgumentException("CPF precisa de 11 caracteres");
        }

        int aux = DIG_7;
        int regiao = inteiros[DIG_8];
        int regiaoFiscal = inteiros[DIG_8];

        while (aux >= 0) {
            regiao = regiao + inteiros[aux];
            regiaoFiscal = regiaoFiscal + regiao;
            aux = aux - 1;
        }

        final int verificador1 = (regiaoFiscal % DIG_11) % DIG_10;
        final int verificador2 = ((regiaoFiscal - regiao + DIG_9
        * inteiros[DIG_9]) % DIG_11) % DIG_10;

        return verificador1 == inteiros[DIG_9]
        && verificador2 == inteiros[DIG_10];

    }

}

