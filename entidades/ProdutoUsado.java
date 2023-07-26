package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

    @Override
    public String toString() {
        return this.getNome() + " (usado) R$ " + this.getPreco() + " (Data de fabricação: "
                + dtFabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")";
    }
}
