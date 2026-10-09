public class Account {
    private String name;
    private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void printInfo() {
        System.out.println("Konto: " + name + " | Saldo: " + balance);
    }

    public void deposit(int amount) {
        balance += amount;
    }
    //Metod 1
    public void withdraw(int amount) {
        if (amount > this.balance) {
            System.out.println("Uttag medges ej — beloppet är större än saldot.");
        } else {
            this.balance = this.balance - amount;
        }
    }
    public void applyInterest() {
        System.out.println("Det här kontot har ingen ränta.");
    }
}