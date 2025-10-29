package chapter_12;

import java.io.File;

public class Exercise12_28 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Exercise12_28 *");
            return;
        }

        for (String filename : args) {
            if (filename.matches("Exercise\\d_\\d.*")) {
                String newName = filename.replaceAll("Exercise(\\d)_", "Exercise0$1_");
                File oldFile = new File(filename);
                File newFile = new File(newName);

                if (oldFile.renameTo(newFile)) {
                    System.out.println("Renamed to: " + newName);
                } else {
                    System.out.println("Failed to rename: " + filename);
                }
            }
        }
    }
}

