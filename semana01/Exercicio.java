import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<String> students = new ArrayList<>();
    private static ArrayList<Double[]> scores = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Entre com o nome do aluno: ");
            String entry = sc.next();
            if (entry.equalsIgnoreCase("fim"))
                break;
            students.add(entry);
            scores.add(getScores());
        }
        printStudentsAndScores();
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

    private static void printStudentsAndScores() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " | " + formatScores(scores.get(i)));
        }
    }

    private static String formatScores(Double[] scores) {
        String scoresStr = "";
        Double average = 0.0;
        for (int i = 0; i < scores.length; i++) {
            scoresStr += "Nota " + (i + 1) + ": " + scores[i] + ", ";
            average += scores[i];
        }
        return scoresStr + " | Média: " + (average / scores.length);
    }
}
