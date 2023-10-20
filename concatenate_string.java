import java.util.Scanner;

public class concatenate_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Inserisci una stringa: ");
        String messaggio = scanner.nextLine();
        System.out.println("Inserisci un numero: ");
        int posizione = scanner1.nextInt();
        System.out.println("Inserisci un'altra stringa: ");
        String stringa = scanner.nextLine();

        System.out.println("Il messaggio è: " + (messaggio.substring(0, posizione) + stringa + messaggio.substring(posizione)));
        scanner.close();
    }
}
