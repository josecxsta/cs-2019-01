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
     * @param codigo codigo do produto.
     * @param descricao descrição do produto.
     */
    public Produto(final int codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    /**
    * Construtor de produto vazio.
    */
    public Produto() {
    }

    /**
    * Setter de código.
    * @param codigo
    */
    public final void setCodigo(final int codigo) {
        this.codigo = codigo;
    }

    /**
    * Setter de descrição.
    * @param descricao descrição
    */
    public final void setDescricao(final String descricao) {
        this.descricao = descricao;
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
        byte[] descricao;
        if (this.get80CaracteresDescricao().length() > MAX_DESC) {
            descricao = this.get80CaracteresDescricao()
            .getBytes(StandardCharsets.US_ASCII);
        } else {
            final int bytesRestantes = MAX_DESC - this.descricao.length();
            final String space = new String(new char[bytesRestantes])
            .replace('\0', ' ');
            final String spaceDesc = this.descricao + space;
            descricao = spaceDesc
            .getBytes(StandardCharsets.US_ASCII);
        }
        return descricao;
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
