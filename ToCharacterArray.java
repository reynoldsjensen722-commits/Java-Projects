package chapter_11;

import java.util.ArrayList;

public class ToCharacterArray {

    public static ArrayList<Character> toCharacterArray(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        return list;
    }

    public static void main(String[] args) {
        String input = "OpenAI";
        ArrayList<Character> chars = toCharacterArray(input);

        System.out.println("Input: " + input);
        System.out.println("Character ArrayList: " + chars);
    }
}

