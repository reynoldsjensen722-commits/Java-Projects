package chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> previousAnswers = new ArrayList<>();

        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int correctAnswer = number1 + number2;

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        while (true) {
            int userAnswer = input.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("You got it!");
                break;
            } else {
                if (previousAnswers.contains(userAnswer)) {
                    System.out.println("You already entered " + userAnswer);
                    input.close();
                }
                System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
                previousAnswers.add(userAnswer);
            }
        }
    }
}

