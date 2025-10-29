package chapter_4;

public class GeographyAreaEstimator {
    public static final double RADIUS = 6371.01;

    public static void main(String[] args) {
        double[][] cities = {
            {33.748995, -84.387982},  // Atlanta
            {28.538336, -81.379234},  // Orlando
            {32.083541, -81.099834},  // Savannah
            {35.227087, -80.843127}   // Charlotte
        };

        double d1 = distance(cities[0], cities[1]);
        double d2 = distance(cities[1], cities[2]);
        double d3 = distance(cities[2], cities[0]);
        double d4 = distance(cities[2], cities[3]);
        double d5 = distance(cities[3], cities[0]);

        double area1 = triangleArea(d1, d2, d3);
        double area2 = triangleArea(d3, d4, d5);

        double totalArea = area1 + area2;
        System.out.printf("Estimated area enclosed by the 4 cities: %.2f km²%n", totalArea);
    }

    public static double distance(double[] p1, double[] p2) {
        double lat1 = Math.toRadians(p1[0]);
        double lon1 = Math.toRadians(p1[1]);
        double lat2 = Math.toRadians(p2[0]);
        double lon2 = Math.toRadians(p2[1]);

        return RADIUS * Math.acos(
            Math.sin(lat1) * Math.sin(lat2) +
            Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2)
        );
    }

    public static double triangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

