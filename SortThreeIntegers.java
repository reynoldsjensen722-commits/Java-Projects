package chapter_3;
import java.util.Scanner;
import java.util.Arrays;

public class SortThreeIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        int[] arr = { n1, n2, n3 };
        Arrays.sort(arr);

        System.out.println("Numbers in nondecreasing order:");
        for (int n : arr) System.out.print(n + " ");

        input.close();
    }
}
