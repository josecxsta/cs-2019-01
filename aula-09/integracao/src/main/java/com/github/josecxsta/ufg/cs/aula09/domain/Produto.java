package com.github.josecxsta.ufg.cs.aula09.domain;

import java.nio.charset.StandardCharsets;

/**
 * Classe que implementa o modelo de Produto.
 */
public class Produto {
    /**
     * Código do produto.
     */
    private int codigo;
    /**
     * Descrição do produto.
     */
    private String descricao;

    /**
     * Quantidade máxima de caracteres na
     * descrição em byte.
     */
    public static final int MAX_DESC = 80;

    /**
     * Construtor com código e descrição.
     *
     * @param codigoParam codigo do produto.
     * @param descricaoParam descrição do produto.
     */
    public Produto(final int codigoParam, final String descricaoParam) {
        this.codigo = codigoParam;
        this.descricao = descricaoParam;
    }

    /**
    * Construtor de produto vazio.
    */
    public Produto() {
    }

    /**
    * Setter de código.
    * @param codigoParam código
    */
    public final void setCodigo(final int codigoParam) {
        this.codigo = codigoParam;
    }

    /**
    * Setter de descrição.
    * @param descParam descrição
    */
    public final void setDescricao(final String descParam) {
        this.descricao = descParam;
    }

    /**
    * Getter de descrição.
    * @return descrição
    */
    public final String getDescricao() {
        return this.descricao;
    }

    /**
     * getter do código.
     * @return codigo do produto
     */
    public final int getCodigo() {
        return this.codigo;
    }

    /**
     * Obtém a descrição do produto em um array de bytes.
     * @return array de bytes com a descrição
     */
    public final byte[] getDescricaoAsByteArray() {
        byte[] descricaoByte;
        if (this.get80CaracteresDescricao().length() > MAX_DESC) {
            descricaoByte = this.get80CaracteresDescricao()
            .getBytes(StandardCharsets.US_ASCII);
        } else {
            final int bytesRestantes = MAX_DESC - this.descricao.length();
            final String space = new String(new char[bytesRestantes])
            .replace('\0', ' ');
            final String spaceDesc = this.descricao + space;
            descricaoByte = spaceDesc
            .getBytes(StandardCharsets.US_ASCII);
        }
        return descricaoByte;
    }

    /**
     * Pega os primeiros 80 caracteres da
     * descrição do produto.
     * @return 80 caracteres de descrição
     */
    public final String get80CaracteresDescricao() {
        if (this.descricao.length() > MAX_DESC) {
            return this.descricao.substring(0, (MAX_DESC - 1));
        } else {
            return this.descricao;
        }
    }

}
