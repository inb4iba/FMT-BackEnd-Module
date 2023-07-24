package entidades;

public class Produto {
    String nome;
    Double preco;
    Integer quantidade;

    public Produto() {
    }

    public Produto(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void adicionarAoEstoque(Integer quantidade) {
        this.quantidade += quantidade;
    }

    public void removerDoEstoque(Integer quantidade) {
        this.quantidade -= quantidade;
    }

    public Double getValorTotal() {
        return quantidade * preco;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " | Quantidade: " + quantidade + " | Preço: " + preco;
    }
}
