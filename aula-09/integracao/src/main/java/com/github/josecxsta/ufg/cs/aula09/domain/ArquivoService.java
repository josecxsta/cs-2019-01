package com.github.josecxsta.ufg.cs.aula09.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.text.Normalizer;

/**
 * Classe que implementa métodos necessários
 * para manipulação de arquivos.
 */
public class ArquivoService {

    /**
     * Variável de ambiente que salva pasta que será monitorada.
     */
    public static final String VARIAVELAMBIENTE = "NOTAS_FISCAIS";

    /**
     * Pasta que recebe arquivos JSON.
     */
    public static final String INPUT = "/json/";

    /**
     * Pasta em que será salvo o arquivo comprimido.
     */
    public static final String OUTPUT = "/dat/";

    /**
     * Monitora a pasta que recebe os arquivos em JSON
     * que serão serializados, transformados em byte
     * comprimidos e salvos em outro diretório.
     * @param caminho caminho da pasta que será monitorada
     */
    public static void monitorarPasta(String caminho)
    throws IOException, InterruptedException {
        WatchService watchService = FileSystems.getDefault()
            .newWatchService();

        Path path = Paths.get(caminho + INPUT);
        path.register(watchService,
        StandardWatchEventKinds.ENTRY_CREATE);

        WatchKey key;
        while ((key = watchService.take()) != null) {
            for (WatchEvent<?> event : key.pollEvents()) {
                trataArquivo(getCaminhoPasta() + INPUT + event.context());
            }
            key.reset();
        }

    }

    private static void trataArquivo(final String arquivo) throws IOException {
        String text = getConteudoAsString(arquivo);
        NotaFiscal notaFiscal = FromJsonToNotaFiscal.converte(text);
        byte[] nfAsByte = FromNotaFiscalToBinario.converte(notaFiscal);

        persisteAsZip(nfAsByte);
        excluiArquivo(arquivo);

        System.out.println(new String(nfAsByte));
    }

    /**
     * Remove sinais ou acentos de caracteres UTF-8
     * @param entrada sequência que terá seus sinais/acentos removidos
     */
    private static String removeSinais(String entrada) {
        String sa = Normalizer.normalize(entrada, Normalizer.Form.NFD);
        return sa.replaceAll("\\p{M}", "");
    }

    /**
     * Transforma o conteúdo do arquivo especificado
     * em uma sequência de caracteres UTF-8.
     * @param nomeArquivo nome/caminho do arquivo.
     */
    public static String getConteudoAsString(final String nomeArquivo)
    throws IOException {

        String linhas = "";
        System.out.println(nomeArquivo);
        final FileInputStream fStream = new FileInputStream(nomeArquivo);
        final InputStreamReader inSt = new
        InputStreamReader(fStream, "UTF-8");
        final BufferedReader buffReader = new BufferedReader(inSt);

        String linha;
        while ((linha = buffReader.readLine()) != null) {
            linhas = linhas + removeSinais(linha);
        }

        fStream.close();
        buffReader.close();

        return linhas;
    }

    /**
     * Salva o arquivo como zip no diretório
     * de saída da aplicação
     * @param notaFiscal nota fiscal já serializada e em array de byte
     */
    public static void persisteAsZip(byte[] notaFiscal) throws IOException {
        String filename = getCaminhoPasta() + OUTPUT
            + Seguranca.sha256(notaFiscal) + ".dat";
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            fos.write(notaFiscal);
        }
    }

    /**
     * Obtém o caminho da pasta que está armazenado
     * na variável de ambiente NOTAS_FISCAIS
     */
    public static String getCaminhoPasta() {
        if (System.getenv().get(VARIAVELAMBIENTE) == null) {
            System.out.println("Variavel inválida");
        }
        return System.getenv().get(VARIAVELAMBIENTE);
    }

    /**
     * Exclui o arquivo do disco.
     * @param nomeArquivo nome do arquivo a ser excluído.
     */
    public static void excluiArquivo(final String nomeArquivo) {
        File arquivo = new File(nomeArquivo);
        arquivo.delete();
    }
}