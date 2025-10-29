package chapter_7;

import java.util.Arrays;
import java.util.Scanner;

public class SortCharactersInString {

    public static String sort(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String sorted = sort(str);
        System.out.println("Sorted string: " + sorted);

        input.close();
    }
}

