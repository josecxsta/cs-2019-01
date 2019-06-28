package com.github.josecxsta.ufg.cs.aula09.domain;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.text.Normalizer;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Classe que implementa métodos necessários para manipulação de arquivos.
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
     * Monitora a pasta que recebe os arquivos em JSON que serão serializados,
     * transformados em byte comprimidos e salvos em outro diretório.
     *
     * @param caminho caminho da pasta que será monitorada
     */
    public static void monitorarPasta(String caminho)
    throws IOException, InterruptedException {

        WatchService watchService = FileSystems.getDefault().newWatchService();
        Path path = Paths.get(caminho + INPUT);
        path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE);
        Log.info("Pasta " + caminho + INPUT + " esta sendo assistida.");

        WatchKey key;
        while ((key = watchService.take()) != null) {
            for (WatchEvent<?> event : key.pollEvents()) {
                trataArquivo(getCaminhoPasta() + INPUT + event.context());
            }
            key.reset();
        }

    }

    private static void trataArquivo(final String arquivo) throws IOException {
        Log.info("Arquivo " + arquivo + " sera processado.");
        try {
            String text = getConteudoAsString(arquivo);
            NotaFiscal notaFiscal = FromJsonToNotaFiscal.converte(text);
            byte[] nfAsByte = FromNotaFiscalToBinario.converte(notaFiscal);
            persisteAsZip(nfAsByte);
            excluiArquivo(arquivo);
        } catch (IOException e) {
            Log.info("Erro");
        }

        // System.out.println(new String(nfAsByte));
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

        StringBuilder conteudo = new StringBuilder("");
        Path path = Paths.get(nomeArquivo);
        List<String> linhas = Files.readAllLines(path, StandardCharsets.UTF_8);
        for (String linha : linhas) {
            conteudo.append(removeSinais(linha));
        }

        return conteudo.toString();
    }

    /**
    * Salva o arquivo como zip no diretório
    * de saída da aplicação
    * @param notaFiscal nota fiscal já serializada e em array de byte
    */
    public static void persisteAsZip(byte[] notaFiscal) throws IOException {
        String filename = getCaminhoPasta() + OUTPUT
        + Seguranca.sha256(notaFiscal) + ".dat";

        ZipOutputStream zipout;
        FileOutputStream out = new FileOutputStream(filename);
        zipout = new ZipOutputStream(out);
        ZipEntry entry = new ZipEntry(filename);
        zipout.putNextEntry(entry);
        zipout.write(notaFiscal);
        zipout.close();

        // try (FileOutputStream fos = new FileOutputStream(filename)) {
        //     fos.write(notaFiscal);
        //     Log.info("Arquivo comprimido " + filename);
        // }
    }

    /**
    * Obtém o caminho da pasta que está armazenado
    * na variável de ambiente NOTAS_FISCAIS
    */
    public static String getCaminhoPasta() {
        if (System.getenv().get(VARIAVELAMBIENTE) == null) {
            Log.info("Variavel de ambiente inválida");
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
        Log.info("Arquivo " + nomeArquivo + " foi excluido.");
    }
}
