package com.github.josecxsta.ufg.cs.aula09.domain;

import java.io.IOException;

/**
 *
 */
public class ConversaoUseCase {

  public static void iniciarMonitoramento() {
    try {
      ArquivoService.monitorar();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}