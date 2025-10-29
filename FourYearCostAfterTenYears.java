package chapter_5;

public class FourYearCostAfterTenYears {
    public static void main(String[] args) {
        double tuition = 10000;
        double rate = 0.05;

        // grow 10 years
        for (int i = 0; i < 10; i++) tuition *= (1 + rate);

        // cost for years 11–14
        double total = 0;
        for (int y = 0; y < 4; y++) {
            total += tuition;
            tuition *= (1 + rate);
        }
        System.out.printf("Total cost for 4 years after year 10: $%.2f%n", total);
    }
}
