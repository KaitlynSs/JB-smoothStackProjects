import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

class lambdasAndInterfacesTest {

	@Test
	void testSortLength() {
		
		lambdasAndInterfaces test1 = new lambdasAndInterfaces();
		
		ArrayList<String> Atest1 = new ArrayList<>(Arrays.asList("this", "is", "the", "sort", "length", "test"));
		ArrayList<String> CA1 = new ArrayList<>(Arrays.asList("is", "the", "this", "sort", "test", "length"));
		
		System.out.println("\nsort length test\n"
				+ "   - current List --> " + Atest1);
		
		test1.sortLength(Atest1);
		System.out.println("      - new List --> " + Atest1);
		
		assertEquals("test 1: sort length", CA1, Atest1);
		}

	@Test
	void testSortReverseLength() {
		
		lambdasAndInterfaces test2 = new lambdasAndInterfaces();
		
		ArrayList<String> Atest2 = new ArrayList<>(Arrays.asList("this", "is", "the", "reverse", "sort", "length", "test"));
		ArrayList<String> CA2 = new ArrayList<>(Arrays.asList("reverse", "length", "this", "sort", "test", "the","is"));
		
		System.out.println("\nsort reverse length test\n"
				+ "   - current List --> " + Atest2);
		
		test2.sortReverseLength(Atest2);
		System.out.println("      - new List --> " + Atest2);
		
		assertEquals("test 2: sort reverse length", CA2, Atest2);
	}

	@Test
	void testSortAlphabetical() {
		
		lambdasAndInterfaces test3 = new lambdasAndInterfaces();
		
		ArrayList<String> Atest3 = new ArrayList<>(Arrays.asList("check", "object", "virus", "sketch", "confuse", "peanut", "test"));
		ArrayList<String> CA3 = new ArrayList<>(Arrays.asList("check", "confuse", "object", "peanut", "sketch", "test", "virus"));
		
		System.out.println("\nsort alphabetical test\n"
				+ "   - current List --> " + Atest3);
		
		test3.sortAlphabetical(Atest3);
		System.out.println("      - new List --> " + Atest3);
		
		assertEquals("test 3: sort alphabetical", CA3, Atest3);
	}

	@Test
	void testSortEFirst() {
		
		lambdasAndInterfaces test4 = new lambdasAndInterfaces();
		
		ArrayList<String> Atest4 = new ArrayList<>(Arrays.asList("panic", "enemy", "appearence", "horn", "education", "eat", "call"));
	    ArrayList<String> CA4 = new ArrayList<>(Arrays.asList("eat", "education", "enemy", "horn", "panic", "appearence", "call"));
		
		System.out.println("\nsort E first\n"
				+ "   - current List --> " + Atest4);
		
		test4.sortEFirst(Atest4);
		System.out.println("      - new List --> " + Atest4);
		
		assertEquals("test 4: sort E first", CA4, Atest4);
	}

	@Test
	void testEOCheck() {
		
		lambdasAndInterfaces test5 = new lambdasAndInterfaces();
		
		ArrayList<Integer> Atest5 = new ArrayList<>(Arrays.asList(19, 54, 42, 66, 78, 101, 69));	
	    String CS5 = "o19, e54, e42, e66, e78, o101, o69";
		
		System.out.println("\nsort E O check\n"
				+ "   - current List --> " + Atest5);
		
		String temp = test5.eOCheck(Atest5);
		System.out.println("      - new List --> " + temp);
		
		assertTrue("test 5: E O check", CS5.equals(temp));
	}

	@Test
	void testGetA3Method() {
		
		lambdasAndInterfaces test6 = new lambdasAndInterfaces();
		
		ArrayList<String> Atest6 = new ArrayList<>(Arrays.asList("am", "do", "if", "is", "abcd", "for", "as"));
	    String CS6 = "am, as";
	    
	    System.out.println("\nget a 3 method\n"
				+ "   - current List --> " + Atest6);
		
		String newS = test6.getA3Method(Atest6);
		System.out.println("      - String --> " + newS);
		
		assertTrue("test 6: get A 3", CS6.equals(newS));
	}

}
