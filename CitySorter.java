package chapter_4;
import java.util.Scanner;
import java.util.Arrays;

public class CitySorter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();

        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();

        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();

        String[] cities = {city1, city2, city3};
        Arrays.sort(cities);

        System.out.println("The three cities in alphabetical order are " +
                           cities[0] + " " + cities[1] + " " + cities[2]);

        input.close();
    }
}
