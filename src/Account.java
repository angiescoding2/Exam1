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

    public void deposit(int amount) {
        balance += amount;
    }
    public void withdraw(int amount) {
        if (amount > this.balance) {
            System.out.println("Uttag medges ej — beloppet är större än saldot.");
        } else {
            this.balance = this.balance - amount;
        }
    }
}