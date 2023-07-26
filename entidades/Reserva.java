package entidades;

import java.time.LocalDate;

public class Reserva {
    private String numeroQuarto;
    private LocalDate dtEntrada;
    private LocalDate dtSaida;

    public Reserva(String numeroQuarto, LocalDate dtEntrada, LocalDate dtSaida) {
        this.numeroQuarto = numeroQuarto;
        this.dtEntrada = dtEntrada;
        this.dtSaida = dtSaida;
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
}
