package com.github.josecxsta.ufg.cs.aula09.domain;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
*
*/
public class NotaFiscal {
    public Date data;
    public double total;
    public ArrayList<ItemNotaFiscal> itens = new ArrayList<>();

    /**
     *
     * @param data
     * @param total
     * @param itens
     */
    public NotaFiscal(final Date data, final double total, final ArrayList<ItemNotaFiscal> itens) {
        this.data = data;
        this.total = total;
        this.itens = itens;
    }

    /**
     *
     */
    public NotaFiscal() {
    }

    /**
     *
     * @param total
     */
    public void setTotal(final Double total) {
        this.total = total;
    }

    /**
     *
     */
    public void setData(final String data) {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
        try {
            Date date = format.parse(data);
            this.data = date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     */
    public void addItem(ItemNotaFiscal item) {
        this.itens.add(item);
    }

    /**
     *
     */
    public Date getData() {
        return this.data;
    }

    /**
     *
     */
    public int getDataAsInt() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.data);

        final int year = cal.get(Calendar.YEAR);
        final int month = cal.get(Calendar.MONTH) + 1;
        final int day = cal.get(Calendar.DAY_OF_MONTH);
        final String data = String.valueOf(year) + String.valueOf(month) + String.valueOf(day);

        return Integer.valueOf(data);
    }

    /**
     *
     */
    public ArrayList<ItemNotaFiscal> getItens() {
        return this.itens;
    }

}
