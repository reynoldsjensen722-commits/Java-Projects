package chapter_6;

public class TestRandomCharacterRevised {

    public static void main(String[] args) {
        System.out.println("100 Random Uppercase Letters:");
        printRandomCharacters(100, 50, true);

        System.out.println("\n\n100 Random Digit Characters:");
        printRandomCharacters(100, 50, false);
    }

    // Utility method to print characters
    public static void printRandomCharacters(int total, int perLine, boolean isLetter) {
        for (int i = 1; i <= total; i++) {
            char ch = isLetter ? RandomCharacter.getRandomUpperCaseLetter()
                               : RandomCharacter.getRandomDigitCharacter();
            System.out.print(ch + " ");
            if (i % perLine == 0) {
                System.out.println();
            }
        }
    }
}

