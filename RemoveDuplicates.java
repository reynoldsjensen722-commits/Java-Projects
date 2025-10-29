package chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> unique = new ArrayList<>();

        for (Integer num : list) {
            if (!unique.contains(num)) {
                unique.add(num);
            }
        }

        list.clear();
        list.addAll(unique);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
            input.close();
        }

        removeDuplicate(list);

        System.out.print("The distinct integers are: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}

