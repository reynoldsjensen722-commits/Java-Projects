package chapter_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Exercise12_13 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_13 <filename>");
            return;
        }

        File file = new File(args[0]);

        if (!file.exists()) {
            System.out.println("File not found: " + args[0]);
            return;
        }

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (Scanner input = new Scanner(file)) {
            while (input.hasNextLine()) {
                String line = input.nextLine();
                lineCount++;
                charCount += line.length();

                // Split by whitespace for words
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            System.out.println("Characters: " + charCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Lines: " + lineCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

