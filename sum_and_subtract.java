import java.util.Scanner;

public class sum_and_subtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first_operation = scanner.nextLine();
        String second_operation = scanner.nextLine();

        if (first_operation.length() != 5 || second_operation.length() != 5) {
            System.out.println("Inserisci due operazioni valide!");
            System.exit(1);
        }

        int a = 0, b = 4;
        for (int i = 0; i < 5; i++) {
            if (first_operation.charAt(i) == '+') {
                a += 1;
            } else if (first_operation.charAt(i) == '-') {
                a -= 1;
            }
            if (second_operation.charAt(i) == '+') {
                b += 1;
            } else if (second_operation.charAt(i) == '-') {
                b -= 1;
            }
            System.out.println("A: " + a + ", B: " + b);

            if (a == b) {
                System.out.println("A e B hanno raggiunto lo stesso valore");
                break;
            }
        }
    }
}
