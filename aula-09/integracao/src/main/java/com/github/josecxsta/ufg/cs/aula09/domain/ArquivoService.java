package com.github.josecxsta.ufg.cs.aula09.domain;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.text.Normalizer;


/**
*
*/
public class ArquivoService {

    public static final String folder = "input/json/";
    public static final String output = "input/dat/";

    public static void monitorar() throws IOException, InterruptedException {
        WatchService watchService = FileSystems.getDefault()
            .newWatchService();

        // Path path = Paths.get(System.getProperty("user.home"));
        Path path = Paths.get(folder);

        path.register(watchService,
        StandardWatchEventKinds.ENTRY_CREATE);

        WatchKey key;

        while ((key = watchService.take()) != null) {
            for (WatchEvent<?> event : key.pollEvents()) {

                String out = folder + event.context();
                System.out.println(out);
                String text = getConteudoAsString(out);
                NotaFiscal nf = FromJsonToNotaFiscal.converte(text);
                byte[] bte = FromNotaFiscalToBinario.converte(nf);

                persisteAsZip(bte);

                System.out.println(new String(bte));
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

        final FileInputStream fStream = new FileInputStream(nomeArquivo);
        final InputStreamReader inSt = new
        InputStreamReader(fStream, "UTF-8");
        final BufferedReader buffReader = new BufferedReader(inSt);

        String linha;
        while ((linha = buffReader.readLine()) != null) {
            linhas = linhas + removeSinais(linha);
        }

        buffReader.close();

        return linhas;
    }

    public static void persisteAsZip(byte[] notaFiscal) throws IOException {
        String filename = output + Seguranca.sha256(notaFiscal) + ".dat";
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            fos.write(notaFiscal);
        }
    }


}