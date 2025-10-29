package chapter_12;

import java.util.ArrayList;

public class OutOfMemoryDemo {
    public static void main(String[] args) {
        ArrayList<int[]> memoryHog = new ArrayList<>();

        try {
            while (true) {
                // Allocate 1 million integers (about 4MB)
                memoryHog.add(new int[1_000_000]);
                System.out.println("Allocated chunk: " + memoryHog.size());
            }
        } catch (OutOfMemoryError e) {
            System.out.println("💥 OutOfMemoryError caught! You ran out of heap space.");
            System.out.println("Handled gracefully without crashing.");
        }
    }
}
