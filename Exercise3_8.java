package chapter_3;
import java.util.Scanner;

public class Exercise3_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        int temp;
        if (n1 > n2) { temp = n1; n1 = n2; n2 = temp; }
        if (n2 > n3) { temp = n2; n2 = n3; n3 = temp; }
        if (n1 > n2) { temp = n1; n1 = n2; n2 = temp; }

        System.out.println("The numbers in increasing order are " + n1 + " " + n2 + " " + n3);

        input.close();
    }
}
