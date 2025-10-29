package chapter_9;

public class TestAccount {
    public static void main(String[] args) {
        Account acc = new Account(1122, 20000);
        acc.setAnnualInterestRate(4.5); // 4.5%

        acc.withdraw(2500); // Withdraw $2,500
        acc.deposit(3000);  // Deposit $3,000

        System.out.println("Account ID: " + acc.getId());
        System.out.println("Balance: $" + acc.getBalance());
        System.out.printf("Monthly Interest: $%.2f\n", acc.getMonthlyInterest());
        System.out.println("Date Created: " + acc.getDateCreated());
    }
}

