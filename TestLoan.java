package chapter_12;

public class TestLoan {
    public static void main(String[] args) {
        try {
            Loan loan = new Loan(0, 5, 10000); // Invalid rate
            System.out.println("Monthly Payment: " + loan.getMonthlyPayment());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Loan loan = new Loan(5, -2, 10000); // Invalid years
            System.out.println("Monthly Payment: " + loan.getMonthlyPayment());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Loan loan = new Loan(5, 10, 0); // Invalid amount
            System.out.println("Monthly Payment: " + loan.getMonthlyPayment());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

