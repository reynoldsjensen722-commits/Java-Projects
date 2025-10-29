package chapter_12;

import java.net.URL;
import java.util.Scanner;

public class Exercise12_32 {
    public static void main(String[] args) {
        System.out.printf("%-6s%-35s%-35s\n", "Year", "Top 5 Girl Names", "Top 5 Boy Names");

        for (int year = 2010; year >= 2001; year--) {
            try {
                URL url = new URL("https://liveexample.pearsoncmg.com/data/babynamesranking" + year + ".txt");
                Scanner input = new Scanner(url.openStream());

                String[] girlNames = new String[5];
                String[] boyNames = new String[5];
                int i = 0;

                while (input.hasNext() && i < 5) {
                    input.nextInt(); // Rank
                    boyNames[i] = input.next(); // Boy name
                    input.next(); // Boy count
                    girlNames[i] = input.next(); // Girl name
                    input.next(); // Girl count
                    i++;
                }

                System.out.printf("%-6d", year);
                for (String girl : girlNames) System.out.printf("%-7s", girl);
                for (String boy : boyNames) System.out.printf("%-7s", boy);
                System.out.println();

            } catch (Exception e) {
                System.out.println("Error loading year " + year + ": " + e.getMessage());
            }
        }
    }
}

