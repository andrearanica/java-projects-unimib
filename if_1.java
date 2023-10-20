import java.util.Scanner;

public class if_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 != 0 && n >= 5 && n <= 55) {
            System.out.println("Il numero soddisfa le condizioni");
        } else {
            System.out.println("Il numero non soddisfa le condizioni");
        }
        scanner.close();
    }
}
