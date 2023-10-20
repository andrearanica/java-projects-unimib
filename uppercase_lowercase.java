import java.util.Scanner;

public class uppercase_lowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci una stringa maiuscola: ");
        char[] first_string = scanner.nextLine().toCharArray();
        System.out.print("Inserisci una stringa minuscola: ");
        char[] second_string = scanner.nextLine().toCharArray();

        for (int i = 0; i < first_string.length; i++) {
            if (!(first_string[i] >= 41 && first_string[i] <= 90)) {
                System.out.println("La prima stringa deve essere maiuscola");
                System.exit(1);
            }
        }

        for (int i = 0; i < second_string.length; i++) {
            if (!(second_string[i] >= 97 && second_string[i] <= 122)) {
                System.out.println("La seconda stringa deve essere minuscola");
                System.exit(1);
            }
        }

        for (int i = 0; i < first_string.length; i++) {
            for (int j = 0; j < second_string.length; j++) {
                System.out.println(String.valueOf(first_string[i]) + String.valueOf(second_string[j]));
            }
        }
    }
}
