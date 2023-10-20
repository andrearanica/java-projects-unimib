import java.util.Scanner;

public class string_uppercase_module {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una stringa minuscola: ");
        String string = scanner.nextLine();

        int k = string.length();
        for (int i = 0; i < k - 1; i++) {
            if (!(string.charAt(i) >= 97 && string.charAt(i) <= 122)) {
                System.out.println("La stringa deve essere minuscola");
                System.exit(1);
            }
        }

        System.out.print("Inserisci n: ");
        int n = scanner.nextInt();
        System.out.print("Inserisci m: ");
        int m = scanner.nextInt();
        if (n < 0 || n > k - 1 || m < 0 || m > k - 1) {
            System.out.println("m e n devono essere compresi tra 1 e " + (k - 1));
            System.exit(1);
        }

        int index;
        for (int i = 0; i < k; i++) {
            if (i == 0) {
                index = m;
            } else {
                index = (m + (n * i)) % k;
            }
            
            if (!Character.isUpperCase(string.charAt(index))) {
                string = string.substring(0, index) + Character.toUpperCase(string.charAt(index)) + string.substring(index + 1);
            }
        }

        System.out.println("Nuova stringa: " + string);
    }
}
