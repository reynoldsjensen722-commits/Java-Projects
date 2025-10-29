package chapter_6;

/*Author: Jensen Reynolds
* Class: CS 2
* Professor: Taylor
* Date: 
* Description: 
*/
import java.util.Scanner;

public class PhoneNumberTranslator {

   // Method to convert uppercase letter to corresponding phone number digit
   public static int getNumber(char uppercaseLetter) {
       switch (uppercaseLetter) {
           case 'A': case 'B': case 'C': return 2;
           case 'D': case 'E': case 'F': return 3;
           case 'G': case 'H': case 'I': return 4;
           case 'J': case 'K': case 'L': return 5;
           case 'M': case 'N': case 'O': return 6;
           case 'P': case 'Q': case 'R': case 'S': return 7;
           case 'T': case 'U': case 'V': return 8;
           case 'W': case 'X': case 'Y': case 'Z': return 9;
           default: return -1; // Not a valid letter
       }
   }

   // Test program
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter a phone number (may include letters): ");
       String phone = input.nextLine();

       StringBuilder result = new StringBuilder();

       for (int i = 0; i < phone.length(); i++) {
           char ch = phone.charAt(i);
           if (Character.isLetter(ch)) {
               char upperCh = Character.toUpperCase(ch);
               int digit = getNumber(upperCh);
               result.append(digit);
           } else {
               result.append(ch); // Keep digits, dashes, etc.
           }
       }

       System.out.println("Translated phone number: " + result);

       input.close();
   }
}


