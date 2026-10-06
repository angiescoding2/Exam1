import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AccountRegister register = new AccountRegister();

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 6) {
            System.out.println();
            System.out.println("1. Skapa konto");
            System.out.println("2. Skapa sparkonto");
            System.out.println("3. Lista alla");
            System.out.println("4. Sätt in pengar");
            System.out.println("5. Ta ut pengar");
            System.out.println("6. Avsluta");
            System.out.print("Val: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Namn: ");
                String name = scanner.nextLine();
                System.out.print("Startsaldo: ");
                int balance = scanner.nextInt();
                scanner.nextLine();
                register.createAccount(name, balance);
                System.out.println("Kontot skapat.");
            }
            else if (choice == 2) {
                System.out.print("Namn: ");
                String name = scanner.nextLine();

                System.out.print("Startsaldo: ");
                int balance = scanner.nextInt();

                System.out.print("Ränta i procent: ");
                int interestRate = scanner.nextInt();
                scanner.nextLine();

                register.createSavingsAccount(name, balance, interestRate);
                System.out.println("Sparkontot skapat.");
            }
            else if (choice == 3) {
                register.printAll();

            } else if (choice == 4) {
                System.out.print("Namn: ");
                String name = scanner.nextLine();
                Account found = register.findAccount(name);
                if (found != null) {
                    System.out.print("Belopp: ");
                    int amount = scanner.nextInt();
                    scanner.nextLine();
                    found.deposit(amount);
                    System.out.println("Nytt saldo: " + found.getBalance());
                } else {
                    System.out.println("Konto saknas:" + name);
                }
            } else if (choice == 5) {
                System.out.print("Namn: ");
                String name = scanner.nextLine();

                Account found = register.findAccount(name);

                if (found != null) {
                    System.out.print("Belopp: ");
                    int amount = scanner.nextInt();
                    scanner.nextLine();

                    found.withdraw(amount);
                    System.out.println("Nytt saldo: " + found.getBalance());
                } else {
                    System.out.println("Konto saknas: " + name);
                }

            } else if (choice == 6) {
                System.out.println("Hej då! Välkommen åter.");
            } else {
                System.out.println("Ogiltigt val.");
            }

        }
    }
}
