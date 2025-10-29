package chapter_8;

import java.util.Arrays;

public class EmployeeHours {

    public static void main(String[] args) {
        // Each row = 1 employee (7 days)
        int[][] hours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}
        };

        // Array to hold employee index and total hours
        int[][] totalHours = new int[hours.length][2];

        for (int i = 0; i < hours.length; i++) {
            int total = 0;
            for (int j = 0; j < hours[i].length; j++) {
                total += hours[i][j];
            }
            totalHours[i][0] = i;     // employee index
            totalHours[i][1] = total; // total weekly hours
        }

        // Sort by total hours descending
        Arrays.sort(totalHours, (a, b) -> Integer.compare(b[1], a[1]));

        // Display results
        for (int[] emp : totalHours) {
            System.out.println("Employee " + emp[0] + ": " + emp[1] + " hours");
        }
    }
}

