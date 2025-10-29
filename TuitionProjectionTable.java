package chapter_5;

public class TuitionProjectionTable {
    public static void main(String[] args) {
        double tuition = 10000;
        double rate = 0.05;
        System.out.printf("%-5s%-12s%n", "Year", "Tuition");
        for (int year = 1; year <= 14; year++) {
            tuition *= (1 + rate);
            System.out.printf("%-5d$%-11.2f%n", year, tuition);
        }
    }
}
