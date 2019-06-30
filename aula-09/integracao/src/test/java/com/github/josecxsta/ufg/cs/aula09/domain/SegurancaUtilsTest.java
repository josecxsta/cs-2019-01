package com.github.josecxsta.ufg.cs.aula09.domain;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class SegurancaUtilsTest {

    @Test
    public void sha256() {
        String hash = "e24b6224f4ed1fac90cdade13ea2873549349994dc7e2d491e56f90ff7b073b0";
        assertEquals(hash, SegurancaUtils.sha256("sequenciaTeste"));
    }

}