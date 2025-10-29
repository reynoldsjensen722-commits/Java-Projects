package chapter_7;

public class LockerPuzzle {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100]; // false = closed

        // Students 1 to 100
        for (int student = 1; student <= 100; student++) {
            for (int locker = student - 1; locker < 100; locker += student) {
                lockers[locker] = !lockers[locker]; // toggle
            }
        }

        // Display open lockers (1-based index)
        System.out.print("Open lockers: ");
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}

