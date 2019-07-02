package com.github.josecxsta.ufg.cs.aula09.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class ItemNotaFiscalTest {

    @Test
    public void itemNF() throws IOException, InterruptedException {

        Produto p1 = new Produto(22, "descrição");
        ItemNotaFiscal inf1 = new ItemNotaFiscal(2, 3.5, p1);
        assertEquals(p1, inf1.getProduto());
        assertEquals(3.5, inf1.getPreco());
        assertEquals(2, inf1.getQuantidade());

        NotaFiscal nf = new NotaFiscal("14/05/1999", 3.5);
        nf.setData("15/05/1999");
        assertEquals(19990515, nf.getDataAsInt());
        nf.addItem(inf1);

        for(ItemNotaFiscal inf : nf.getItens()) {
            assertEquals(inf1, inf);
        }

        Log.info("Teste");

        FromNotaFiscalToBinario.converte(nf);

        ArquivoService.getCaminhoPasta();
    }


}
