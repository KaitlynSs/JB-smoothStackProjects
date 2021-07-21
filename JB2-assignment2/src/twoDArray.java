import java.io.InputStreamReader;
import java.util.Scanner;

public class twoDArray {
	
	private static Scanner scanner;
	
	public static int correct = 0;
	
	public static int rLength = 0;
	public static int cLength = 0;
	public static int[][] matrix;
	public static int maxV = 0;
	public static int mRow = 0;
	public static int mColumn = 0;

	public static void main(String args[]) {
		
		scanner = new Scanner(new InputStreamReader(System.in));
		
		System.out.println("Welcome to the matrix creator\n\n"
				+ "this program allows you to...\n"
				+ "     1) choose the dimentions of a matrix\n"
				+ "     2) fill the matrix with integers\n"
				+ "     3) identify the max number inside the matrix with its location\n\n"
				+ "note: all row and columns can only be between 1 and 5\n\n"
				+ "how many rows would you like to have? ");
		
		checkR();
		checkC();
		
		matrix = new int[rLength][cLength];
		
		for (int c = 0; c < cLength; c++) {
			for (int r = 0; r < rLength; r++) {
				System.out.println("input an integer to be added: ");
				int temp = scanner.nextInt();
				
				if (maxV < temp) {
					maxV = temp;
					mRow = r;
					mColumn = c;
				}
				matrix[r][c] = temp;
			}
		}
		printMatrix();
		
		System.out.println("You filled the matrix!\n\n"
				+ "max value = " + maxV + "       location = [" + mRow + "] [" + mColumn +"]");
	}
	
	public static void checkR() {
		while (correct == 0) {
			rLength = scanner.nextInt();
			
			if (rLength >= 1 && rLength <= 5) 
				correct++;
			
			else 
				System.out.println("not a valid row input, please try again");	
		}
		
		System.out.println("how many columns would you like to have? ");
		
	}
	
	public static void checkC() {
		while (correct == 1) {
			cLength = scanner.nextInt();
			
			if (cLength >= 1 && cLength <= 5) 
				correct++;
			
			else 
				System.out.println("not a valid column input, please try again");	
		}
	}
		
	public static void printMatrix() {
		String matrixString = "";
		
		for (int c = 0; c < cLength; c++) {
			for (int r = 0; r < rLength; r++) {
				if (r == 0) 
					matrixString += "[ ";
				matrixString += matrix[r][c];
				if (r == rLength - 1) {
					matrixString += " ]";
				}else
					matrixString += ", ";
			}
			matrixString += "\n";
		}
		System.out.println(matrixString);
	}
}
