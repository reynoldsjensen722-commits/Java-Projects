package chapter_11;

public class TestAccountHierarchy {
    public static void main(String[] args) {
        Account acc = new Account(1001, 500);
        acc.setAnnualInterestRate(1.2);

        SavingsAccount sav = new SavingsAccount(1002, 1000);
        CheckingAccount chk = new CheckingAccount(1003, 400, 200);

        sav.withdraw(1100); // Should deny
        chk.withdraw(550);  // Allowed (within overdraft)

        System.out.println(acc);
        System.out.println(sav);
        System.out.println(chk);
    }
}

