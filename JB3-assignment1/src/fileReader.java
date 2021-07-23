import java.io.*;
import java.util.Scanner;

//not finnished

public class fileReader {
	private static Scanner scanner;
	
	public static void main (String[] args) {
		
		scanner = new Scanner(new InputStreamReader(System.in));
		boolean noDir = false;
		int space = 1;
		String addedSpace = "";
		String dArray[] = {" "};
		
		System.out.println("Input a directory...");
		File fD = new File(scanner.nextLine());
		
		FileFilter dirFilter = new FileFilter() {
			public boolean accept(File fD) {
				return fD.isDirectory();
			}
		};
		
		FileFilter fileFilter = new FileFilter() {
			public boolean accept(File fD) {
				return !fD.isDirectory();
			}
		};
	
	if (fD.isDirectory()) {
		while (noDir == false) {
			File[] fileArray = fD.listFiles(fileFilter);
			File[] dirArray = fD.listFiles(dirFilter);

			noDir = true;
			
			System.out.println("List of files and directories in the specified directory:\n");
			System.out.println("Dir: " + fD.getName());
			
			for (int j = 0; j  < space; j++) {
  			  addedSpace += "  ";
  		  }
		      for(int i = 0; i < fileArray.length; i++) {
		    		  System.out.println(addedSpace + "- " + fileArray[i].getName());
		      }
			
		}
		      }
	}
	}
