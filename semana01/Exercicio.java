import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        while (true) {
            String entry = sc.nextLine();
            if (entry.equalsIgnoreCase("fim"))
                break;
            names.add(entry);
        }
        sc.close();
    }
}
