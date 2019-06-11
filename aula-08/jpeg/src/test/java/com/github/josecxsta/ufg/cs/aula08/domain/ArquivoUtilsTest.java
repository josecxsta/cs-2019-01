package com.github.josecxsta.ufg.cs.aula08.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class ArquivoUtilsTest {

    @Test
    public void jpeg() throws IOException {
        assertTrue(ArquivoUtils.ehJPEG("input/is-she.jpg"));
        assertFalse(ArquivoUtils.ehJPEG("input/Aplicacao.class"));
    }

}