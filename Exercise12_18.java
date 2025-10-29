package chapter_12;

import java.io.*;
import java.util.Scanner;

public class Exercise12_18 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_18 <srcRootDirectory>");
            return;
        }

        File root = new File(args[0]);
        if (!root.isDirectory()) {
            System.out.println("Not a valid directory.");
            return;
        }

        File[] dirs = root.listFiles(File::isDirectory);
        if (dirs == null) return;

        for (File dir : dirs) {
            String packageName = dir.getName();
            File[] files = dir.listFiles((d, name) -> name.endsWith(".java"));

            if (files != null) {
                for (File file : files) {
                    try {
                        addPackage(file, packageName);
                    } catch (IOException e) {
                        System.out.println("Error updating: " + file.getName());
                    }
                }
            }
        }

        System.out.println("Package insertion complete.");
    }

    public static void addPackage(File file, String packageName) throws IOException {
        File temp = new File("temp.java");
        try (
            Scanner input = new Scanner(file);
            PrintWriter output = new PrintWriter(temp)
        ) {
            output.println("package " + packageName + ";");
            while (input.hasNextLine()) {
                output.println(input.nextLine());
            }
        }

        // Replace original
        file.delete();
        temp.renameTo(file);
    }
}

