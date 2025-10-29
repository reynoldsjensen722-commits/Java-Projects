package chapter_7;

public class RandomCharacter {
    /** Generate a random lowercase letter */
    public static char getRandomLowerCaseLetter() {
        return (char) ('a' + (int)(Math.random() * 26));
    }

    /** Generate a random uppercase letter */
    public static char getRandomUpperCaseLetter() {
        return (char) ('A' + (int)(Math.random() * 26));
    }

    /** Generate a random digit character */
    public static char getRandomDigitCharacter() {
        return (char) ('0' + (int)(Math.random() * 10));
    }

    /** Generate a random character from the Unicode set */
    public static char getRandomCharacter() {
        return (char) (Math.random() * 65535);
    }
}

