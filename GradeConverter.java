package chapter_4;
import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        char gradeChar = input.next().toUpperCase().charAt(0);

        int gradeValue;

        switch (gradeChar) {
            case 'A': gradeValue = 4; break;
            case 'B': gradeValue = 3; break;
            case 'C': gradeValue = 2; break;
            case 'D': gradeValue = 1; break;
            case 'F': gradeValue = 0; break;
            default:
                System.out.println(gradeChar + " is an invalid grade");
                input.close();
                return;
        }

        System.out.println("The numeric value for grade " + gradeChar + " is " + gradeValue);
        input.close();
    }
}
