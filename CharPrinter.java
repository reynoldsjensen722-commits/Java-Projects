package chapter_6;

public class CharPrinter {

    // Prints characters from ch1 to ch2 with given number per line
    public static void printChars(char ch1, char ch2, int numberPerLine) {
        int count = 0;
        for (char ch = ch1; ch <= ch2; ch++) {
            System.out.print(ch + " ");
            count++;
            if (count % numberPerLine == 0) {
                System.out.println(); // new line
            }
        }
        if (count % numberPerLine != 0) {
            System.out.println(); // ensure ending with newline
        }
    }

    // Test program
    public static void main(String[] args) {
        System.out.println("Characters from '1' to 'z', 10 per line:");
        printChars('1', 'z', 10);
    }
}

