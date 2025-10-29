package chapter_4;
import java.util.Scanner;

public class GuessBirthdayRevised {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String set1 = " 1  3  5  7\n 9 11 13 15\n17 19 21 23\n25 27 29 31";
        String set2 = " 2  3  6  7\n10 11 14 15\n18 19 22 23\n26 27 30 31";
        String set3 = " 4  5  6  7\n12 13 14 15\n20 21 22 23\n28 29 30 31";
        String set4 = " 8  9 10 11\n12 13 14 15\n24 25 26 27\n28 29 30 31";
        String set5 = "16 17 18 19\n20 21 22 23\n24 25 26 27\n28 29 30 31";

        int day = 0;

        day += askSet(set1, 1, input);
        day += askSet(set2, 2, input);
        day += askSet(set3, 4, input);
        day += askSet(set4, 8, input);
        day += askSet(set5, 16, input);

        System.out.println("\nYour birthday is " + day + "!");
        input.close();
    }

    public static int askSet(String set, int value, Scanner input) {
        System.out.println("\nIs your birthday in this set?\n" + set);
        System.out.print("Enter Y for Yes and N for No: ");
        char answer = input.next().toUpperCase().charAt(0);
        return answer == 'Y' ? value : 0;
    }
}
