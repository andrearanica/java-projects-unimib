import java.util.Scanner;

public class number_to_binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero compreso tra 0 e 127");
        int num = scanner.nextInt();
        if (num < 0 || num > 127) {
            System.out.println("Condizioni non soddisfatte");
            System.exit(1);
        }

        String binary_num = "";
        while (num >= 1) {
            if (num % 2 == 0) {
                binary_num = "0" + binary_num;
            } else {
                binary_num = "1" + binary_num;
            }
            num = num / 2;
        }
        System.out.println("Numero in binario: " + binary_num);
    }
}
