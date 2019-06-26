package com.github.josecxsta.ufg.cs.aula09.domain;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Calendar;

public class FromNotaFiscalToBinario {

    public static final byte[] converte(NotaFiscal nota) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(nota.getData());

        final int year = cal.get(Calendar.YEAR);
        final int month = cal.get(Calendar.MONTH) + 1;
        final int day = cal.get(Calendar.DAY_OF_MONTH);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        outputStream.write((byte) year);
        outputStream.write((byte) month);
        outputStream.write((byte) day);

        for (ItemNotaFiscal item : nota.getItens()) {

            System.out.println(item.getQuantidade());
            System.out.println(item.getPreco());
            System.out.println(item.getProduto().getCodigo());
            try {
                outputStream.write(item.getProduto().getDescricaoAsByteArray());
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        byte[] c = outputStream.toByteArray();

        return c;

    }

}