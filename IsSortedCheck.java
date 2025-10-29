package chapter_7;

import java.util.Scanner;

public class IsSortedCheck {

    /** Returns true if the array is sorted in nondecreasing order */
    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the list: ");
        int size = input.nextInt();

        int[] list = new int[size];
        System.out.print("Enter the list: ");
        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }

        if (isSorted(list)) {
            System.out.println("The list is already sorted.");
        } else {
            System.out.println("The list is not sorted.");
        }

        input.close();
    }
}
