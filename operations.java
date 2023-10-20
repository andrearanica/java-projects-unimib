import java.util.Scanner;

public class operations {
    static int N = 6;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        char sign = '+';
        int total = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Inserisci una cifra: ");
            number = scanner.nextInt();
            if (sign == '+') {
                total += number;
            } else if (sign == '-') {
                total -= number;
            } else {
                System.out.println("Hai inserito un'operazione non valida");
                return;
            }
            if (i != N - 1) {
                System.out.print("Inserisci un segno (+ o -): ");
                sign = scanner.next().charAt(0);
            }
        }

        scanner.close();

        System.out.println("Totale: " + total);
    }
}
