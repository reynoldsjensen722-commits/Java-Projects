package chapter_5;
import java.util.Scanner;

public class SentinelValue {
    // Read integers until 0; output count and sum
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, count = 0;

        System.out.print("Enter integers (0 to end): ");
        while (true) {
            int x = input.nextInt();
            if (x == 0) break;
            sum += x;
            count++;
        }
        System.out.println("Count = " + count + ", Sum = " + sum);
        input.close();
    }
}
