package chapter_3;

public class TaxTablePrinter {
    public static void main(String[] args) {
        System.out.println("Taxable Income   Single(%)   MarriedJoint(%)   MarriedSep(%)   HeadHouse(%)");
        for (int income = 50000; income <= 60000; income += 1000) {
            System.out.printf("%14d   %9.2f   %15.2f   %14.2f   %12.2f%n",
                    income,
                    taxSingle(income),
                    taxMarriedJoint(income),
                    taxMarriedSep(income),
                    taxHeadOfHouse(income));
        }
    }

    // simple bracket approximation for demonstration
    private static double taxSingle(int inc) {
        return bracket(inc, 8350, 33950, 82250);
    }
    private static double taxMarriedJoint(int inc) {
        return bracket(inc, 16700, 67900, 137050);
    }
    private static double taxMarriedSep(int inc) {
        return bracket(inc, 8350, 33950, 68525);
    }
    private static double taxHeadOfHouse(int inc) {
        return bracket(inc, 11950, 45500, 117450);
    }

    private static double bracket(int income, int b1, int b2, int b3) {
        double tax;
        if (income <= b1) tax = income * 0.10;
        else if (income <= b2) tax = b1 * 0.10 + (income - b1) * 0.15;
        else if (income <= b3) tax = b1 * 0.10 + (b2 - b1) * 0.15 + (income - b2) * 0.25;
        else tax = b1 * 0.10 + (b2 - b1) * 0.15 + (b3 - b2) * 0.25 + (income - b3) * 0.28;
        return tax / income * 100.0; // percent of income
    }
}
