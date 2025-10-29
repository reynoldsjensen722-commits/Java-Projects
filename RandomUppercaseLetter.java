package chapter_4;

public class RandomUppercaseLetter {
    public static void main(String[] args) {
        char randomLetter = (char) ('A' + (int)(Math.random() * 26));
        System.out.println("Random uppercase letter: " + randomLetter);
    }
}

