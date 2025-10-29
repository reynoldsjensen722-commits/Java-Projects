package chapter_12;

public class CalculatorWithTryCatch {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            return;
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[2]);
            char op = args[1].charAt(0);

            double result = switch (op) {
                case '+' -> num1 + num2;
                case '-' -> num1 - num2;
                case '*' -> num1 * num2;
                case '/' -> num1 / num2;
                default -> throw new IllegalArgumentException("Invalid operator: " + op);
            };
            System.out.println(num1 + " " + op + " " + num2 + " = " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: One or both operands are not numeric.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
