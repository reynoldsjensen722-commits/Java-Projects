package chapter_9;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate; // percentage, e.g., 4.5
    private Date dateCreated;

    // No-arg constructor
    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    // Constructor with ID and balance
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    // Getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    // Monthly interest rate = annualInterestRate / 12 / 100
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12 / 100;
    }

    // Monthly interest = balance * monthlyInterestRate
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }
}

