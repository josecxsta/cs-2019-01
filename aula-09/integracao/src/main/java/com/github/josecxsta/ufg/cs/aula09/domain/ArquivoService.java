package com.github.josecxsta.ufg.cs.aula09.domain;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
// import java.nio.file.*;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchKey;
import java.nio.file.WatchEvent;
import java.nio.file.WatchService;
import java.nio.file.Files;

import java.text.Normalizer;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Classe que implementa métodos necessários para manipulação de arquivos.
 */
public final class ArquivoService {

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
     * Pasta que recebe os JSONs que tiveram
     * erro ao serem serializados.
     */
    public static final String ERROR = "/erros/";

    /**
     * Evita instanciação.
     */
    private ArquivoService() {
    }

    /**
     * Monitora a pasta que recebe os arquivos em JSON que serão serializados,
     * transformados em byte comprimidos e salvos em outro diretório.
     *
     * @param caminho caminho da pasta que será monitorada
     * @throws IOException caso haja erro de entrada/saída.
     * @throws InterruptedException caso a operação seja interrompida.
     */
    public static void monitorarPasta(final String caminho)
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

    /**
     * Chama os métodos necessários
     * para o tratamento do arquivo.
     * @param arquivo arquivo JSON.
     * @throws IOException caso haja erro de entrada/saída.
     */
    private static void trataArquivo(final String arquivo)
    throws IOException {
        Log.info("Arquivo " + arquivo + " sera processado.");
        try {
            String text = getConteudoAsString(arquivo);
            NotaFiscal notaFiscal = FromJsonToNotaFiscal.converte(text);
            byte[] nfAsByte = FromNotaFiscalToBinario.converte(notaFiscal);
            persisteAsZip(nfAsByte);
            excluiArquivo(arquivo);
        } catch (IOException e) {
            Log.info("Erro ao processar arquivo " + arquivo);
            moveArquivoErro(arquivo);
        }

        // System.out.println(new String(nfAsByte));
    }

    /**
     * Remove sinais ou acentos de caracteres UTF-8.
     * @param entrada sequência que terá seus sinais/acentos removidos
     * @return sequência sem sinais especiais.
     */
    private static String removeSinais(final String entrada) {
        String sa = Normalizer.normalize(entrada, Normalizer.Form.NFD);
        return sa.replaceAll("\\p{M}", "");
    }

    /**
     * Transforma o conteúdo do arquivo especificado
     * em uma sequência de caracteres UTF-8.
     * @param nomeArquivo nome/caminho do arquivo.
     * @return conteúdo do arquivo como string.
     * @throws IOException caso haja erro de entrada/saída.
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
     * de saída da aplicação.
     * @param notaFiscal nota fiscal já serializada e em array de byte
     * @throws IOException caso haja erro com arquivo.
     */
    public static void persisteAsZip(final byte[] notaFiscal)
    throws IOException {

        String filename = SegurancaUtils
            .sha256(new String(notaFiscal));
        String zipname = getCaminhoPasta() + OUTPUT
        + filename + ".dat";

        ZipOutputStream zipout;
        FileOutputStream out = new FileOutputStream(zipname);
        zipout = new ZipOutputStream(out);
        ZipEntry entry = new ZipEntry(filename);
        zipout.putNextEntry(entry);
        zipout.write(notaFiscal);
        zipout.close();
        Log.info("Arquivo comprimido " + zipname);

        // try (FileOutputStream fos = new FileOutputStream(zipname)) {
        //     fos.write(notaFiscal);
        // }
    }

    /**
     * Obtém o caminho da pasta que está armazenado
     * na variável de ambiente NOTAS_FISCAIS.
     * @return caminho da pasta
     */
    public static String getCaminhoPasta() {
        if (System.getenv().get(VARIAVELAMBIENTE) == null) {
            Log.info("Variavel de ambiente inválida");
        }
        return System.getenv().get(VARIAVELAMBIENTE);
    }

    /**
    * Exclui o arquivo do disco.
    * @param caminho nome do arquivo a ser excluído
    */
    public static void excluiArquivo(final String caminho) {
        File arquivo = new File(caminho);
        arquivo.delete();
        Log.info("Arquivo " + caminho + " foi excluido.");
    }

    /**
     * Lista arquivos da pasta de input
     * em um determinado diretório.
     * @param caminho caminho do diretório
     * @return lista dos arquivos
     */
    public static File[] listaArquivosPasta(final String caminho) {
        File pasta = new File(caminho + INPUT);
        return pasta.listFiles();
    }

    /**
     * Move arquivo em que ocorre algum erro.
     * durante a operação para a pasta de erros.
     * @param caminho caminho do arquivo JSON
     */
    public static void moveArquivoErro(final String caminho) {
        File arquivo = new File(caminho);
        String novoNome = caminho.replaceAll(INPUT, ERROR);
        arquivo.renameTo(new File(novoNome));
        arquivo.delete();
        Log.info("Arquivo movido para: " + novoNome);
    }

}
