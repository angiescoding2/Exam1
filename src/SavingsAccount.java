public class SavingsAccount extends Account {

    private int interestRate;

    public SavingsAccount(String name, int balance, int interestRate) {
        super(name, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        int interest = getBalance() * interestRate / 100;
        deposit(interest);

    }
}