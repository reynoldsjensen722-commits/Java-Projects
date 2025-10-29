package chapter_6;

public class CommissionTable {

    // Compute commission based on tiered rates
    public static double computeCommission(double salesAmount) {
        double commission = 0.0;

        if (salesAmount > 10000)
            commission = 5000 * 0.08 + 5000 * 0.10 + (salesAmount - 10000) * 0.12;
        else if (salesAmount > 5000)
            commission = 5000 * 0.08 + (salesAmount - 5000) * 0.10;
        else
            commission = salesAmount * 0.08;

        return commission;
    }

    // Test program
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s\n", "Sales Amount", "Commission");
        System.out.println("------------------------------------");

        for (int sales = 10000; sales <= 100000; sales += 5000) {
            double commission = computeCommission(sales);
            System.out.printf("$%-14d$%-14.2f\n", sales, commission);
        }
    }
}

