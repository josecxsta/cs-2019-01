package com.github.josecxsta.ufg.cs.aula09.domain;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
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
        final DateFormat format = new SimpleDateFormat(
            "dd/MM/yyyy", Locale.US);
        try {
            final Date date = format.parse(dataParam);
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
     * Obtém a data em inteiro.
     * @return data em inteiro (yyyymmdd)
     */
    public final int getDataAsInt() {
        final Calendar cal = Calendar.getInstance();
        cal.setTime(this.data);

        final int year = cal.get(Calendar.YEAR);
        final int month = cal.get(Calendar.MONTH) + 1;
        final int day = cal.get(Calendar.DAY_OF_MONTH);
        final String dataText = String.valueOf(year)
        + String.valueOf(month) + String.valueOf(day);

        return Integer.valueOf(dataText);
    }

    /**
     * getter de itens.
     * @return itens de nf.
     */
    public final List<ItemNotaFiscal> getItens() {
        return this.itens;
    }

}
