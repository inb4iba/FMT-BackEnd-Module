import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double[]> scores = new ArrayList<>();
        while (true) {
            System.out.println("Entre com o nome do aluno: ");
            String entry = sc.next();
            if (entry.equalsIgnoreCase("fim"))
                break;
            names.add(entry);
            scores.add(getScores());
        }
        sc.close();
    }

    private static Double[] getScores() {
        Double[] scores = new Double[3];
        for (int i = 1; i <= scores.length; i++) {
            System.out.println("Entre com a nota " + i + ": ");
            Double score = sc.nextDouble();
            scores[i - 1] = score;
        }
        return scores;
    }
}
