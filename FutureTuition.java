package chapter_5;

public class FutureTuition {
    public static void main(String[] args) {
        double tuition = 10000;
        double rate = 0.07;
        int years = 0;
        while (tuition < 20000) {
            tuition *= (1 + rate);
            years++;
        }
        System.out.printf("Tuition doubles in %d years; then costs $%.2f%n", years, tuition);
    }
}
