package com.github.josecxsta.ufg.cs.aula09.domain;

/**
*
*/
public class ItemNotaFiscal {
    private int quantidade;
    private double preco;
    private Produto produto;

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

    public ItemNotaFiscal() {
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

}
