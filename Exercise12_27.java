package chapter_12;

import java.io.*;
import java.util.Scanner;

public class Exercise12_27 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Exercise12_27 *");
            return;
        }

        for (String filename : args) {
            File file = new File(filename);
            if (!file.isFile()) continue;

            File tempFile = new File("temp.java");

            try (
                Scanner input = new Scanner(file);
                PrintWriter output = new PrintWriter(tempFile)
            ) {
                while (input.hasNextLine()) {
                    String line = input.nextLine();
                    line = line.replaceAll("Exercise(\\d)_(\\d)", "Exercise0$1_0$2");
                    output.println(line);
                }
            } catch (IOException e) {
                System.out.println("Failed to process: " + file.getName());
            }

            // Replace original file
            if (file.delete()) {
                tempFile.renameTo(file);
                System.out.println("Updated: " + file.getName());
            }
        }
    }
}

