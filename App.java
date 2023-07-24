import entidades.Produto;

public class App {
    public static void main(String[] args) {
        Produto produto = new Produto("Produto 1", 25.0, 3);
        produto.adicionarAoEstoque(4);
        produto.removerDoEstoque(2);
        System.out.println(produto.getValorTotal().toString());
    }

}
