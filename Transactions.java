package chapter_11;


import java.util.Date;

public class Transactions {
    private char type;            // 'D' for deposit, 'W' for withdrawal
    private double amount;
    private double balanceAfter;
    private String description;
    private Date date;

    public Transactions(char type, double amount, double balanceAfter, String description) {
        this.type = type;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
        this.description = description;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return String.format(
            "%s  Type: %s  Amount: $%.2f  Balance: $%.2f  Note: %s",
            date.toString(), 
            (type == 'D' ? "Deposit" : "Withdrawal"),
            amount,
            balanceAfter,
            description
        );
    }
}
