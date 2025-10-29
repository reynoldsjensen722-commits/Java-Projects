package chapter_12;

import java.io.*;
import java.util.Scanner;

public class Exercise12_11 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Exercise12_11 <string-to-remove> <filename>");
            return;
        }

        String target = args[0];
        String filename = args[1];

        File file = new File(filename);

        if (!file.exists()) {
            System.out.println("File not found: " + filename);
            return;
        }

        try {
            // Read file
            Scanner input = new Scanner(file);
            StringBuilder content = new StringBuilder();

            while (input.hasNextLine()) {
                String line = input.nextLine();
                content.append(line.replace(target, "")).append("\n");
            }
            input.close();

            // Write back to the same file
            PrintWriter output = new PrintWriter(file);
            output.print(content);
            output.close();

            System.out.println("All occurrences of \"" + target + "\" have been removed.");

        } catch (IOException e) {
            System.out.println("Error processing the file: " + e.getMessage());
        }
    }


}
