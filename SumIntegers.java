package chapter_7;

public class SumIntegers {
    public static void main(String[] args) {
        int sum = 0;

        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }

        System.out.println("The total is: " + sum);
    }
}

