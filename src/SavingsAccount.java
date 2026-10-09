public class SavingsAccount extends Account {

    private int interestRate;

    public SavingsAccount(String name, int balance, int interestRate) {
        super(name, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void applyInterest() {
        int interest = getBalance() * interestRate / 100;
        System.out.println("Saldo före ränta: " + getBalance() + " kr");
        System.out.println("Beräknad ränta: " + interest + " kr");
        deposit(interest);
        System.out.println("Nytt saldo: " + getBalance() + " kr");
    }
    //Metod 3
        @Override
        public void printInfo() {
            super.printInfo();
            System.out.println("Ränta: " + interestRate + "%");
        }
    }