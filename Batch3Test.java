package chapter_13;

import java.math.BigInteger;

public class Batch3Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Test Octagon
        Octagon oct1 = new Octagon(5);
        Octagon oct2 = (Octagon) oct1.clone();
        System.out.println("Octagon area: " + oct1.getArea());
        System.out.println("Cloned octagon equals? " + (oct1.compareTo(oct2) == 0));

        // Test SumArea
        GeometricObject[] objects = {
            new Circle(2),
            new Rectangle(2, 3),
            new Circle(3),
            new Square(3)
        };
        System.out.println("Total area = " + SumArea.sumArea(objects));

        // Test Course clone
        Course course1 = new Course("Math");
        course1.addStudent("Alice");
        course1.addStudent("Bob");
        Course course2 = course1.clone();
        course1.addStudent("Charlie");
        System.out.println("Original students: " + String.join(", ", course1.getStudents()));
        System.out.println("Cloned students: " + String.join(", ", course2.getStudents()));

        // RationalArray test
        RationalArray ra = new RationalArray(6, -8);
        System.out.println("RationalArray output: " + ra);

        // RationalBig test
        RationalBig rb1 = new RationalBig(new BigInteger("3"), new BigInteger("454"));
        RationalBig rb2 = new RationalBig(new BigInteger("7"), new BigInteger("2389"));
        System.out.println(rb1 + " + " + rb2 + " = " + rb1.add(rb2));
        System.out.println(rb1 + " - " + rb2 + " = " + rb1.subtract(rb2));
        System.out.println(rb1 + " * " + rb2 + " = " + rb1.multiply(rb2));
        System.out.println(rb1 + " / " + rb2 + " = " + rb1.divide(rb2));
        System.out.println(rb2 + " is " + rb2.doubleValue());
    }
}













