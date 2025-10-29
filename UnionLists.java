package chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

public class UnionLists {

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>(list1);
        result.addAll(list2);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.print("Enter five integers for list1: ");
        for (int i = 0; i < 5; i++) {
            list1.add(input.nextInt());
            input.close();
        }

        System.out.print("Enter five integers for list2: ");
        for (int i = 0; i < 5; i++) {
            list2.add(input.nextInt());
        }

        ArrayList<Integer> combined = union(list1, list2);

        System.out.print("The combined list is ");
        for (int num : combined) {
            System.out.print(num + " ");
        }
    }
}

