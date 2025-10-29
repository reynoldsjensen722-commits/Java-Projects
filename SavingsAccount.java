package chapter_11;

public class SavingsAccount extends Account {
    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied: Insufficient funds in SavingsAccount.");
        }
    }

    @Override
    public String toString() {
        return "SavingsAccount: " + super.toString();
    }
}

