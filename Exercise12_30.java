package chapter_12;

import java.io.File;
import java.util.Scanner;

public class Exercise12_30 {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a filename: ");
        String filename = console.nextLine();

        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("File not found.");
            return;
        }

        int[] counts = new int[26]; // A–Z

        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                String word = input.next().toUpperCase();
                for (char ch : word.toCharArray()) {
                    if (Character.isLetter(ch)) {
                        counts[ch - 'A']++;
                    }
                }
            }
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.printf("Number of %c's: %d\n", (char)('A' + i), counts[i]);
        }
    }
}


