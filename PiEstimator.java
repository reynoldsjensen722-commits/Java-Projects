package chapter_6;

public class PiEstimator {

	   // Method to estimate Pi using i terms of the Leibniz series
	   public static double computePi(int i) {
	       double sum = 0.0;
	       for (int k = 1; k <= i; k++) {
	           double term = Math.pow(-1, k + 1) / (2 * k - 1);
	           sum += term;
	       }
	       return 4 * sum;
	   }

	   // Test program
	   public static void main(String[] args) {
	       System.out.printf("%-10s%-15s\n", "i", "Estimated Pi");
	       System.out.println("----------------------------");

	       for (int i = 1; i <= 901; i += 100) {
	           double piEstimate = computePi(i);
	           System.out.printf("%-10d%-15.10f\n", i, piEstimate);
	       }
	   }
	}