package chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquareProduct {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer m: ");
        int m = input.nextInt();

        ArrayList<Integer> factors = getPrimeFactors(m);
        ArrayList<Integer> oddFactors = getOddOccurrenceFactors(factors);

        int n = 1;
        for (int f : oddFactors) {
            n *= f;
            input.close();
        }

        System.out.println("The smallest number n for m * n to be a perfect square is " + n);
        System.out.println("m * n is " + (m * n));
    }

    public static ArrayList<Integer> getPrimeFactors(int num) {
        ArrayList<Integer> factors = new ArrayList<>();
        int divisor = 2;
        while (num > 1) {
            while (num % divisor == 0) {
                factors.add(divisor);
                num /= divisor;
            }
            divisor++;
        }
        return factors;
    }

    public static ArrayList<Integer> getOddOccurrenceFactors(ArrayList<Integer> factors) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> checked = new ArrayList<>();

        for (int f : factors) {
            if (!checked.contains(f)) {
                int count = 0;
                for (int x : factors) {
                    if (x == f) count++;
                }
                if (count % 2 != 0) result.add(f);
                checked.add(f);
            }
        }

        return result;
    }
}

