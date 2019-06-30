package com.github.josecxsta.ufg.cs.aula09.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class ArquivoServiceTest {

    @Test
    public void getConteudoAsString() {
        assertThrows(IOException.class, ()
        -> ArquivoService.getConteudoAsString("foo"));
    }

    @Test
    public void monitorarPasta() {
        assertThrows(IOException.class, ()
        -> ArquivoService.monitorarPasta("foo"));
    }

    @Test
    public void removeSinais() {
        assertEquals("Sabao",
        ArquivoService.removeSinais("Sabão"));
    }

}
