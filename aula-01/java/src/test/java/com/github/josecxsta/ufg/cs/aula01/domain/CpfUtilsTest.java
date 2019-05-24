package com.github.josecxsta.ufg.cs.aula01.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CpfUtilsTest {

    // @Test
    // public void classTest() {
    //     assertThrows(UnsupportedOperationException.class, () -> new Cpf());
    // }

    @Test
    public void CPFTrue() {
        assertTrue(CpfUtils.validaCpf("04080524145"));
    }

    @Test
    public void CPFFalse() {
        assertFalse(CpfUtils.validaCpf("63377387055"));
    }

    @Test
    public void CPFHigherArgument() {
        assertThrows(IllegalArgumentException.class, () -> CpfUtils.validaCpf("63377387055555"));
    }

    @Test
    public void CPFLowerArgument() {
        assertThrows(IllegalArgumentException.class, () -> CpfUtils.validaCpf("63377387"));
    }

    @Test
    public void CPF2True() {
        assertTrue(CpfUtils.validaCpf2("04080524145"));
    }

    @Test
    public void CPF2False() {
        assertFalse(CpfUtils.validaCpf2("12345678912"));
    }

    @Test
    public void CPF2HigherArgument() {
        assertThrows(IllegalArgumentException.class, () -> CpfUtils.validaCpf2("63377387055555"));
    }

    @Test
    public void CPF2LowerArgument() {
        assertThrows(IllegalArgumentException.class, () -> CpfUtils.validaCpf2("63377387"));
    }

    @Test
    public void CPF2False2() {
        assertFalse(CpfUtils.validaCpf2("12345678912"));
    }


}