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
     * @param quantidadeParam Qtde de produtos.
     * @param precoParam Preço do produto.
     * @param produtoParam Produto.
     */
    public ItemNotaFiscal(final int quantidadeParam,
    final double precoParam, final Produto produtoParam) {
        this.setQuantidade(quantidadeParam);
        this.setPreco(precoParam);
        this.setProduto(produtoParam);
    }

    /**
     * Construtor vazio.
     */
    public ItemNotaFiscal() {
    }

    /**
     * setter de quantidade.
     * @param quantidadeParam quantidade
     */
    public final void setQuantidade(final int quantidadeParam) {
        this.quantidade = quantidadeParam;
    }

    /**
     * setter de preço.
     * @param precoParam preço
     */
    public final void setPreco(final double precoParam) {
        this.preco = precoParam;
    }

    /**
     * setter de produto.
     * @param produtoParam produto
     */
    public final void setProduto(final Produto produtoParam) {
        this.produto = produtoParam;
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
