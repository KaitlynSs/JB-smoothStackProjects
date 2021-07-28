import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunctionalA4 {
	
public static void main (String[] args) {
	Scanner s = new Scanner(new InputStreamReader(System.in));
	List<String> list = new ArrayList<String>();
	
	System.out.println("Enter a series of strings seperated by spaces\n"
			+ "(add any integer to stop input and move on) input example -> hi hello x xox 3");
		
		while (s.hasNext() && !s.hasNextInt()) {
			list.add(s.next());
		}	
		
		removeX(list);
}

private static void removeX(List<String> list) {
	
	System.out.println("removing all X's result...");
	list.stream().forEach((p) -> System.out.print(p.replaceAll("x", "").replaceAll("X", "") + " "));
}
}

