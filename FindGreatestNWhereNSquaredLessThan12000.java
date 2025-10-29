package chapter_5;

public class FindGreatestNWhereNSquaredLessThan12000 {
    public static void main(String[] args) {
        int n = 0;
        while ((n + 1) * (n + 1) < 12000) n++;
        System.out.println("Greatest n with n^2 < 12000 is " + n);
    }
}

