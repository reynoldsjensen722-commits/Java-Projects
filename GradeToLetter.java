package chapter_3;
import java.util.Scanner;

public class GradeToLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a score 0 to 100: ");
        int score = input.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
        } else if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        input.close();
    }
}
