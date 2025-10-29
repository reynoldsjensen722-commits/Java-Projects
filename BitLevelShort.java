package chapter_5;
import java.util.Scanner;

public class BitLevelShort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        short value = input.nextShort();

        System.out.print("The bits are ");
        for (int i = 15; i >= 0; i--) {
            int mask = 1 << i;
            System.out.print((value & mask) == 0 ? "0" : "1");
        }
        System.out.println();
        input.close();
    }
}
