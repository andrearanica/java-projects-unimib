import java.util.Scanner;

public class estremo_superiore {
    public static void main(String[] args) {
        double epsilon = 0;

        while (epsilon <= 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Inserisci un epsilon > 0\n> ");
            epsilon = scanner.nextDouble();
            scanner.close();
        }

        int i = 0;
        boolean found = false;
        while (!found) {
            double value = ((double)i / (double)(i + 1));

            if (value > 1 - epsilon && value <= 1) {
                found = true;
                break;
            }

            i += 1;
        }

        System.out.println("Valore di n: " + i);
    }
}
