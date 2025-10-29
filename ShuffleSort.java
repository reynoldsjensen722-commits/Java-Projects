package chapter_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ShuffleSort {

    public static void shuffle(ArrayList<Number> list) {
        Collections.shuffle(list);
    }

    public static void sort(ArrayList<Number> list) {
        list.sort(Comparator.comparingDouble(Number::doubleValue));
    }

    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        System.out.println("Original: " + numbers);
        shuffle(numbers);
        System.out.println("Shuffled: " + numbers);
        sort(numbers);
        System.out.println("Sorted: " + numbers);
    }
}

