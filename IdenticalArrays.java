package chapter_8;

import java.util.*;

public class IdenticalArrays {

    public static boolean equals(int[][] m1, int[][] m2) {
        if (m1.length != m2.length || m1[0].length != m2[0].length)
            return false;

        // Convert rows to List<String> of sorted strings
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        for (int[] row : m1) {
            int[] copy = row.clone();
            Arrays.sort(copy);
            list1.add(Arrays.toString(copy));
        }

        for (int[] row : m2) {
            int[] copy = row.clone();
            Arrays.sort(copy);
            list2.add(Arrays.toString(copy));
        }

        // Sort row lists
        Collections.sort(list1);
        Collections.sort(list2);

        return list1.equals(list2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];

        System.out.print("Enter list1: ");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                m1[i][j] = input.nextInt();

        System.out.print("Enter list2: ");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                m2[i][j] = input.nextInt();

        if (equals(m1, m2)) {
            System.out.println("The two arrays are identical");
        } else {
            System.out.println("The two arrays are not identical");
        }
        input.close();
    }

}
