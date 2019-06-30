package com.github.josecxsta.ufg.cs.aula09.domain;

import java.io.IOException;

/**
* Implementa o caso da conversão.
*/
public final class ConversaoUseCase {

    /**
    * Evita a instanciação.
    */
    private ConversaoUseCase() {
    }

    /**
    * Inicia o monitoramento da pasta.
    */
    public static void iniciarMonitoramento() {
        try {

            ArquivoService.listaArquivosPasta(
            ArquivoService.getCaminhoPasta() + ArquivoService.INPUT);

            ArquivoService.monitorarPasta(ArquivoService.getCaminhoPasta());
        } catch (IOException e) {
            Log.info("");
        } catch (InterruptedException e) {
            Log.info("");
        }
    }

}
