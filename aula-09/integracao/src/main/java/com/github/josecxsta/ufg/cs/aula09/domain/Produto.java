package com.github.josecxsta.ufg.cs.aula09.domain;

import java.nio.charset.StandardCharsets;

/**
 * Classe que implementa o modelo de Produto.
 */
public class Produto {
    public int codigo;
    public String descricao;

    /**
    * Construtor com código e descrição
    * @param codigo
    * @param descricao
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
     *
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     *
     * @param descricao
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     *
     * @return
     */
    public String getDescricao() {
        return this.descricao;
    }

    /**
     *
     */
    public int getCodigo() {
        return this.codigo;
    }

    /**
     *
     * @return
     */
    public byte[] getDescricaoAsByteArray() {
        byte[] descricao;
        if (this.get80CaracteresDescricao().length() > 80) {
            descricao = this.get80CaracteresDescricao()
                .getBytes(StandardCharsets.US_ASCII);
        } else {
            final int bytesRestantes = 80 - this.descricao.length();
            final String space = new String(new char[bytesRestantes])
                .replace('\0', ' ');
            final String spaceDesc = this.descricao + space;
            descricao = spaceDesc
                .getBytes(StandardCharsets.US_ASCII);
        }
        return descricao;
    }

    /**
     *
     * @return
     */
    public String get80CaracteresDescricao() {
        if (this.descricao.length() > 80) {
            return this.descricao.substring(0, 79);
        } else {
            return this.descricao;
        }
    }

}
