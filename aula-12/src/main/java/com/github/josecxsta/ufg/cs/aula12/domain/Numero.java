/*
* Copyright (c) 2016.
* Fábrica de Software - Instituto de Informática (UFG)
* Creative Commons Attribution 4.0 International License.
*/

package com.github.josecxsta.ufg.cs.aula12.domain;
import java.math.BigDecimal;
/**
 * Implementação da conversão do número
 * pelo seu correspondente em extenso.
 */
public final class Numero {

    /**
     * Não é esperada criação de instâncias desta classe.
     */
    protected Numero() {
        // Apenas para agradar análise de cobertura
    }

    /**
     * Retorna o número por extenso.
     * @param numero número
     * @return número por extenso
     */
    public static final String porExtenso(int numero) {
        CurrencyWriter cw = CurrencyWriter.getInstance();
        String extenso = cw.write(new BigDecimal(numero));
        return extenso;
    }

}
