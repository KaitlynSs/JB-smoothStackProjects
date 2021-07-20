import java.io.InputStreamReader;
import java.util.Scanner;

public class starsAndDots {

	private static Scanner scanner;

	public static void main(String args[]) {
		scanner = new Scanner(new InputStreamReader(System.in));
		
		System.out.println("What pattern would you like to see...\n"
				+ "1) star pyrimid \n"
				+ "2) reverse star pyrimid \n"
				+ "3) star pyrimid, centered \n"
				+ "4) reverse star pyrimid, centered \n"
				+ "5) print all paterns in listed order, 1-4");
		int input = scanner.nextInt();
		
		if (input >= 1 && input <= 5) {
			System.out.println("\nOk, pattern " + input + " selected\n");	
			
			switch (input) {
			case 1:
				starPyrimid();
				break;
			case 2:
				reverseStarPyrimid();
				break;
			case 3:
				starPyrimidC();
				break;
			case 4:
				reverseStarPyrimidC();
				break;
			case 5:
				starPyrimid(); //1
				reverseStarPyrimid(); //2
				starPyrimidC(); //3
				reverseStarPyrimidC(); //4
				break;
			}

		} else {
			System.out.println("\nnot a valid input, please try again\n");
		}
	}
	
	public static void starPyrimid() {
		System.out.println("1)");
		for (int a = 1; a <= 4; a++) {
			for (int tempA = a; tempA > 0; tempA--) {
				System.out.print("*");
			    }
			System.out.print("\n");
			}
		System.out.print(".........");
		System.out.println("\n");
		}
	
	public static void reverseStarPyrimid() {
		System.out.println("2)\n..........");
		for (int a = 4; a >= 0; a--) {
			for (int tempA = a; tempA > 0; tempA--) {
				System.out.print("*");
				}
			System.out.print("\n");
		}
	}
	
	public static void starPyrimidC() {
		System.out.println("3)");
		String spaces = "";
		
		for (int a = 1; a <= 7; a++) {
			int nSpaces = (11 - a)/2;
			for (int tempS = nSpaces; tempS > 0; tempS--) {
				spaces += " ";
			}
			System.out.print(spaces);
			for (int tempA = a; tempA > 0; tempA--) {
				System.out.print("*");
			    }
			System.out.print(spaces + "\n");
			spaces = "";
			a++;
			}
		System.out.print("...........");
		System.out.println("\n");
	}
	
	public static void reverseStarPyrimidC() {
		System.out.println("4)\n............");
		String spaces = "";
		
		for (int a = 7; a >= 0; a--) {
			int nSpaces = (11 - a)/2;
			for (int tempS = nSpaces; tempS > 0; tempS--) {
				spaces += " ";
			}
			System.out.print(spaces);
			for (int tempA = a; tempA > 0; tempA--) {
				System.out.print("*");
			    }
			System.out.print(spaces + "\n");
			spaces = "";
			a--;
			}
	}
}
