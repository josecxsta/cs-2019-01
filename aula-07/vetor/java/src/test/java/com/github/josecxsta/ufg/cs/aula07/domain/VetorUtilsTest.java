package com.github.josecxsta.ufg.cs.aula07.domain;

import com.github.josecxsta.ufg.cs.aula07.domain.VetorUtils;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VetorUtilsTest {

    @Test
    public void comparaVetores() {
        String[] seq1 = {"inf", "ufg", "cs"};
        String[] seq2 = {"cs"};
        assertEquals("cs", VetorUtils.comparaVetores(seq1, seq2)[0]);
    }

    @Test
    public void menorTemperatura() {
        double[] vet = {1, 9, 5};
        double[] vet2 = {120, 9, 55};
        assertEquals(1, VetorUtils.menorTemperatura(vet));
        assertEquals(9, VetorUtils.menorTemperatura(vet2));
    }

}
