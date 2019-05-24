package com.github.josecxsta.ufg.cs.aula01.domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PropriedadeUtilsTest {
  @Test
  public void prop153() {
    assertTrue(PropriedadeUtils.prop153(153));
    assertFalse(PropriedadeUtils.prop153(154));
    assertThrows(IllegalArgumentException.class, () -> PropriedadeUtils.prop153(-2));
    assertThrows(IllegalArgumentException.class, () -> PropriedadeUtils.prop153(99999));
  }

  @Test
  public void prop3025() {
    assertFalse(PropriedadeUtils.prop3025(154));
    assertTrue(PropriedadeUtils.prop3025(3025));
    assertThrows(IllegalArgumentException.class, () -> PropriedadeUtils.prop3025(99999));
    assertThrows(IllegalArgumentException.class, () -> PropriedadeUtils.prop3025(-2));
  }

}
