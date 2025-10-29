package chapter_5;

public class MilesKilometersTable {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s | %-12s%-12s%n", "Miles", "Kilometers", "Kilometers", "Miles");
        System.out.println("--------------------------------------------------------");
        int miles = 1;
        int km = 20;
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10d%-10.3f | %-12d%-12.3f%n", miles, miles * 1.609, km, km / 1.609);
            miles++;
            km += 5;
        }
    }
}
