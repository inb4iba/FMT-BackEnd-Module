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

        colaboradores.add(new Colaborador("Luquinhas", LocalDate.now(), cargo1, 2500.0));
        colaboradores.add(new Colaborador("Pedrinho", LocalDate.of(2023, 3,
                13), LocalDate.now(), cargo2, 5000.0));
        colaboradores.add(new Colaborador("Marquinhos", LocalDate.now(), cargo3, 2250.0));

        listarColaboradoresAtivos();
    }

    private static void addCargos(Cargo... cargosParams) {
        for (Cargo cargo : cargosParams)
            cargos.add(cargo);
    }

    private static void listarColaboradoresAtivos() {
        colaboradores.forEach((c) -> {
            if (c.getDtDesligamento() == null)
                System.out.println(c);
        });
    }
}
