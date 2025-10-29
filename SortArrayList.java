package chapter_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayList {

    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list); // In-place sort
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
            input.close();
        }

        sort(list);

        System.out.println("Sorted list: " + list);
    }
}

