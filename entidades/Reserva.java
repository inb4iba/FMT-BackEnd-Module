package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import exececoes.ExcecaoDominio;

public class Reserva {
    private String numeroQuarto;
    private LocalDate dtEntrada;
    private LocalDate dtSaida;

    public Reserva(String numeroQuarto, LocalDate dtEntrada, LocalDate dtSaida) throws ExcecaoDominio {
        this.numeroQuarto = numeroQuarto;
        checarDatas(dtEntrada, dtSaida);
    }

    public String getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(String numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public LocalDate getDtEntrada() {
        return dtEntrada;
    }

    public void setDtEntrada(LocalDate dtEntrada) {
        this.dtEntrada = dtEntrada;
    }

    public LocalDate getDtSaida() {
        return dtSaida;
    }

    public void setDtSaida(LocalDate dtSaida) {
        this.dtSaida = dtSaida;
    }

    public void checarDatas(LocalDate entrada, LocalDate saida) throws ExcecaoDominio {
        if (entrada.isAfter(saida))
            throw new ExcecaoDominio("Erro na Reserva: Data de Saída deve ser após Data de Entrada.");

        if (entrada.isBefore(LocalDate.now()))
            throw new ExcecaoDominio("Erro na Reserva: Datas da Reserva deve ser posterior a hoje.");

        this.dtEntrada = entrada;
        this.dtSaida = saida;
    }

    public void atualizarReserva(LocalDate entrada, LocalDate saida) throws ExcecaoDominio {
        if (entrada.isBefore(dtEntrada))
            throw new ExcecaoDominio("Erro na Reserva: Datas da Reserva deve ser atualizada para datas futuras.");

        checarDatas(entrada, saida);
    }

    public String toString() {
        return "Reserva: Quarto " + numeroQuarto +
                ", Entrada: " + dtEntrada.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", Saída: " + dtSaida.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", " + ChronoUnit.DAYS.between(dtEntrada, dtSaida) + " noites";
    }
}
