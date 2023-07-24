import java.util.ArrayList;

import entidades.Produto;

public class Main {
    private static ArrayList<Produto> estoque = new ArrayList<>();

    public static void main(String[] args) {
        estoque.add(new Produto("Produto 1", 25.0, 3));
        estoque.add(new Produto("Produto 2", 65.0, 10));
        estoque.add(new Produto("Produto 3", 90.0, 2));
    }

}
