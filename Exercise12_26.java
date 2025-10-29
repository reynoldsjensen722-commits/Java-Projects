package chapter_12;

import java.io.File;
import java.util.Scanner;

public class Exercise12_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter directory name: ");
        String dirName = input.nextLine();

        File dir = new File(dirName);
        if (dir.exists()) {
            System.out.println("Directory already exists.");
        } else {
            if (dir.mkdirs()) {
                System.out.println("Directory created successfully.");
            } else {
                System.out.println("Failed to create directory.");
            }
        }
    }
}

