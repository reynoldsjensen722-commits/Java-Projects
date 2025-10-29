package chapter_5;

public class PatternABCD {
    public static void main(String[] args) {
        patternA(6);
        System.out.println();
        patternB(6);
        System.out.println();
        patternC(6);
        System.out.println();
        patternD(6);
    }

    private static void patternA(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.printf("%2d ", j);
            System.out.println();
        }
    }
    private static void patternB(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.printf("%2d ", j);
            System.out.println();
        }
    }
    private static void patternC(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < (n - i) * 2; s++) System.out.print(" ");
            for (int j = i; j >= 1; j--) System.out.printf("%2d ", j);
            System.out.println();
        }
    }
    private static void patternD(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < (i - 1) * 2; s++) System.out.print(" ");
            for (int j = 1; j <= n - i + 1; j++) System.out.printf("%2d ", j);
            System.out.println();
        }
    }
}

