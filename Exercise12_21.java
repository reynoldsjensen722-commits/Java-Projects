package chapter_12;

import java.io.*;
import java.util.*;

public class Exercise12_21 {
    public static void main(String[] args) throws IOException {
        File file = new File("SortedStrings.txt");

        if (!file.exists()) {
            System.out.println("File not found.");
            return;
        }

        try (Scanner input = new Scanner(file)) {
            if (!input.hasNext()) {
                System.out.println("File is empty.");
                return;
            }

            String prev = input.next();
            while (input.hasNext()) {
                String current = input.next();
                if (prev.compareTo(current) > 0) {
                    System.out.println("Strings not sorted: " + prev + " > " + current);
                    return;
                }
                prev = current;
            }
        }

        System.out.println("Strings are sorted.");
    }
}

