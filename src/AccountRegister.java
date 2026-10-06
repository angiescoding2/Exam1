import java.util.ArrayList;
import java.util.List;

public class AccountRegister {
    private List<Account> accounts = new ArrayList<>();

    public void createAccount(String name, int balance) {
        Account account = new Account(name, balance);
        accounts.add(account);
    }

    public SavingsAccount createSavingsAccount(String name, int balance, int interestRate) {
        SavingsAccount created = new SavingsAccount(name, balance, interestRate);
        accounts.add(created);
        return created;
    }
    public void printAll() {
        for (int i = 0; i < accounts.size(); i++) {
            Account a = accounts.get(i);
            a.printInfo();
        }

    } public Account findAccount(String name) {
        for (int i = 0; i < accounts.size(); i++) {
            Account a = accounts.get(i);
            if (a.getName().equalsIgnoreCase(name)) {
                return a;
            }
        }
        return null;
    }
}