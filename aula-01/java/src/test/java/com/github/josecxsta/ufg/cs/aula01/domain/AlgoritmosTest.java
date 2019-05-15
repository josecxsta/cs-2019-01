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
        assertFalse(Algoritmos.CPF2("63377387055"));
    }

    @Test
    public void CPF2HigherArgument() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.CPF2("63377387055555"));
    }

    @Test
    public void CPF2LowerArgument() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.CPF2("63377387"));
    }

    public void CPF2False2() {
        assertFalse(Algoritmos.CPF2("1111111222222"));
    }

}