package chapter_12;

import java.io.*;
import java.util.Scanner;

public class Exercise12_12 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_12 <JavaSourceFile>");
            return;
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File not found: " + args[0]);
            return;
        }

        try {
            // Read original content
            Scanner input = new Scanner(file);
            StringBuilder formattedCode = new StringBuilder();

            String previousLine = "";
            while (input.hasNextLine()) {
                String currentLine = input.nextLine();

                if (currentLine.trim().equals("{")) {
                    // Move brace to end of previous line
                    previousLine += " {";
                } else {
                    if (!previousLine.isEmpty()) {
                        formattedCode.append(previousLine).append("\n");
                    }
                    previousLine = currentLine;
                }
            }

            if (!previousLine.isEmpty()) {
                formattedCode.append(previousLine).append("\n");
            }

            input.close();

            // Write back to file
            PrintWriter output = new PrintWriter(file);
            output.print(formattedCode);
            output.close();

            System.out.println("Brace formatting complete: " + file.getName());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

