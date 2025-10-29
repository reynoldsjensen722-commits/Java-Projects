package chapter_6;

public class TemperatureConverter {

    // Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    // Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Test program
    public static void main(String[] args) {
        System.out.printf("%-15s%-20s | %-15s%-20s\n", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");
        System.out.println("--------------------------------------------------------------------------");

        int f = 120;
        for (int c = 31; c <= 40; c++, f -= 10) {
            double fResult = celsiusToFahrenheit(c);
            double cResult = fahrenheitToCelsius(f);
            System.out.printf("%-15d%-20.2f | %-15d%-20.2f\n", c, fResult, f, cResult);
        }
    }
}

