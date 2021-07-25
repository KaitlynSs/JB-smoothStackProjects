import java.io.*;
import java.util.Scanner;

public class fileReader {
	private static Scanner scanner;
		
	public static void main (String[] args) {
		
		scanner = new Scanner(new InputStreamReader(System.in));
		boolean valid = false;
		int Level = 1;
		
		System.out.println("Input a directory...");
		
		while (valid == false) {
			
			File fD = new File(scanner.nextLine());
			if (fD.exists() && fD.isDirectory()) { 
				
				System.out.println("\ndirectory name accepted, now printing all files in " + fD.getName() + "...");
			    System.out.println("+ "  + fD.getName() + "   (Main Dir)");
			    
			    printFiles(fD, Level);
		        valid = true;
			} else if (fD.isFile()) {
				
				System.out.println("Error: not a directory, try again");
			} else if (!fD.exists()) {
				
				System.out.println("Error: enrty does not exist, try again");
			}
		}
	}
	
	public static void printFiles(File d, int l) {
		
		File[] allFiles = d.listFiles();
		String space = getSpacing(l);
		
		for (int i = 0; i < allFiles.length; i ++) {
			
			if (allFiles[i].isDirectory()) {
				
				System.out.println(space + "+ " + allFiles[i].getName() + "   (Dir)");
				l++;
				printFiles(allFiles[i], l);
			}else {
				
				System.out.println(space + "- " + allFiles[i].getName());
			}
		}
	}

	public static String getSpacing(int l) {
		String s = "";
		
		for (int i = 0; i < l; i++) {
			s += "   ";
		}
		return s;
	}
}
