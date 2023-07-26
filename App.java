import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import entidades.Reserva;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Reserva> reservas = new ArrayList<>();

    public static void main(String[] args) {
        fazerReserva();
    }

    private static void fazerReserva() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("\nNúmero do quarto:");
        String quarto = scanner.nextLine();
        System.out.println("Data de entrada (dd/MM/yyyy):");
        String dtEntrada = scanner.nextLine();
        System.out.println("Data de saída (dd/MM/yyyy):");
        String dtSaida = scanner.nextLine();
        Reserva reserva = new Reserva(quarto, LocalDate.parse(dtEntrada, formatter),
                LocalDate.parse(dtSaida, formatter));
        reservas.add(reserva);
        System.out.println("\nReserva adicionada com sucesso");
    }
}
