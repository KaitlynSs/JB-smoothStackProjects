import java.io.*;
import java.util.Scanner;

//not finnished

public class fileReader {
	private static Scanner scanner;
	
	public static void main (String[] args) {
		
		scanner = new Scanner(new InputStreamReader(System.in));
		
		System.out.println("Enter the file you wish to add text to...");
		File fD = new File(scanner.nextLine());
	
	if (fD.isDirectory()) {
			String fileArray[] = fD.list();
			
			System.out.println("List of files and directories in the specified directory:\n");
		      for(int i=0; i<fileArray.length; i++) {
		         System.out.println("   - " + fileArray[i]);
		      }
	}
	}
}
