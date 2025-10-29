package chapter_9;

//Stock.java
public class Stock {
 private String symbol;
 private String name;
 private double previousClosingPrice;
 private double currentPrice;

 // Constructor
 public Stock(String symbol, String name) {
     this.symbol = symbol;
     this.name = name;
 }

 // Percentage change calculation
 public double getChangePercent() {
     if (previousClosingPrice == 0) return 0;
     return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
 }

 // Getters and Setters
 public String getSymbol() {
     return symbol;
 }

 public String getName() {
     return name;
 }

 public double getPreviousClosingPrice() {
     return previousClosingPrice;
 }

 public void setPreviousClosingPrice(double price) {
     this.previousClosingPrice = price;
 }

 public double getCurrentPrice() {
     return currentPrice;
 }

 public void setCurrentPrice(double price) {
     this.currentPrice = price;
 }
}
