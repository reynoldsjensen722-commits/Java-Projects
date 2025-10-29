package chapter_9;

public class TestCircleWithStaticMembers {
    public static void main(String[] args) {
        System.out.println("Before creating c1");
        System.out.println("The number of Circle objects is " + Circle.numberOfObjects);

        // Create c1
        Circle c1 = new Circle();

        System.out.println("After creating c1");
        System.out.println("c1 radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");

        // Create c2
        Circle c2 = new Circle(5);

        // Modify c1
        c1.radius = 9;

        System.out.println("After creating c2 and modifying c1");
        System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");
        System.out.println("c2: radius (" + c2.radius + ") and number of Circle objects (" + c2.numberOfObjects + ")");
    }
}

