package com.github.josecxsta.ufg.cs.aula09.domain;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class SegurancaUtilsTest {

    @Test
    public void sha256() {
      String hash = "E24B6224F4ED1FAC90CDADE13EA2873549349994DC7E2D491E56F90FF7B073B0";
        assertFalse(SegurancaUtils.sha256("sequenciaTeste") == hash.toLowerCase());
    }

}