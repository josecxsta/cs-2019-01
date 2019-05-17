package com.github.josecxsta.ufg.cs.aula01.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AlgoritmosTest {
    
    @Test
    public void prop153True() {
        assertTrue(Algoritmos.prop153(153));
    }
    
    @Test
    public void prop153False() {
        assertFalse(Algoritmos.prop153(154));
    }

    @Test
    public void prop153HigherArgument() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.prop153(99999));
    }

    @Test
    public void prop153LowerArgument() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.prop153(-2));
    }

    @Test
    public void prop3025True() {
        assertTrue(Algoritmos.prop3025(3025));
    }
    
    @Test
    public void prop3025False() {
        assertFalse(Algoritmos.prop3025(154));
    }

    @Test
    public void prop3025HigherArgument() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.prop3025(99999));
    }

    @Test
    public void prop3025LowerArgument() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.prop3025(-2));
    }

    @Test
    public void CPFTrue() {
        assertTrue(Algoritmos.CPF("04080524145"));
    }
    
    @Test
    public void CPFFalse() {
        assertFalse(Algoritmos.CPF("63377387055"));
    }

    @Test
    public void CPFHigherArgument() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.CPF("63377387055555"));
    }

    @Test
    public void CPFLowerArgument() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.CPF("63377387"));
    }
    
    @Test
    public void CPF2True() {
        assertTrue(Algoritmos.CPF2("04080524145"));
    }
    
    @Test
    public void CPF2False() {
        assertFalse(Algoritmos.CPF2("12345678912"));
    }

    @Test
    public void CPF2HigherArgument() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.CPF2("63377387055555"));
    }

    @Test
    public void CPF2LowerArgument() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.CPF2("63377387"));
    }

    @Test
    public void CPF2False2() {
        assertFalse(Algoritmos.CPF2("12345678912"));
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
    public void fatorialErro() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.fatorial(0));
    }

    @Test
    public void logaritmoErro() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.logaritmo(0, 0));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.logaritmo(0, 3));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.logaritmo(3, 0));
    }

    @Test
    public void numeroPrimoErro() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.numeroPrimo(-1));
    }

    @Test
    public void produtoDeInteirosErro() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.produtoDeInteiros(0, 0));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.produtoDeInteiros(2, 0));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.produtoDeInteiros(0, 4));
    }

    @Test
    public void fibonacciZero() {
        assertEquals(0, Algoritmos.fibonacci(0));
    }

    @Test
    public void fibonacciUm() {
        assertEquals(1, Algoritmos.fibonacci(1));
    }

    @Test
    public void diaDaSemanaErro() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaDaSemana(33, 13, 2000));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaDaSemana(0, 0, 10));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaDaSemana(0, 6, 10));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaDaSemana(5, 1, 10));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaDaSemana(5, 12, 10));
    }

    @Test
    public void diaDaSemanaCerto() {
        assertEquals(5, Algoritmos.diaDaSemana(01, 10, 1650));
    }

    @Test
    public void diaDaSemanaCerto1() {
        assertEquals(5, Algoritmos.diaDaSemana(01, 1, 1650));
    }

    @Test
    public void diaDaSemanaCerto2() {
        assertEquals(1, Algoritmos.diaDaSemana(01, 2, 1650));
    }


    @Test
    public void razaoAureaErros() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.razaoAurea(-1, -2, 0));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.razaoAurea(2, -2, 0));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.razaoAurea(2, 3, 5));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.razaoAurea(-2, -1, 5));
    }

    @Test
    public void razaoAureaCerto() {
        assertEquals(1, Algoritmos.razaoAurea(5, 9, 2));
    }


    @Test
    public void maiorDivisorComumCerto() {
        assertEquals(6, Algoritmos.maiorDivisorComum(12, 6));
        assertEquals(6, Algoritmos.maiorDivisorComum2(12, 6));
        assertEquals(24, Algoritmos.maiorDivisorComum2(24, 24));
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
        assertFalse(Algoritmos.crivoEratostenes(sequencia, 2));
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