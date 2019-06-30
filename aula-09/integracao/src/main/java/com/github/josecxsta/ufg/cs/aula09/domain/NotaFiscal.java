package com.github.josecxsta.ufg.cs.aula09.domain;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Classe que implementa o modelo de NF.
 */
public class NotaFiscal {
    /**
     * Data da NF.
     */
    private Date data;
    /**
     * Valor total da NF.
     */
    private double total;
    /**
     * Itens da NF, que contém produto.
     */
    private ArrayList<ItemNotaFiscal> itens = new ArrayList<>();

    /**
     * Construtor de Nota Fiscal.
     * @param data data da nf
     * @param total valor total da nf
     * @param itens qtde de itens da nf
     */
    public NotaFiscal(final Date data, final double total,
        final ArrayList<ItemNotaFiscal> itens) {
        this.data = data;
        this.setTotal(total);
        this.itens = itens;
    }

    /**
     * Construtor vazio.
     */
    public NotaFiscal() {
    }

    /**
     * Setter do total.
     * @param total valor total.
     */
    public final void setTotal(final Double total) {
        this.total = total;
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
     * @param data data em "dd/MM/yyyy"
     */
    public final void setData(final String data) {
        final DateFormat format = new SimpleDateFormat(
            "dd/MM/yyyy", Locale.US);
        try {
            final Date date = format.parse(data);
            this.data = date;
        } catch (ParseException e) {
            Log.info("Data informada é inválida");
        }
    }

    /**
     * Adiciona item de NF.
     * @param item item de nf.
     */
    public final void addItem(final ItemNotaFiscal item) {
        this.itens.add(item);
    }

    /**
     * getter de Data.
     * @return data
     */
    public final Date getData() {
        return this.data;
    }

    /**
     * Obtém a data em inteiro.
     * @return data em inteiro (yyyymmdd)
     */
    public final int getDataAsInt() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.data);

        final int year = cal.get(Calendar.YEAR);
        final int month = cal.get(Calendar.MONTH) + 1;
        final int day = cal.get(Calendar.DAY_OF_MONTH);
        final String data = String.valueOf(year)
        + String.valueOf(month) + String.valueOf(day);

        return Integer.valueOf(data);
    }

    /**
     * getter de itens.
     * @return itens de nf.
     */
    public final ArrayList<ItemNotaFiscal> getItens() {
        return this.itens;
    }

}
