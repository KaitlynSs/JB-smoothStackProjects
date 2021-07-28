import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunctionalA3 {
	
public static void main (String[] args) {
	Scanner s = new Scanner(new InputStreamReader(System.in));
	List<Integer> list = new ArrayList<Integer>();
	
	System.out.println("Enter a series of integers seperated by spaces\n"
			+ "(add any character that's not an integer to stop input and move on) input example -> 1 7 3 45 2 191 s");
		
		while (s.hasNextInt()) {
			list.add(s.nextInt());
		}		
		doubling(list);
		//System.out.print("Result = " + result);
		
	}

private static void doubling(List<Integer> list) {
	System.out.println("Doubling results...");
	list.stream().forEach( (p) -> System.out.print(p*2 + " "));
}
}

