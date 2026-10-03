import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AccountRegister register = new AccountRegister();

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println();
            System.out.println("1. Skapa konto");
            System.out.println("2. Lista alla");
            System.out.println("3. Sätt in pengar");
            System.out.println("4. Avsluta");
            System.out.println("Val: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Namn: ");
                String name = scanner.nextLine();
                System.out.print("Startsaldo: ");
                int balance = scanner.nextInt();
                scanner.nextLine();
                register.createAccount(name, balance);
            }
        }
    }
}