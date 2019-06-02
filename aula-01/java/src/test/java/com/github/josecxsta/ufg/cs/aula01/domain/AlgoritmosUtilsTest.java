package com.github.josecxsta.ufg.cs.aula01.domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AlgoritmosUtilsTest {

    // @Test
    // public void classTest() {
    //     assertThrows(UnsupportedOperationException.class, () -> new AlgoritmosUtils());
    // }


    @Test
    public void quadradoPerfeitoCerto() {
        assertTrue(AlgoritmosUtils.quadradoPerfeito(9));
    }

    @Test
    public void quadradoPerfeitoErrado() {
        assertFalse(AlgoritmosUtils.quadradoPerfeito(13));
    }

    @Test
    public void quadradoPerfeitoErro() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.quadradoPerfeito(0));
    }

    @Test
    public void valorPiErro() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.valorPi(0));
    }

    @Test
    public void fibonacciErro() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.fibonacci(-1));
    }

    @Test
    public void fatorialAcertos() {
        assertEquals(1, AlgoritmosUtils.fatorial(1));
        assertEquals(6, AlgoritmosUtils.fatorial(3));
        assertEquals(24, AlgoritmosUtils.fatorial(4));
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.fatorial(0));
    }

    @Test
    public void logaritmoErro() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.logaritmo(0, 0));
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.logaritmo(0, 3));
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.logaritmo(3, 0));
    }

    @Test
    public void numeroPrimoAcerto() {
        assertTrue(AlgoritmosUtils.numeroPrimo(3));
        assertFalse(AlgoritmosUtils.numeroPrimo(4));
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.numeroPrimo(-1));
    }


    @Test
    public void produtoDeInteirosErro() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.produtoDeInteiros(0, 0));
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.produtoDeInteiros(2, 0));
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.produtoDeInteiros(0, 4));
    }

    @Test
    public void fibonacciAcertos() {
        assertEquals(0, AlgoritmosUtils.fibonacci(0));
        assertEquals(1, AlgoritmosUtils.fibonacci(1));
        assertEquals(1, AlgoritmosUtils.fibonacci(2));
        assertEquals(2, AlgoritmosUtils.fibonacci(3));
        assertEquals(5, AlgoritmosUtils.fibonacci(5));
    }


    @Test
    public void razaoAureaErros() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.razaoAurea(-1, -2, 0));
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.razaoAurea(2, -2, 0));
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.razaoAurea(2, 1, 5));
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.razaoAurea(-2, -1, 5));
        assertEquals(1, AlgoritmosUtils.razaoAurea(5, 9, 2));
    }

    @Test
    public void maiorDivisorComumCerto() {
        assertEquals(6, AlgoritmosUtils.maiorDivisorComum(12, 6));
        assertEquals(6, AlgoritmosUtils.maiorDivisorComum2(12, 6));
        assertEquals(24, AlgoritmosUtils.maiorDivisorComum2(24, 24));
        assertEquals(4, AlgoritmosUtils.maiorDivisorComum2(24, 20));
    }

    @Test
    public void maiorDivisorComumErro() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.maiorDivisorComum(3,5));
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.maiorDivisorComum2(3,5));
    }

    @Test
    public void potenciaSomasCerto() {
        assertEquals(2985984, AlgoritmosUtils.potenciaSomas(12, 6));
        assertEquals(429981696, AlgoritmosUtils.potenciaSomas(12, 8));
    }

    @Test
    public void Erros() {
        int[] seq = {1, 2, 3};
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.potenciaSomas(-1,5));
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.potenciaSomas(3,-1));
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.restoDivisao(3,-1));
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.restoDivisao(-1,2));
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.polinomio(-12, seq));
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.somaPrimeirosNaturais(-12));
    }

    @Test
    public void somaPrimeirosNaturaisCerto() {
        assertEquals(6, AlgoritmosUtils.somaPrimeirosNaturais(3));
        assertEquals(15, AlgoritmosUtils.somaPrimeirosNaturais(5));
    }

    @Test
    public void restoDivisaoCerto() {
        assertEquals(1, AlgoritmosUtils.restoDivisao(10, 3));
        assertEquals(2, AlgoritmosUtils.restoDivisao(20, 3));
    }

    @Test
    public void logaritmoCerto() {
        assertEquals(61, AlgoritmosUtils.logaritmo(10, 2));
    }

    @Test
    public void produtoDeInteirosCerto() {
        assertEquals(20, AlgoritmosUtils.produtoDeInteiros(10, 2));
        assertEquals(40, AlgoritmosUtils.produtoDeInteiros(2, 20));
    }

    @Test
    public void raizQuadradaCerto() {
        assertEquals(3, AlgoritmosUtils.raizQuadrada(10, 2));
        assertEquals(1, AlgoritmosUtils.raizQuadrada(2, 20));
    }

    @Test
    public void polinomioCerto() {
        int[] sequencia = {1, 2, 3};
        assertEquals(17, AlgoritmosUtils.polinomio(2, sequencia));
    }

    @Test
    public void crivoEratostenesCerto() {
        int[] sequencia = {1, 2, 3};
        int[] sequencia2 = {0, 0, 0, 1, 2, 0, 5, 6};
        assertFalse(AlgoritmosUtils.crivoEratostenes(sequencia, 2));
        assertFalse(AlgoritmosUtils.crivoEratostenes(sequencia2, 2));
        assertTrue(AlgoritmosUtils.crivoEratostenes(sequencia2, 5));
    }

    @Test
    public void crivoEratostenesErrado() {
        int[] sequencia2 = {0, 1, 2, 3};
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.crivoEratostenes(sequencia2, 1));
    }

    @Test
    public void valorPiCerto() {
        assertEquals(4.0, AlgoritmosUtils.valorPi(1));
    }

    @Test
    public void raizQuadradaErro() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.raizQuadrada(0, 3));
    }

}