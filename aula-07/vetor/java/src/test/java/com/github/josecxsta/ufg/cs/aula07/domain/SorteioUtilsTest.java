package com.github.josecxsta.ufg.cs.aula07.domain;

import com.github.josecxsta.ufg.cs.aula07.domain.SorteioUtils;

import static org.junit.Assert.assertFalse;
import org.junit.jupiter.api.Test;

public class SorteioUtilsTest {

  @Test
  public void sorteio() {
    assertFalse(SorteioUtils.sorteio().getKey() == 12000);
  }

}