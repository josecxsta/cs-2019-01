package com.github.josecxsta.ufg.cs.aula01.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DataTest {

  @Test
  public void classTest() {
      assertThrows(UnsupportedOperationException.class, () -> new Data());
  }

  @Test
  public void diaDaSemanaErro() {
      assertThrows(IllegalArgumentException.class, () -> Data.diaDaSemana(33, 13, 2000));
      assertThrows(IllegalArgumentException.class, () -> Data.diaDaSemana(0, 0, 10));
      assertThrows(IllegalArgumentException.class, () -> Data.diaDaSemana(0, 6, 10));
      assertThrows(IllegalArgumentException.class, () -> Data.diaDaSemana(5, 1, 10));
      assertThrows(IllegalArgumentException.class, () -> Data.diaDaSemana(5, 12, 10));
  }

  @Test
  public void diaDaSemanaCerto() {
      assertEquals(5, Data.diaDaSemana(01, 10, 1650));
  }

  @Test
  public void diaDaSemanaCerto1() {
      assertEquals(5, Data.diaDaSemana(01, 1, 1650));
  }

  @Test
  public void diaDaSemanaCerto2() {
      assertEquals(1, Data.diaDaSemana(01, 2, 1650));
  }


}