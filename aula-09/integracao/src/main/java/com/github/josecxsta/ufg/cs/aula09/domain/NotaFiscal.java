package com.github.josecxsta.ufg.cs.aula09.domain;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 */
public class NotaFiscal {
    public Date data;
    public double total;
    public ArrayList<ItemNotaFiscal> itens;

    /**
     *
     * @param data
     * @param total
     * @param itens
     */
    public NotaFiscal(final Date data, final double total,
        final ArrayList<ItemNotaFiscal> itens) {
        this.data = data;
        this.total = total;
        this.itens = itens;
    }

}