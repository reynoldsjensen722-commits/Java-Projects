package chapter_7;

import java.util.Scanner;

public class MergeSortedLists {

    public static int[] merge(int[] list1, int[] list2) {
        int[] merged = new int[list1.length + list2.length];
        int i = 0, j = 0, k = 0;

        while (i < list1.length && j < list2.length) {
            if (list1[i] <= list2[j]) {
                merged[k++] = list1[i++];
            } else {
                merged[k++] = list2[j++];
            }
        }

        // Add remaining from list1
        while (i < list1.length) {
            merged[k++] = list1[i++];
        }

        // Add remaining from list2
        while (j < list2.length) {
            merged[k++] = list2[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read list1
        System.out.print("Enter list1 size and contents: ");
        int size1 = input.nextInt();
        int[] list1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            list1[i] = input.nextInt();
        }

        // Read list2
        System.out.print("Enter list2 size and contents: ");
        int size2 = input.nextInt();
        int[] list2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            list2[i] = input.nextInt();
        }

        // Merge and display
        int[] merged = merge(list1, list2);

        System.out.print("The merged list is ");
        for (int num : merged) {
            System.out.print(num + " ");
        }

        input.close();
    }
}

