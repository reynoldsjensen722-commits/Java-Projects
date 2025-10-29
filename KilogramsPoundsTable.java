package chapter_5;

public class KilogramsPoundsTable {
    public static void main(String[] args) {
        System.out.printf("%-12s%-12s | %-12s%-12s%n", "Kilograms", "Pounds", "Pounds", "Kilograms");
        System.out.println("----------------------------------------------------------");
        double kg = 1, lb = 20;
        for (int i = 0; i < 100; i++) {
            double pounds = kg * 2.2;
            double kilograms = lb / 2.2;
            System.out.printf("%-12.0f%-12.1f | %-12.0f%-12.2f%n", kg, pounds, lb, kilograms);
            kg += 2;
            lb += 5;
        }
    }
}
