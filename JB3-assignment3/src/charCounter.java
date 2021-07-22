import java.io.*;

public class charCounter {

	public static void main (String[] args) {
		
		File f = new File(args[0]);
		
		char searchFor = args[1].charAt(0);
		int counter = 0;
		
		if (args.length < 2) {
		    System.err.println("Error: not all arguments req, must enter a file name to proceed");
		    System.exit(1);
		  }
		if (args[1].length() > 1) {
			System.err.println("Error: argument 2 can only contain 1 character to proceed");
		    System.exit(1);
		}
		
		if (f.isFile() && f.canRead()) {
			try {
				FileInputStream FIS = new FileInputStream(f);
				int fSize = FIS.available();
				
				for (int i = 0; i < fSize; i++) {
					char tempC = (char) FIS.read();
					if (tempC == searchFor) {
						counter ++;
					}
				}
				FIS.close();
				
			} catch (IOException ex) {
				System.err.println("Error: file name was not valid, try again");	
			}
		}
		
		System.out.println(counter + " instances of the character " + searchFor + " were found in this file");
	}
}
