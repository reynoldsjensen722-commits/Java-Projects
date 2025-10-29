package chapter_12;

public class WritedataWithAutoClose {
	public static void main(String[] args) throws Exception {
		java.io.File file = new java.io.File("scores.txt");
		if (file.exists()) {
			System.out.println("File already exsists");
			System.exit(0);
		}
		
		try (
			// Create a file
			java.io.PrintWriter output = new java.io.PrintWriter(file);)
	        {
	        	// Write formatted output to the line
	    		output.print("John T Smith ");
	    		output.println(90);
	    		output.print("Eric K Jones ");
	    		output.println(85);
	        }
		}
	}

