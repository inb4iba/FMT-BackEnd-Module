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
    }

    private static void addCargos(Cargo... cargosParams) {
        for (Cargo cargo : cargosParams)
            cargos.add(cargo);
    }
}
