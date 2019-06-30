package com.github.josecxsta.ufg.cs.aula09.domain;

/**
 * Implementa o modelo de ItemNotaFiscal.
 */
public class ItemNotaFiscal {
    /**
     * Quantidade do item.
     */
    private int quantidade;
    /**
     * Preço do item.
     */
    private double preco;
    /**
     * Produto do item.
     */
    private Produto produto;

    /**
     * Construtor.
     * @param quantidade Qtde de produtos.
     * @param preco Preço do produto.
     * @param produto Produto.
     */
    public ItemNotaFiscal(final int quantidade, final double preco,
    final Produto produto) {
        this.setQuantidade(quantidade);
        this.setPreco(preco);
        this.setProduto(produto);
    }

    /**
     * Construtor vazio.
     */
    public ItemNotaFiscal() {
    }

    /**
     * setter de quantidade.
     * @param quantidade quantidade
     */
    public final void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * setter de preço.
     * @param preco preço
     */
    public final void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * setter de produto.
     * @param produto produto
     */
    public final void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * getter de produto.
     * @return produto
     */
    public final Produto getProduto() {
        return this.produto;
    }

    /**
     * getter de preço.
     * @return preco
     */
    public final double getPreco() {
        return this.preco;
    }

    /**
     * getter de quantiddade.
     * @return quantidade
     */
    public final int getQuantidade() {
        return this.quantidade;
    }

}
