package chapter_12;

import java.io.*;
import java.util.Scanner;

public class Exercise12_22 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Exercise12_22 <directory> <oldString> <newString>");
            return;
        }

        File dir = new File(args[0]);
        if (!dir.isDirectory()) {
            System.out.println("Invalid directory.");
            return;
        }

        for (File file : dir.listFiles((d, name) -> name.endsWith(".java") || name.endsWith(".txt"))) {
            try {
                replaceInFile(file, args[1], args[2]);
                System.out.println("Updated: " + file.getName());
            } catch (IOException e) {
                System.out.println("Failed: " + file.getName());
            }
        }
    }

    public static void replaceInFile(File file, String oldStr, String newStr) throws IOException {
        String content = "";
        try (Scanner input = new Scanner(file)) {
            while (input.hasNextLine()) {
                content += input.nextLine().replace(oldStr, newStr) + "\n";
            }
        }

        try (PrintWriter output = new PrintWriter(file)) {
            output.print(content);
        }
    }
}

