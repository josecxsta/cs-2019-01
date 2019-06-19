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

}