package entitades;

import java.time.LocalDate;

public class Colaborador {
    private String nome;
    private LocalDate dtAdmissao;
    private LocalDate dtDesligamento;
    private Cargo cargo;
    private Double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDtAdmissao() {
        return dtAdmissao;
    }

    public void setDtAdmissao(LocalDate dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }

    public LocalDate getDtDesligamento() {
        return dtDesligamento;
    }

    public void setDtDesligamento(LocalDate dtDesligamento) {
        this.dtDesligamento = dtDesligamento;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nCargo: {\n" +
                "}\nSalário: " + salario +
                "\nData de Admissão: " + dtAdmissao +
                "\nData de Desligamento: " + dtDesligamento;
    }
}
