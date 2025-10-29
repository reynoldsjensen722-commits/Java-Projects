package chapter_4;

public class FormatDemo {
    public static void main(String[] args) {
        printTrigTableHeader();
        printTrigRow(30);
        printTrigRow(60);
    }

    public static void printTrigTableHeader() {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%n",
            "Degrees", "Radians", "Sine", "Cosine", "Tangent");
    }

    public static void printTrigRow(int degrees) {
        double radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f%n",
            degrees,
            radians,
            Math.sin(radians),
            Math.cos(radians),
            Math.tan(radians));
    }
}
