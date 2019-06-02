package com.github.josecxsta.ufg.cs.aula01.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DataUtilsTest {

    // @Test
    // public void classTest() {
    //     assertThrows(UnsupportedOperationException.class, () -> new Data());
    // }

    @Test
    public void diaDaSemanaErro() {
        assertThrows(IllegalArgumentException.class, () -> DataUtils.diaDaSemana(33, 13, 2000));
        assertThrows(IllegalArgumentException.class, () -> DataUtils.diaDaSemana(0, 0, 10));
        assertThrows(IllegalArgumentException.class, () -> DataUtils.diaDaSemana(0, 6, 10));
        assertThrows(IllegalArgumentException.class, () -> DataUtils.diaDaSemana(5, 1, 10));
        assertThrows(IllegalArgumentException.class, () -> DataUtils.diaDaSemana(5, 12, 10));
        assertThrows(IllegalArgumentException.class, () -> DataUtils.diaDaSemana(5, -1, -1));
    }

    @Test
    public void diaDaSemanaCerto() {
        assertEquals(5, DataUtils.diaDaSemana(01, 1, 1650));
        assertEquals(5, DataUtils.diaDaSemana(01, 10, 1650));
        assertEquals(1, DataUtils.diaDaSemana(01, 2, 1650));
    }

}