package chapter_2;

public class Exercise2_18 {
    public static void main(String[] args) {
        System.out.println("a\tb\tpow(a, b)");
        int a1 = 1, b1 = 2;
        int a2 = 2, b2 = 3;
        int a3 = 3, b3 = 4;
        int a4 = 4, b4 = 5;
        int a5 = 5, b5 = 6;

        System.out.println(a1 + "\t" + b1 + "\t" + (int)Math.pow(a1, b1));
        System.out.println(a2 + "\t" + b2 + "\t" + (int)Math.pow(a2, b2));
        System.out.println(a3 + "\t" + b3 + "\t" + (int)Math.pow(a3, b3));
        System.out.println(a4 + "\t" + b4 + "\t" + (int)Math.pow(a4, b4));
        System.out.println(a5 + "\t" + b5 + "\t" + (int)Math.pow(a5, b5));
    }
}