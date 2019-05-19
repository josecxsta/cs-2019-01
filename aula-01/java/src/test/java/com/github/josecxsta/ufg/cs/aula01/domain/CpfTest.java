package com.github.josecxsta.ufg.cs.aula01.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CpfTest {

    @Test
    public void classTest() {
        assertThrows(UnsupportedOperationException.class, () -> new Cpf());
    }

    @Test
    public void CPFTrue() {
        assertTrue(Cpf.validaCpf("04080524145"));
    }

    @Test
    public void CPFFalse() {
        assertFalse(Cpf.validaCpf("63377387055"));
    }

    @Test
    public void CPFHigherArgument() {
        assertThrows(IllegalArgumentException.class, () -> Cpf.validaCpf("63377387055555"));
    }

    @Test
    public void CPFLowerArgument() {
        assertThrows(IllegalArgumentException.class, () -> Cpf.validaCpf("63377387"));
    }

    @Test
    public void CPF2True() {
        assertTrue(Cpf.validaCpf2("04080524145"));
    }

    @Test
    public void CPF2False() {
        assertFalse(Cpf.validaCpf2("12345678912"));
    }

    @Test
    public void CPF2HigherArgument() {
        assertThrows(IllegalArgumentException.class, () -> Cpf.validaCpf2("63377387055555"));
    }

    @Test
    public void CPF2LowerArgument() {
        assertThrows(IllegalArgumentException.class, () -> Cpf.validaCpf2("63377387"));
    }

    @Test
    public void CPF2False2() {
        assertFalse(Cpf.validaCpf2("12345678912"));
    }


}