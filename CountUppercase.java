package chapter_7;

public class CountUppercase {
    public static void main(String[] args) {
        StringBuilder input = new StringBuilder();

        // Combine all command-line args into one string
        for (String arg : args) {
            input.append(arg);
        }

        int uppercaseCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                uppercaseCount++;
            }
        }

        System.out.println("Number of uppercase letters: " + uppercaseCount);
    }
}

