package chapter_13;

public class RationalSeries {
    public static void main(String[] args) {
        RationalBig sum = new RationalBig(0, 1);

        for (int i = 1; i < 100; i++) {
            RationalBig term = new RationalBig(i, i + 1);
            sum = sum.add(term);
        }

        System.out.println("Sum = " + sum);
    }
}


