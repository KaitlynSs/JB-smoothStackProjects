import java.io.*;
import java.util.*;

interface operationChecker {
	boolean check(int value);
	}

public class lambdaA1 {
	
	
	public static boolean checker(operationChecker oC, int num) {
		  return oC.check(num);
	}
	
	public static operationChecker isOdd() {
		return value -> { if (value % 2 == 0) {return false;} else {return true;} };
	}
	
	public static operationChecker isPrime() {
		return value -> { for (int i = 2; i * i <= value; i++) {
			              	if (value % i == 0) {return false; }
		                  }
		                  return true; };
}
			              
	public static operationChecker isPalindrome() {
		return value -> { int RValue = 0, remainder;
		                  for (int i = value; i != 0; i /= 10) {
		                	  RValue = RValue * 10 + i % 10;
	                      }
		                  if (RValue == value) {return true;} else {return false; }};
	}
	
	public static void main(String[] args) {
		lambdaA1 A1 = new lambdaA1();
		operationChecker oC;
		int functionValue, functionInput;
		boolean bool = true, valid = false;
		List<Integer> list = new ArrayList<Integer>();
		Scanner s = new Scanner(new InputStreamReader(System.in));
		
		
		System.out.println("lambda assignment 1...\n");
		
		//checks if input is valid
		while (valid == false) {
			
			System.out.println("How many test cases would you like to preform?");
			int nTests = s.nextInt();
			
			System.out.println("enter " + nTests * 2 + " numbers sepererated by a space where every even number represents one of the following opperations...\n"
					+ "1) check if prime         2) check if odd         3) check if palindrome\n\n"
					+ "(add any letter at the end to stop allowing input) input example -> 1 7 3 45 2 191 s");
			
			
			while (s.hasNextInt()) {
			 
				list.add(s.nextInt());
			}
			if (list.size() % 2 != 0) 
				System.out.println("Error: odd number of input\n");
			

			for (int i = 0; i < list.size(); i++) {
				
				if (list.get(i) > 3 || list.get(i) < 1) {
					System.out.println("Error: no valid even input, make sure all even inputs are between 1 and 3\n");
					bool = false;
				}
				valid = bool;
				i++;
			}
		}
		
		System.out.println("\n\ninput valid: now calculating test results...\n");
		
		for (int j = 0; j < list.size(); j++) {
			functionValue = list.get(j);
			
			switch (functionValue) {
			case 1:
				functionInput = list.get(j+1);
				oC = A1.isPrime();
				bool = A1.checker(oC, functionInput);
				if (bool == true) 
					System.out.println(functionInput + " --> PRIME");
				else
					System.out.println(functionInput + " --> COMPOSITE");
				break;
			case 2:
				functionInput = list.get(j+1);
				oC = A1.isOdd();
				bool = A1.checker(oC, functionInput);
				if (bool == true) 
					System.out.println(functionInput + " --> ODD");
				else
					System.out.println(functionInput + " --> Even");
				break;
			case 3:
				functionInput = list.get(j+1);
				oC = A1.isPalindrome();
				bool = A1.checker(oC, functionInput);
				if (bool == true) 
					System.out.println(functionInput + " --> PALINDROME");
				else
					System.out.println(functionInput + " --> NOT PALINDROME");
				break;
			}
			j++;
		}
	}
}


