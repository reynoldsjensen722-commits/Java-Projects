package chapter_13;

public class SumArea {
    public static double sumArea(GeometricObject[] objects) {
        double sum = 0;
        for (GeometricObject obj : objects) {
            sum += obj.getArea();
        }
        return sum;
    }
}

















