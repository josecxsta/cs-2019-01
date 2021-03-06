/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.josecxsta.ufg.cs.aula12.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumeroTest {

    @Test
    public void teste() {
        assertEquals("trinta", Numero.porExtenso(30));
        assertEquals("trezentos", Numero.porExtenso(300));
        assertEquals("mil e duzentos", Numero.porExtenso(1200));
    }

}


