package chapter_6;

public class TestPassByValue {

    /** Main method */
    public static void main(String[] args) {
        // Declare and initialize variables
        int num1 = 1;
        int num2 = 2;

        System.out.println("Before invoking the swap method, num1 is " +
            num1 + " and num2 is " + num2);

        // Invoke the swap method to attempt to swap
        swap(num1, num2);

        System.out.println("After invoking the swap method, num1 is " +
            num1 + " and num2 is " + num2);
    }

    /** Swap two variables */
    public static void swap(int n1, int n2) {
        System.out.println("\nInside the swap method");
        System.out.println("\tBefore swapping, n1 is " + n1 + " and n2 is " + n2);

        // Swap logic
        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("\tAfter swapping, n1 is " + n1 + " and n2 is " + n2);
    }
}

