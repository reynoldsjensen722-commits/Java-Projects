package chapter_4;

public class PlateNumberGenerator {
    public static void main(String[] args) {
        StringBuilder plate = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            char letter = (char) ('A' + (int)(Math.random() * 26));
            plate.append(letter);
        }
        for (int i = 0; i < 4; i++) {
            int digit = (int)(Math.random() * 10);
            plate.append(digit);
        }

        System.out.println("Generated plate number: " + plate);
    }
}

