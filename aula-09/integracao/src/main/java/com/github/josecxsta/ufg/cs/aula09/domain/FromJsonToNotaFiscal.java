package com.github.josecxsta.ufg.cs.aula09.domain;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class FromJsonToNotaFiscal {

    public static NotaFiscal converte(String data) {
        JsonObject jsonObject = new JsonParser().parse(data).getAsJsonObject();
        Double totalNf = jsonObject.get("total").getAsDouble();
        String dataNf = jsonObject.get("data").getAsString();
        NotaFiscal nota = new NotaFiscal();
        nota.setTotal(totalNf);
        nota.setData(dataNf);

        JsonArray arr = jsonObject.getAsJsonArray("itens");
        for (int i = 0; i < arr.size(); i++) {
            int codigo = arr.get(i).getAsJsonObject().get("codigo").getAsInt();
            String descricao = arr.get(i).getAsJsonObject().get("descricao").getAsString();
            Produto produto = new Produto(codigo, descricao);

            Double preco = arr.get(i).getAsJsonObject().get("preco").getAsDouble();
            int quantidade = arr.get(i).getAsJsonObject().get("quantidade").getAsInt();
            ItemNotaFiscal item = new ItemNotaFiscal(quantidade, preco, produto);

            nota.addItem(item);
        }

        return nota;
    }

}
