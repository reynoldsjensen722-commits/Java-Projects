package chapter_13;

public class Batch4Test {
    public static void main(String[] args) throws Exception {
        Complex c1 = new Complex(3.5, 5.5);
        Complex c2 = new Complex(-3.5, 1);

        System.out.println(c1 + " + " + c2 + " = " + c1.add(c2));
        System.out.println(c1 + " - " + c2 + " = " + c1.subtract(c2));
        System.out.println(c1 + " * " + c2 + " = " + c1.multiply(c2));
        System.out.println(c1 + " / " + c2 + " = " + c1.divide(c2));
        System.out.println("|" + c1 + "| = " + c1.abs());

        System.out.println("Equal? " + c1.equals(c2));
        System.out.println("Real: " + c1.getRealPart());
        System.out.println("Imaginary: " + c1.getImaginaryPart());

        Complex[] arr = {c2, new Complex(4, -0.5), (Complex) c1.clone(), c1};
        System.out.println(java.util.Arrays.toString(arr));
    }
}
