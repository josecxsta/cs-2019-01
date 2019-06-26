package com.github.josecxsta.ufg.cs.aula09.domain;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 */
public class FromNotaFiscalToBinario {

    /**
     *
     */
    public static final byte[] converte(NotaFiscal nota) throws IOException {
        OutputStream outputStream = new
            ByteArrayOutputStream();
        DataOutputStream dataOut = new
            DataOutputStream(outputStream);

        int data = nota.getDataAsInt();

        dataOut.writeInt(data);

        for (ItemNotaFiscal item : nota.getItens()) {
            dataOut.writeInt(item.getQuantidade());
            dataOut.writeDouble(item.getPreco());
            dataOut.writeInt(item.getProduto().getCodigo());
            dataOut.write(item.getProduto().getDescricaoAsByteArray());
        }

        byte[] c = ((ByteArrayOutputStream) outputStream).toByteArray();

        return c;
    }

}
