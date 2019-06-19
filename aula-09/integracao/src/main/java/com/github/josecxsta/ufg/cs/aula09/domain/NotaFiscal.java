package com.github.josecxsta.ufg.cs.aula09.domain;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

    public NotaFiscal() {

    }

    public void setTotal(final Double total) {
        this.total = total;
    }

    public void setData(final String data) {
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy", Locale.ENGLISH);
        try {
            Date date = format.parse(data);
            this.data = date;
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void addItem(ItemNotaFiscal item) {
        this.itens.add(item);
    }

    public void getData() {
        return this.data;
    }

}