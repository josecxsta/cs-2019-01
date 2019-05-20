package com.github.josecxsta.ufg.cs.aula01.domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.github.josecxsta.ufg.cs.aula01.domain.Algoritmos;

public class AlgoritmoTest {

    @Test
    public void classTest() {
        assertThrows(UnsupportedOperationException.class, () -> new Algoritmos());
    }

    @Test
    public void prop153() {
        assertTrue(Algoritmos.prop153(153));
        assertFalse(Algoritmos.prop153(154));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.prop153(-2));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.prop153(99999));
    }

    @Test
    public void prop3025() {
        assertFalse(Algoritmos.prop3025(154));
        assertTrue(Algoritmos.prop3025(3025));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.prop3025(99999));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.prop3025(-2));
    }

    @Test
    public void quadradoPerfeitoCerto() {
        assertTrue(Algoritmos.quadradoPerfeito(9));
    }

    @Test
    public void quadradoPerfeitoErrado() {
        assertFalse(Algoritmos.quadradoPerfeito(13));
    }

    @Test
    public void quadradoPerfeitoErro() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.quadradoPerfeito(0));
    }

    @Test
    public void valorPiErro() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.valorPi(0));
    }

    @Test
    public void fibonacciErro() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.fibonacci(-1));
    }

    @Test
    public void fatorialAcertos() {
        assertEquals(1, Algoritmos.fatorial(1));
        assertEquals(6, Algoritmos.fatorial(3));
        assertEquals(24, Algoritmos.fatorial(4));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.fatorial(0));
    }

    @Test
    public void logaritmoErro() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.logaritmo(0, 0));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.logaritmo(0, 3));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.logaritmo(3, 0));
    }

    @Test
    public void numeroPrimoAcerto() {
        assertTrue(Algoritmos.numeroPrimo(3));
        assertFalse(Algoritmos.numeroPrimo(4));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.numeroPrimo(-1));
    }


    @Test
    public void produtoDeInteirosErro() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.produtoDeInteiros(0, 0));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.produtoDeInteiros(2, 0));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.produtoDeInteiros(0, 4));
    }

    @Test
    public void fibonacciAcertos() {
        assertEquals(0, Algoritmos.fibonacci(0));
        assertEquals(1, Algoritmos.fibonacci(1));
        assertEquals(1, Algoritmos.fibonacci(2));
        assertEquals(2, Algoritmos.fibonacci(3));
        assertEquals(5, Algoritmos.fibonacci(5));
    }


    @Test
    public void razaoAureaErros() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.razaoAurea(-1, -2, 0));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.razaoAurea(2, -2, 0));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.razaoAurea(2, 1, 5));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.razaoAurea(-2, -1, 5));
        assertEquals(1, Algoritmos.razaoAurea(5, 9, 2));
    }

    @Test
    public void maiorDivisorComumCerto() {
        assertEquals(6, Algoritmos.maiorDivisorComum(12, 6));
        assertEquals(6, Algoritmos.maiorDivisorComum2(12, 6));
        assertEquals(24, Algoritmos.maiorDivisorComum2(24, 24));
        assertEquals(4, Algoritmos.maiorDivisorComum2(24, 20));
    }

    @Test
    public void maiorDivisorComumErro() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.maiorDivisorComum(3,5));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.maiorDivisorComum2(3,5));
    }

    @Test
    public void potenciaSomasCerto() {
        assertEquals(2985984, Algoritmos.potenciaSomas(12, 6));
        assertEquals(429981696, Algoritmos.potenciaSomas(12, 8));
    }

    @Test
    public void Erros() {
        int[] seq = {1, 2, 3};
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.potenciaSomas(-1,5));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.potenciaSomas(3,-1));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.restoDivisao(3,-1));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.restoDivisao(-1,2));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.polinomio(-12, seq));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.somaPrimeirosNaturais(-12));
    }

    @Test
    public void somaPrimeirosNaturaisCerto() {
        assertEquals(6, Algoritmos.somaPrimeirosNaturais(3));
        assertEquals(15, Algoritmos.somaPrimeirosNaturais(5));
    }

    @Test
    public void restoDivisaoCerto() {
        assertEquals(1, Algoritmos.restoDivisao(10, 3));
        assertEquals(2, Algoritmos.restoDivisao(20, 3));
    }

    @Test
    public void logaritmoCerto() {
        assertEquals(61, Algoritmos.logaritmo(10, 2));
    }

    @Test
    public void produtoDeInteirosCerto() {
        assertEquals(20, Algoritmos.produtoDeInteiros(10, 2));
        assertEquals(40, Algoritmos.produtoDeInteiros(2, 20));
    }

    @Test
    public void raizQuadradaCerto() {
        assertEquals(3, Algoritmos.raizQuadrada(10, 2));
        assertEquals(1, Algoritmos.raizQuadrada(2, 20));
    }

    @Test
    public void polinomioCerto() {
        int[] sequencia = {1, 2, 3};
        assertEquals(17, Algoritmos.polinomio(2, sequencia));
    }

    @Test
    public void crivoEratostenesCerto() {
        int[] sequencia = {1, 2, 3};
        int[] sequencia2 = {0, 0, 0, 1, 2, 0, 5, 6};
        assertFalse(Algoritmos.crivoEratostenes(sequencia, 2));
        assertFalse(Algoritmos.crivoEratostenes(sequencia2, 2));
        assertTrue(Algoritmos.crivoEratostenes(sequencia2, 5));
    }

    @Test
    public void crivoEratostenesErrado() {
        int[] sequencia2 = {0, 1, 2, 3};
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.crivoEratostenes(sequencia2, 1));
    }

    @Test
    public void valorPiCerto() {
        assertEquals(4.0, Algoritmos.valorPi(1));
    }

    @Test
    public void raizQuadradaErro() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.raizQuadrada(0, 3));
    }

}