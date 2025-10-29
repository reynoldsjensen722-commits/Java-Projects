package chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

public class SumArrayList {

    public static double sum(ArrayList<Double> list) {
        double total = 0;
        for (Double number : list) {
            total += number;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        System.out.print("Enter 5 decimal numbers: ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextDouble());
            input.close();
        }

        double result = sum(list);
        System.out.println("The sum is: " + result);
    }
}

