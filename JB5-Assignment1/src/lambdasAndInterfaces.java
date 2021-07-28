import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class lambdasAndInterfaces {
	
	//sortLength(array)
	public ArrayList<String> sortLength(ArrayList<String> sal) {
		sal.sort((String s1, String s2) -> s1.length()-s2.length());
		return sal;
	}
	
	public ArrayList<String> sortReverseLength(ArrayList<String> sal) {
		sal.sort((String s1, String s2) -> (s2.length()-s1.length()));
		return sal;
	}
	
	public ArrayList<String> sortAlphabetical(ArrayList<String> sal) {
		sal.sort(Comparator.naturalOrder());
		return sal;
	}
	
	public ArrayList<String> sortEFirst(ArrayList<String> sal) {
		sal.sort(Comparator.naturalOrder());
		boolean value = false;
		
		while (value == false) {
			Collections.rotate(sal, -1);
			
			if (sal.get(0).startsWith("e") || sal.get(0).startsWith("E")) 
				value = true;
		}
		return sal;
	}
	
	public String eOCheck(ArrayList<Integer> sal) {
		String returnS = "";
		
		for (int i = 0; i < sal.size(); i++) {
			int tempV = sal.get(i);
			
			if (tempV % 2 == 0)
				returnS += "e" + tempV + ", ";
			else
				returnS += "o" + tempV + ", ";
		}
		return returnS.substring(0, returnS.length() - 2);
	}
	
	public String getA3Method(ArrayList<String> sal) {
		String temps = "";
		
		for (int i = 0; i < sal.size(); i++) {
			
			if (sal.get(i).length() <= 3 && sal.get(i).startsWith("a")) 
				temps += sal.get(i) + ", ";
		}
		return temps.substring(0, temps.length() - 2);
	} 
}
