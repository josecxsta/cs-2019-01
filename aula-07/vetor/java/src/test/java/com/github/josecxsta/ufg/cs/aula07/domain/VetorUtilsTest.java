package com.github.josecxsta.ufg.cs.aula07.domain;

import com.github.josecxsta.ufg.cs.aula07.domain.VetorUtils;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

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

    @Test
    public void somaImpares() {
        int[] numeros = {1, 4, 5};
        assertEquals(6, VetorUtils.somaNumerosImpares(numeros));
    }

    @Test
    public void palavraMaisRepetida() {
        assertEquals("software", VetorUtils
        .palavraMaisFrequente("software na construção de software"));
    }

    @Test
    public void quantidadeLetras() {
        HashMap<Character, Integer> result = new HashMap<>();
        result.put('a', 4);
        result.put('c', 2);
        result.put('d', 2);
        result.put('e', 3);
        result.put('f', 1);
        result.put('l', 1);
        result.put('n', 1);
        result.put('o', 3);
        result.put('r', 2);
        result.put('s', 2);
        result.put('t', 2);
        result.put('u', 2);
        result.put('w', 1);
        String valor = "aula de construcao de software";
        assertEquals(result, VetorUtils.quantidadeLetras(valor));
    }

}
