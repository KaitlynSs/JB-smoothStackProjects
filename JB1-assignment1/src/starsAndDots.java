public class starsAndDots {

	public static void main(String args[]) {
		//functions split for debugging purposes
				starPyrimid(); //1
				reverseStarPyrimid(); //2
				starPyrimidC(); //3
				reverseStarPyrimidC(); //4
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
