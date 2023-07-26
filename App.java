import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;
import enums.TipoProduto;

public class App {
    private static ArrayList<Produto> produtos = new ArrayList<>();

    public static void main(String[] args) {
        int nProdutos = getTotalProdutos();
        criarListaProdutos(nProdutos);

        produtos.forEach(p -> System.out.println(p));
    }

    private static int getTotalProdutos() {
        int numProdutos = -1;
        do {
            String entrada = JOptionPane.showInputDialog("Entre com o número de produtos");
            try {
                numProdutos = Integer.parseInt(entrada);
                if (numProdutos <= 0)
                    new Exception().notify();
            } catch (Throwable err) {
                JOptionPane.showMessageDialog(null, "Número de produtos inválido");
            }
        } while (numProdutos <= 0);
        return numProdutos;
    }

    private static void criarListaProdutos(int n) {
        int i = 1;
        while (i <= n) {
            int tipo = JOptionPane.showOptionDialog(null, "Tipo do produto", "Produto #" + i,
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, TipoProduto.values(), null);
            Produto produto = cadastrarProduto(TipoProduto.values()[tipo]);
            produtos.add(produto);
            i++;
        }
    }

    private static Produto cadastrarProduto(TipoProduto tipo) {
        String entrada, nome;
        double preco;
        // LocalDate data;
        Produto produto = null;
        do {
            try {
                nome = JOptionPane.showInputDialog("Nome do produto");
                entrada = JOptionPane.showInputDialog("Preço do produto");
                preco = Double.parseDouble(entrada);
                switch (tipo) {
                    case COMUM -> {
                        produto = new Produto(nome, preco);
                    }
                    case IMPORTADO -> {
                        produto = new ProdutoImportado(nome, preco);
                    }
                    case USADO -> {
                        entrada = JOptionPane.showInputDialog("Data de fabricação (dd/mm/aaaa)");
                        // data = new SimpleDateFormat("dd/MM/yyyy").parse(entrada);
                        produto = new ProdutoUsado(nome, preco, LocalDate.now());
                    }
                    default -> new Exception().notify();
                }
            } catch (Throwable err) {
                JOptionPane.showMessageDialog(null, "Produto " + tipo + " inválido");
            }
        } while (produto == null);
        return produto;
    }
}
