package com.github.josecxsta.ufg.cs.aula09.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que implementa o modelo de NF.
 */
public class NotaFiscal {
    /**
     * Data da NF.
     */
    private String data;
    /**
     * Valor total da NF.
     */
    private double total;
    /**
     * Itens da NF, que contém produto.
     */
    private final List<ItemNotaFiscal> itens = new ArrayList<>();

    /**
     * Construtor de Nota Fiscal.
     * @param dataParam data da nf
     * @param totalParam valor total da nf
     */
    public NotaFiscal(final String dataParam, final double totalParam) {
        this.setData(dataParam);
        this.setTotal(totalParam);
    }

    /**
     * Setter do total.
     * @param totalParam valor total.
     */
    public final void setTotal(final Double totalParam) {
        this.total = totalParam;
    }

    /**
     * getter de total.
     * @return valor total
     */
    public final double getTotal() {
        return this.total;
    }

    /**
     * setter de data.
     * @param dataParam data em "dd/MM/yyyy"
     */
    public final void setData(final String dataParam) {
        this.data = dataParam;
    }

    /**
     * Adiciona item de NF.
     * @param item item de nf.
     */
    public final void addItem(final ItemNotaFiscal item) {
        this.itens.add(item);
    }

    /**
     * Obtém a data em inteiro.
     * @return data em inteiro (yyyymmdd)
     */
    public final int getDataAsInt() {
        final String[] seqData = this.data.split("/");
        return Integer.parseInt(seqData[2]
        + seqData[1] + seqData[0]);
    }

    /**
     * getter de itens.
     * @return itens de nf.
     */
    public final List<ItemNotaFiscal> getItens() {
        return this.itens;
    }

}
