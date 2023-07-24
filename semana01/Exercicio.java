import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String entry = sc.nextLine();
            if (entry.equalsIgnoreCase("fim"))
                break;
        }
        sc.close();
    }
}
