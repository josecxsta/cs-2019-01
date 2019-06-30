package com.github.josecxsta.ufg.cs.aula09.domain;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * Implementa método para serializar
 * o JSON em Nota Fiscal.
 */
public final class FromJsonToNotaFiscal {

    /**
     * Evita instanciação.
     */
    private FromJsonToNotaFiscal() {
    }

    /**
     * Converte a sequencia do JSON em Nota Fiscal.
     * @param data sequência com conteúdo do JSON.
     * @return nota fiscal referente ao JSON.
     */
    public static NotaFiscal converte(final String data) {
        JsonObject jsonObject = new JsonParser().parse(data)
            .getAsJsonObject();
        final Double totalNf = jsonObject.get("total")
            .getAsDouble();
        final String dataNf = jsonObject.get("data")
            .getAsString();
        final NotaFiscal nota = new NotaFiscal(dataNf, totalNf);

        final JsonArray arr = jsonObject.getAsJsonArray("itens");
        for (int i = 0; i < arr.size(); i++) {
            final int codigo = arr.get(i).getAsJsonObject()
                .get("codigo").getAsInt();
            final String descricao = arr.get(i).getAsJsonObject()
                .get("descricao").getAsString();
            final Produto produto = new Produto(codigo, descricao);

            final Double preco = arr.get(i).getAsJsonObject()
                .get("preco").getAsDouble();
            final int quantidade = arr.get(i).getAsJsonObject()
                .get("quantidade").getAsInt();
            final ItemNotaFiscal item = new
                ItemNotaFiscal(quantidade, preco, produto);

            nota.addItem(item);
        }

        return nota;
    }

}
