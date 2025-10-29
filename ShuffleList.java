package chapter_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShuffleList {

    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            numbers.add(input.nextInt());
            input.close();
        }

        System.out.println("Original list: " + numbers);
        shuffle(numbers);
        System.out.println("Shuffled list: " + numbers);
    }
}

