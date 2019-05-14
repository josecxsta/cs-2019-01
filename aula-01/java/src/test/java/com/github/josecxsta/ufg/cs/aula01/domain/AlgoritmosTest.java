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
    
}