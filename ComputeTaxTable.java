package chapter_3;

public class ComputeTaxTable {
    public static void main(String[] args) {
        System.out.printf("%-15s%-20s%-20s%-20s%-20s%n",
                "Taxable Income", "Single", "Married Joint", "Married Sep", "Head of House");

        for (int income = 50000; income <= 60000; income += 1000) {
            System.out.printf("%-15d%-20.2f%-20.2f%-20.2f%-20.2f%n",
                    income,
                    computeTax(income, 0),
                    computeTax(income, 1),
                    computeTax(income, 2),
                    computeTax(income, 3));
        }
    }

    public static double computeTax(double income, int status) {
        double tax = 0;
        double[] brackets;
        switch (status) {
            case 0 -> brackets = new double[]{8350, 33950, 82250, 171550, 372950};
            case 1 -> brackets = new double[]{16700, 67900, 137050, 208850, 372950};
            case 2 -> brackets = new double[]{8350, 33950, 68525, 104425, 186475};
            case 3 -> brackets = new double[]{11950, 45500, 117450, 190200, 372950};
            default -> brackets = new double[]{};
        }

        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        double[] limits = new double[brackets.length + 1];
        System.arraycopy(brackets, 0, limits, 0, brackets.length);
        limits[brackets.length] = Double.MAX_VALUE;

        for (int i = 0; i < rates.length; i++) {
            if (income <= limits[i]) {
                tax += (income - (i == 0 ? 0 : limits[i - 1])) * rates[i];
                break;
            } else {
                tax += (limits[i] - (i == 0 ? 0 : limits[i - 1])) * rates[i];
            }
        }

        return tax;
    }
}

