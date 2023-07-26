package entidades;

import enums.TipoProduto;

public class ProdutoImportado extends Produto {

    private Double taxa;

    public ProdutoImportado(String nome, Double preco) {
        super(nome, preco);
        taxa = 20.0;
        this.setTipo(TipoProduto.IMPORTADO);
    }

    public Double getTaxa() {
        return taxa;
    }

}
