package entidades;

import java.time.LocalDate;

import enums.TipoProduto;

public class ProdutoUsado extends Produto {

    private LocalDate dtFabricacao;

    public ProdutoUsado(String nome, Double preco, LocalDate dtFabricacao) {
        super(nome, preco);
        this.dtFabricacao = dtFabricacao;
        this.setTipo(TipoProduto.USADO);
    }

    public LocalDate getDtFabricacao() {
        return dtFabricacao;
    }

    public void setDtFabricacao(LocalDate dtFabricacao) {
        this.dtFabricacao = dtFabricacao;
    }

}
