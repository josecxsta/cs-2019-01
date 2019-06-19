package com.github.josecxsta.ufg.cs.aula09.domain;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.text.Normalizer;


/**
*
*/
public class ArquivoService {

    public static final String folder = "input/json/";

    public static void monitorar() throws IOException, InterruptedException {
        //
        WatchService watchService
        = FileSystems.getDefault().newWatchService();

        // Path path = Paths.get(System.getProperty("user.home"));
        Path path = Paths.get(folder);

        path.register(
        watchService,
        StandardWatchEventKinds.ENTRY_CREATE,
        StandardWatchEventKinds.ENTRY_MODIFY);

        WatchKey key;
        while ((key = watchService.take()) != null) {
            for (WatchEvent<?> event : key.pollEvents()) {

                String out = folder + event.context();
                System.out.println(out);
                String text = getConteudoAsString(out);
                NotaFiscal nf = FromJsonToNotaFiscal.converte(text);
                System.out.println(nf.toString());
            }
            key.reset();
        }

    }

    /**
    * Palavras serão consultadas sem sinais ou acentos
    */
    private static String removeSinais(String entrada) {
        String sa = Normalizer.normalize(entrada, Normalizer.Form.NFD);

        return sa.replaceAll("\\p{M}", "");
    }

    public static String getConteudoAsString(final String nomeArquivo)
    throws IOException {

        String linhas = "";

        final FileInputStream fileStream = new FileInputStream(nomeArquivo);
        final InputStreamReader inSt = new
        InputStreamReader(fileStream, "UTF-8");
        final BufferedReader buffReader = new BufferedReader(inSt);

        String linha;
        while ((linha = buffReader.readLine()) != null) {
            linhas = linhas + removeSinais(linha);
        }

        buffReader.close();

        return linhas;
    }

    public void persisteAsZip() {

    }


}