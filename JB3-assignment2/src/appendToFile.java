import java.io.*;
import java.util.Scanner;

public class appendToFile {
	
	private static Scanner scanner;
	
//Write a Java program to append text to an existing file.
	public static void main (String[] args) {
		scanner = new Scanner(new InputStreamReader(System.in));
		String addedText = "";
		int quotes = 0;
		
		System.out.println("Enter the file you wish to add text to...");
		File f = new File(scanner.nextLine());
	
	if (f.isFile()) {
		try {
			FileOutputStream FOS = new FileOutputStream(f, true);
			
			System.out.println("Enter the text you would like to append (must be within quotation marks and under 500 characters)");
			
			while (scanner.hasNextLine() == true && quotes < 2) {
				
				String temp = scanner.next();
				
				if (temp.startsWith("\"")) { 
						addedText += temp.substring(1);
						quotes++;
					
				}else if (temp.endsWith("\"")) {
					addedText += " ";
					addedText += temp.substring(0, temp.length() - 1);
					quotes++;
					
				}else {
					addedText += " ";
					addedText += temp;
				}
			}
			
			if (addedText.length() >= 10 && quotes < 2) {
				System.out.println("Error: appended string exceeds 500 cahracters or is missing quotation marks,"
						+ "please try again");
			} else {
				FOS.write(addedText.getBytes());
				System.out.println("data appended sucessfully!");
			}
			
			FOS.close();
			
		} catch (IOException ex) {
			System.err.println("Error: file name was not valid, try again");	
		}
	}
	}
}

