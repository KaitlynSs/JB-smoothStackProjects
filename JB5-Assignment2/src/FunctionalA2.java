import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunctionalA2 {
public static void main (String[] args) {
	Scanner s = new Scanner(new InputStreamReader(System.in));
	List<Integer> list = new ArrayList<Integer>();
	boolean valid = false;
	String result;
	
	System.out.println("Enter a series of positive integers seperated by spaces\n"
			+ "(add any character that's not an integer to stop input and move on) input example -> 1 7 3 45 2 191 s");
	
	while (valid == false) {		
		boolean bool = true;
		
		while (s.hasNextInt()) {
			list.add(s.nextInt());
		}		

		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i) < 0) {
				System.out.println("Error: " + list.get(i) + " is not a valid input, make sure all even integers are positive\n");
				bool = false;
			}
			valid = bool;
		}
	}
	result = rightDigit(list);
	
	System.out.println("Result = " + result);		
	}

private static String rightDigit(List<Integer> list) {
	String r = "[";
	
	for (int j = 0; j < list.size(); j++) {
		String number = list.get(j).toString();
		char digit = number.charAt(number.length() - 1);
		
		if (j == list.size() - 1)
			r+= digit + "]";
		else
			r += digit + ", ";
	}
	return r;
}
	

}

