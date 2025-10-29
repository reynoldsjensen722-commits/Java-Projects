package chapter_13;

public class RationalCalculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java RationalCalculator operand1 operator operand2");
            System.exit(1);
        }

        String[] frac1 = args[0].split("/");
        String[] frac2 = args[2].split("/");

        RationalBig r1 = new RationalBig(Long.parseLong(frac1[0]), Long.parseLong(frac1[1]));
        RationalBig r2 = new RationalBig(Long.parseLong(frac2[0]), Long.parseLong(frac2[1]));
        String op = args[1];

        RationalBig result;
        switch (op) {
            case "+": result = r1.add(r2); break;
            case "-": result = r1.subtract(r2); break;
            case "*": result = r1.multiply(r2); break;
            case "/": result = r1.divide(r2); break;
            default: throw new IllegalArgumentException("Invalid operator: " + op);
        }

        System.out.println(r1 + " " + op + " " + r2 + " = " + result);
    }
}

