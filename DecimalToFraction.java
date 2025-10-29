package chapter_13;

import java.math.BigDecimal;
import java.math.BigInteger;

public class DecimalToFraction {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        String decimalStr = input.nextLine();

        boolean isNegative = decimalStr.startsWith("-");
        if (isNegative) decimalStr = decimalStr.substring(1);

        String[] parts = decimalStr.split("\\.");
        String whole = parts[0];
        String fraction = parts.length > 1 ? parts[1] : "0";

        BigInteger numerator = new BigInteger(whole + fraction);
        BigInteger denominator = BigInteger.TEN.pow(fraction.length());

        if (isNegative) numerator = numerator.negate();

        RationalBig r = new RationalBig(numerator, denominator);
        System.out.println("The fraction number is " + r);
    }
}




