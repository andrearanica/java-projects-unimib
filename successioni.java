import java.util.Scanner;

class Successioni {
    private static int succession (int num) {
        if (num == 0) {
            return 2;
        }
        return 3 * succession(num - 1) - 2;
    }
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero:\n> ");
        int num = scanner.nextInt();        
        scanner.close();

        if (num <= 0) {
            System.out.println("Hai inserito un numero non positivo");
            return;
        }

        System.out.println("Valore della successione per il numero " + num + " vale " + succession(num));
    }
}