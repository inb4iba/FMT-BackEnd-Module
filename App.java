import java.time.LocalDate;
import java.util.ArrayList;

import entitades.Cargo;
import entitades.Colaborador;
import enums.Nivel;

public class App {
    private static ArrayList<Colaborador> colaboradores = new ArrayList<>();
    private static ArrayList<Cargo> cargos = new ArrayList<>();

    public static void main(String[] args) {
        Cargo cargo1 = new Cargo("Desenvolvedor Front-End", 2000.0, Nivel.JUNIOR);
        Cargo cargo2 = new Cargo("Desenvolvedor Front-End", 4500.0, Nivel.PLENO);
        Cargo cargo3 = new Cargo("Desenvolvedor Back-End", 2000.0, Nivel.JUNIOR);
        addCargos(cargo1, cargo2, cargo3);

        addColaborador(new Colaborador("Luquinhas", LocalDate.of(2023, 3,
                13), cargo1, 2500.0));
        addColaborador(new Colaborador("Pedrinho", LocalDate.of(2023, 3,
                13), cargo2, 5000.0));
        addColaborador(new Colaborador("Marquinhos", LocalDate.now(), cargo3, 2250.0));

        desligarColaborador(colaboradores.get(1));
        promoverColaborador(colaboradores.get(0), cargo2);

        System.out.println("Colaboradores Ativos:");
        listarColaboradoresAtivos();
        System.out.println("--------------------------\nColaboradores por Cargo:");
        listarColaboradoresPorCargo(cargo2);
    }

    private static void addCargos(Cargo... cargosParams) {
        for (Cargo cargo : cargosParams)
            cargos.add(cargo);
    }

    private static void addColaborador(Colaborador colaborador) {
        colaboradores.add(colaborador);
    }

    private static void desligarColaborador(Colaborador colaborador) {
        colaborador.setDtDesligamento(LocalDate.now());
    }

    private static void promoverColaborador(Colaborador colaborador, Cargo cargo) {
        colaborador.setCargo(cargo);
        colaborador.setSalario(cargo.getSalarioBase());
    }

    private static void listarColaboradoresAtivos() {
        colaboradores.forEach((c) -> {
            if (c.getDtDesligamento() == null)
                System.out.println(c);
        });
    }

    private static void listarColaboradoresPorCargo(Cargo cargo) {
        colaboradores.forEach((c) -> {
            if (c.getCargo().equals(cargo))
                System.out.println(c);
        });
    }
}
