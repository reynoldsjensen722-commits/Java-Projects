package chapter_12;

import java.io.*;
import java.util.Scanner;

public class Exercise12_20 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_20 <srcRootDirectory>");
            return;
        }

        File root = new File(args[0]);
        if (!root.isDirectory()) {
            System.out.println("Not a valid directory.");
            return;
        }

        for (File dir : root.listFiles(File::isDirectory)) {
            File[] files = dir.listFiles((d, name) -> name.endsWith(".java"));
            if (files != null) {
                for (File file : files) {
                    try {
                        removePackageLine(file);
                    } catch (IOException e) {
                        System.out.println("Error processing " + file.getName());
                    }
                }
            }
        }

        System.out.println("All package statements removed.");
    }
    public static void removePackageLine(File file) throws IOException {
        File temp = new File("temp.java");
        try (
            Scanner input = new Scanner(file);
            PrintWriter output = new PrintWriter(temp)
        ) {
            boolean firstLine = true;
            while (input.hasNextLine()) {
                String line = input.nextLine();
                if (firstLine && line.startsWith("package")) {
                    firstLine = false;
                    continue; // skip
                }
                output.println(line);
                firstLine = false;
            }
        }

        file.delete();
        temp.renameTo(file);
    }
}

