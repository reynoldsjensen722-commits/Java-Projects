package chapter_7;

import java.util.Scanner;

public class PartitionList {

    public static int partition(int[] list) {
        int pivot = list[0];
        int[] temp = new int[list.length];
        int low = 0;
        int high = list.length - 1;

        // Distribute elements
        for (int i = 1; i < list.length; i++) {
            if (list[i] <= pivot) {
                temp[low++] = list[i];
            } else {
                temp[high--] = list[i];
            }
        }

        // Insert pivot at its correct index
        temp[low] = pivot;

        // Rebuild original list
        for (int i = 0; i < list.length; i++) {
            list[i] = temp[i];
        }

        return low; // pivot index
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list size: ");
        int size = input.nextInt();
        int[] list = new int[size];

        System.out.print("Enter list content: ");
        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }

        int pivotIndex = partition(list);

        System.out.print("After the partition, the list is: ");
        for (int num : list) {
            System.out.print(num + " ");
        }

        System.out.println("\nPivot index: " + pivotIndex);
        input.close();
    }
}
