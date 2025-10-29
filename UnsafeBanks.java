package chapter_8;

import java.util.*;

public class UnsafeBanks {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Read banks and limit
        System.out.print("Enter number of banks and limit: ");
        int n = input.nextInt();
        double limit = input.nextDouble();

        double[] balances = new double[n];
        double[][] loans = new double[n][n];

        // Step 2: Read each bank's data
        for (int i = 0; i < n; i++) {
            balances[i] = input.nextDouble(); // current balance
            int numBorrowers = input.nextInt();
            for (int j = 0; j < numBorrowers; j++) {
                int borrowerId = input.nextInt();
                double amount = input.nextDouble();
                loans[i][borrowerId] = amount;
            }
        }

        boolean[] unsafe = new boolean[n];
        boolean changed;

        // Step 3: Repeat until no more unsafe updates
        do {
            changed = false;
            for (int i = 0; i < n; i++) {
                if (unsafe[i]) continue;

                double totalAssets = balances[i];
                for (int j = 0; j < n; j++) {
                    if (!unsafe[j]) {
                        totalAssets += loans[i][j];
                    }
                }

                if (totalAssets < limit) {
                    unsafe[i] = true;
                    changed = true;
                }
            }
        } while (changed);

        // Step 4: Output unsafe banks
        System.out.print("Unsafe banks are");
        boolean any = false;
        for (int i = 0; i < n; i++) {
            if (unsafe[i]) {
                System.out.print(" " + i);
                any = true;
            }
        }
        if (!any) System.out.print(" none");
        System.out.println();

        input.close();
    }
}
