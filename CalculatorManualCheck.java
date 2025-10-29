package chapter_12;

public class CalculatorManualCheck {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            return;
        }

        if (!isNumeric(args[0]) || !isNumeric(args[2])) {
            System.out.println("Error: One or both operands are not numeric.");
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[2]);
        char op = args[1].charAt(0);

        double result = switch (op) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> {
                System.out.println("Error: Invalid operator.");
                yield 0;
            }
        };

        System.out.println(num1 + " " + op + " " + num2 + " = " + result);
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}


