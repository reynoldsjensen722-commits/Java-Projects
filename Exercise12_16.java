package chapter_12;

import java.io.*;
import java.util.Scanner;

public class Exercise12_16 {
    public static void main(String[] args) throws IOException {
        if (args.length != 3) {
            System.out.println("Usage: java Exercise12_16 file oldString newString");
            return;
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File not found.");
            return;
        }
        String content = "";
        try (Scanner input = new Scanner(file)) {
            while (input.hasNextLine()) {
                content += input.nextLine().replace(args[1], args[2]) + "\n";
            }
        }
        try (PrintWriter output = new PrintWriter(file)) {
            output.print(content);
        }
        System.out.println("Replacement done in: " + args[0]);
    }
}

