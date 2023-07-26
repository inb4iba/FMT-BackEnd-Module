package entidades;

import enums.TipoProduto;

public class Produto {
    private String nome;
    private Double preco;
    private TipoProduto tipo;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
        tipo = TipoProduto.COMUM;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public TipoProduto getTipo() {
        return tipo;
    }

    protected void setTipo(TipoProduto tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return nome + " R$ " + preco;
    }
}
