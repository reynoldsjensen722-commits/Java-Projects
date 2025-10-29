package chapter_9;

public class Location {
    public int row;
    public int column;
    public double maxValue;

    // Constructor
    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    // Static method to locate largest value
    public static Location locateLargest(double[][] a) {
        int maxRow = 0;
        int maxCol = 0;
        double max = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        return new Location(maxRow, maxCol, max);
    }
}

