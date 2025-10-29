package chapter_6;

public class UnitConverter {

    // Convert feet to meters
    public static double footToMeter(double foot) {
        return foot * 0.305;
    }

    // Convert meters to feet
    public static double meterToFoot(double meter) {
        return meter * 3.279;
    }

    // Test program
    public static void main(String[] args) {
        System.out.printf("%-10s%-15s | %-10s%-15s\n", "Feet", "Meters", "Meters", "Feet");
        System.out.println("-------------------------------------------------------");

        double meter = 1.0;
        for (int foot = 1; foot <= 10; foot++, meter++) {
            double meters = footToMeter(foot);
            double feet = meterToFoot(meter);
            System.out.printf("%-10d%-15.3f | %-10.1f%-15.3f\n", foot, meters, meter, feet);
        }
    }
}
