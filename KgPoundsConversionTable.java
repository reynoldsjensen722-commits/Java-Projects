package chapter_5;

public class KgPoundsConversionTable {
    // Simple one-way table: kilograms to pounds for 1..199 step 2
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%n", "Kilograms", "Pounds");
        for (int kg = 1; kg <= 199; kg += 2) {
            double pounds = kg * 2.2;
            System.out.printf("%-10d%-10.1f%n", kg, pounds);
        }
    }
}
