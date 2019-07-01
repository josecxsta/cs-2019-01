package com.github.josecxsta.ufg.cs.aula09.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class ProdutoTest {

    @Test
    public void getConteudoAsString() throws IOException {
        assertThrows(IOException.class, ()
        -> ArquivoService.getConteudoAsString("foo"));

        Produto p1 = new Produto(22, "descrição");

        assertEquals(22, p1.getCodigo());
        assertEquals("descrição", p1.getDescricao());
        p1.setCodigo(12);
        assertEquals(12, p1.getCodigo());
        p1.setDescricao("nova");
        assertEquals("nova", p1.getDescricao());
    }


}
