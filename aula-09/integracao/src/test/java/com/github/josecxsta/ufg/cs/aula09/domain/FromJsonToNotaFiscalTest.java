package com.github.josecxsta.ufg.cs.aula09.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class FromJsonToNotaFiscalTest {

    @Test
    public void getConteudoAsString() throws IOException {
        assertThrows(IOException.class, ()
        -> ArquivoService.getConteudoAsString("foo"));

        String json = "{  \"data\": \"31/12/2018\",  \"total\": 13.0,  \"itens\": [    {      \"quantidade\": 2,      \"preco\": 7.0,      \"codigo\": 18854,      \"descricao\": \"Sabao Azul Novo\"    }  ]}";

        assertEquals("{  \"data\": \"31/12/2018\",  \"total\": 13.0,  \"itens\": [    {      \"quantidade\": 2,      \"preco\": 7.0,      \"codigo\": 18854,      \"descricao\": \"Sabao Azul Novo\"    }  ]}", ArquivoService
        .getConteudoAsString("input/exemplo/exemplo.json"));
        assertEquals(13, FromJsonToNotaFiscal.converte(json).getTotal());
    }


}
