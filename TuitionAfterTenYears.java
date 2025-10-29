package chapter_5;

public class TuitionAfterTenYears {
    public static void main(String[] args) {
        double tuition = 10000;   // initial
        double rate = 0.05;       // 5% per year

        for (int year = 1; year <= 10; year++) {
            tuition *= (1 + rate);
        }
        System.out.printf("Tuition after 10 years: $%.2f%n", tuition);
    }
}
