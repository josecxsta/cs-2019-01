package com.github.josecxsta.ufg.cs.aula09.domain;

/**
*
*/
public class ItemNotaFiscal {
    public int quantidade;
    public double preco;
    public Produto produto;

    /**
    *
    * @param quantidade
    * @param preco
    * @param produto
    */
    public ItemNotaFiscal(final int quantidade, final double preco,
    final Produto produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

}