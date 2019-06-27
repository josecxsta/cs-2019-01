package com.github.josecxsta.ufg.cs.aula09.domain;

/**
*
*/
public class Produto {
    public int codigo;
    public String descricao;

    /**
    *
    * @param codigo
    * @param descricao
    */
    public Produto(final int codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Produto() {
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public byte[] getDescricaoAsByteArray() {
        byte[] descricao;
        if (this.get80CaracteresDescricao().length() > 80) {
            descricao = this.get80CaracteresDescricao().getBytes();
        } else {
            final int bytesRestantes = 80 - this.descricao.length();
            final String space = new String(new char[bytesRestantes])
                .replace('\0', ' ');
            final String spaceDesc = this.descricao + space;
            descricao = spaceDesc.getBytes();
        }
        return descricao;
    }

    public String get80CaracteresDescricao() {
        if (this.descricao.length() > 80) {
            return this.descricao.substring(0, 79);
        } else {
            return this.descricao;
        }
    }

}
