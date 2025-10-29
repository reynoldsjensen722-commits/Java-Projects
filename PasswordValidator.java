package chapter_6;

/*
 * Author: Jensen Reynolds
 * Class: CS 2
 * Professor: Taylor
 * Date: 
 * Description: 
 */
import java.util.Scanner;

public class PasswordValidator {

    // Method to check if a password is valid
    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        int digitCount = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return false; // contains special character
            }
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        return digitCount >= 2;
    }

    // Test program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = input.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid password ✅");
        } else {
            System.out.println("Invalid password ❌");
            System.out.println("Password must:");
            System.out.println("- Be at least 8 characters");
            System.out.println("- Contain only letters and digits");
            System.out.println("- Include at least two digits");
        }

        input.close();
    }
}

