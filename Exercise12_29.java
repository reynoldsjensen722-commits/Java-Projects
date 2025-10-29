package chapter_12;

import java.io.File;

public class Exercise12_29 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Exercise12_29 *");
            return;
        }

        for (String filename : args) {
            if (filename.matches("Exercise\\d+_\\d.*")) {
                String newName = filename.replaceAll("_(\\d)(\\D|$)", "_0$1$2");
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

