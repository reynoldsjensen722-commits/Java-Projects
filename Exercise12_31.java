package chapter_12;

import java.net.URL;
import java.util.Scanner;

public class Exercise12_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        System.out.print("Enter the gender (M/F): ");
        String gender = input.next();

        System.out.print("Enter the name: ");
        String name = input.next();

        try {
            URL url = new URL("https://liveexample.pearsoncmg.com/data/babynamesranking" + year + ".txt");
            Scanner fileInput = new Scanner(url.openStream());

            while (fileInput.hasNext()) {
                int rank = fileInput.nextInt();
                String boyName = fileInput.next();
                fileInput.next(); // boy count
                String girlName = fileInput.next();
                fileInput.next(); // girl count

                if ((gender.equalsIgnoreCase("M") && boyName.equalsIgnoreCase(name)) ||
                    (gender.equalsIgnoreCase("F") && girlName.equalsIgnoreCase(name))) {
                    System.out.println(name + " is ranked #" + rank + " in year " + year);
                    return;
                }
            }

            System.out.println("The name " + name + " is not ranked in year " + year);

        } catch (Exception e) {
            System.out.println("Data not available or failed to connect: " + e.getMessage());
        }
    }
}

