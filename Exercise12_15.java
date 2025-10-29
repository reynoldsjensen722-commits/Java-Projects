package chapter_12;

import java.io.*;
import java.util.*;

public class Exercise12_15 {
    public static void main(String[] args) throws IOException {
        File file = new File("Exercise12_15.txt");
        // Write 100 random integers
        try (PrintWriter output = new PrintWriter(file)) {
            Random rand = new Random();
            for (int i = 0; i < 100; i++) {
                output.print(rand.nextInt(100) + " ");
            }
        }
        // Read, sort and display
        ArrayList<Integer> numbers = new ArrayList<>();
        try (Scanner input = new Scanner(file)) {
            while (input.hasNextInt()) {
                numbers.add(input.nextInt());
            }
        }
        Collections.sort(numbers);
        System.out.println("Sorted integers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
