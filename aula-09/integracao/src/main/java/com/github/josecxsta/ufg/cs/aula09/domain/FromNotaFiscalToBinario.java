package com.github.josecxsta.ufg.cs.aula09.domain;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Implementa método para converter
 * NotaFiscal em binário.
 */
public final class FromNotaFiscalToBinario {

    /**
     * Evita a instanciação.
     */
    private FromNotaFiscalToBinario() {
    }

    /**
     * Converte NF em binário.
     * @param nota nota fiscal.
     * @return binário da NF.
     * @throws IOException caso haja erro com a manipulação.
     */
    public static byte[] converte(final NotaFiscal nota)
    throws IOException {
        OutputStream outputStream = new
        ByteArrayOutputStream();
        DataOutputStream dataOut = new
        DataOutputStream(outputStream);

        dataOut.writeInt(nota.getDataAsInt()); // 4bytes
        dataOut.writeDouble(nota.getTotal()); // 8bytes

        for (ItemNotaFiscal item : nota.getItens()) {
            dataOut.writeInt(item.getQuantidade()); // 4bytes
            dataOut.writeDouble(item.getPreco()); // 8bytes
            dataOut.writeInt(item.getProduto().getCodigo()); // 4bytes
            dataOut.write(item.getProduto().getDescricaoAsByteArray());
        }

        final byte[] c = ((ByteArrayOutputStream) outputStream)
            .toByteArray();

        return c;
    }


}
