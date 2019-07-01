package com.github.josecxsta.ufg.cs.aula09.domain;

import java.io.File;
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
     *
     * @throws IOException se houver erro de entrada/saída.
     * @throws InterruptedException se houver interrupção
     */
    public static void iniciarMonitoramento()
    throws IOException, InterruptedException {
        final String caminho = ArquivoService.getCaminhoPasta();
        final File[] arquivos = ArquivoService
        .listaArquivosPasta(caminho);

        if (arquivos != null) {
            for (final File arquivo : arquivos) {
                ArquivoService.trataArquivo(caminho
                + ArquivoService.INPUT + arquivo.getName());
            }
        }

        ArquivoService.monitorarPasta(caminho);
    }

}
