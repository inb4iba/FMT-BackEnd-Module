import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import entidades.Reserva;
import exececoes.ExcecaoDominio;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Reserva> reservas = new ArrayList<>();
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        int entrada = -1;
        do {
            System.out.println("\nMENU\n");
            System.out.println("1. Fazer uma nova reserva");
            System.out.println("2. Alterar uma reserva");
            System.out.println("3. Ver todas reservas");
            System.out.println("\n0. Fechar programa");
            try {
                System.out.println("\nEscolha uma opção:");
                entrada = Integer.parseInt(scanner.nextLine());

                switch (entrada) {
                    case 1:
                        fazerReserva();
                        break;
                    case 2:
                        alterarReserva();
                        break;
                    case 3:
                        mostrarReservas();
                        break;
                    case 0:
                        System.out.println("\nEncerrando o programa.");
                        break;
                    default:
                        System.out.println("\nEssa não é uma opção válida");
                        break;
                }
            } catch (Exception e) {
                System.out.println("\nEntrada precisa ser o número da opção selecionada");
                continue;
            }
        } while (entrada != 0);
    }

    private static void fazerReserva() {
        String quarto = fazerPergunta("\nNúmero do quarto:");
        String dtEntrada = fazerPergunta("Data de entrada (dd/MM/yyyy):");
        String dtSaida = fazerPergunta("Data de saída (dd/MM/yyyy):");
        try {
            Reserva reserva = new Reserva(quarto, LocalDate.parse(dtEntrada, formatter),
                    LocalDate.parse(dtSaida, formatter));
            reservas.add(reserva);
            System.out.println("\nReserva adicionada com sucesso");
            System.out.println(reserva);
        } catch (ExcecaoDominio e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void alterarReserva() {
        try {
            int numeroReserva = Integer.parseInt(fazerPergunta("\nQual o número da reserva:"));
            String dtEntrada = fazerPergunta("Data de entrada (dd/MM/yyyy):");
            String dtSaida = fazerPergunta("Data de saída (dd/MM/yyyy):");
            Reserva reserva = reservas.get(numeroReserva);
            reserva.atualizarReserva(LocalDate.parse(dtEntrada, formatter),
                    LocalDate.parse(dtSaida, formatter));
            System.out.println("\nReserva atualizada com sucesso");
            System.out.println(reserva);
        } catch (NumberFormatException e) {
            System.out.println("\nNúmero inválido. Veja as reservas pelo menu.");
        } catch (ExcecaoDominio e) {
            System.out.println(e.getMessage());
        }

    }

    private static String fazerPergunta(String msg) {
        System.out.println(msg);
        return scanner.nextLine();
    }

    private static void mostrarReservas() {
        reservas.forEach(r -> {
            System.out.println(reservas.indexOf(r) + ". " + r);
        });
    }
}
