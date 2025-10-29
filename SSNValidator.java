package chapter_4;
import java.util.Scanner;

public class SSNValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a SSN: ");
        String ssn = input.next();

        if (ssn.matches("\\d{3}-\\d{2}-\\d{4}")) {
            System.out.println(ssn + " is a valid social security number");
        } else {
            System.out.println(ssn + " is an invalid social security number");
        }

        input.close();
    }
}
