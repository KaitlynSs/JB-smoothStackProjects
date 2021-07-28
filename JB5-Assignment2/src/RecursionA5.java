import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecursionA5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<Integer>();

		System.out.println("Enter integers to list\n"
				+ "(add any character that's not an integer to stop input and move on) input example -> 1 7 3 45 2 191 s");

		final String input = s.nextLine();
		final Scanner lineScanner = new Scanner(input);
		while(lineScanner.hasNextInt()) {
		    list.add(lineScanner.nextInt());
		}

		System.out.println(list);
		
		System.out.println("Enter target integer...");

		int target = s.nextInt();

		if (groupSumClump(0, list, target) == true)
			System.out.print( "group sum found equal to target --> TRUE");
		else
			System.out.print( "group sum found equal to target --> FALSE");
	}

	public static boolean groupSumClump(int st, List<Integer> l2, int t) { 
		if (st >= l2.size())
			return t == 0;

		int i = st;
		int sum = 0;

		while (i < l2.size() && l2.get(st) == l2.get(i)) { 
			i++;
		}

		if (groupSumClump(i, l2, t - sum))
			return true;

		if (groupSumClump(i, l2, t))
			return true;

		return false;
	}
}
