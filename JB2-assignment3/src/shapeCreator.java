import java.io.InputStreamReader;
import java.util.Scanner;

public class shapeCreator {

interface Shape {
	
    public double calculateArea(int x, int y, int z);
	public void display(int x, int y, int z, double A, double P);
	}

static class makeCircle implements Shape {
	
	double pi = 3.14;
    
    @Override
    public double calculateArea(int x, int y, int z) {
        return pi * x * x;
    }
    
    public double calculateCircumference(int x) {
        return 2 * pi * x;
    }
    
    @Override
    public void display(int x, int y, int z, double A, double C) {
    	System.out.println("\ncircle stats...\n"
    			+ "Radius = " + x + "\n"
    			+ "Area = " + A + "\n"
    			+ "Circumference = " + C);
    }
}

static class makeRectangle implements Shape {
    
    @Override
    public double calculateArea(int x, int y, int z) {
        return x * y;
    }
    
    public double calculatePerimeter(int x, int y, int z) { 	
        return 2 * (x * y);
    }
    
    @Override
    public void display(int x, int y, int z, double A, double P) {
    	System.out.println("\nrectangle stats...\n"
    			+ "height = " + x + "        width = " + y + "\n"
    			+ "Area = " + A + "\n"
    			+ "Perimeter = " + P);
    }
}
    
static class makeTriangle implements Shape {
        
        @Override
        public double calculateArea(int x, int y, int z) {
        	double s = .5 * (x + y + z);
            return Math.sqrt(s * ((s - x) * (s - y) * (s - z)));
        }
        
        public double calculatePerimeter(int x, int y, int z) {       	
            return x + y + z;
        }
        
        @Override
        public void display(int x, int y, int z, double A, double P) {
        	System.out.println("\ntriangle stats...\n"
        			+ "Side 1 = " + x + "        Side 2 = " + y + "        Side 3 = " + z + "\n"
        			+ "Area = " + A + "\n"
        			+ "Perimeter = " + P);
        }
}

public static void main(String args[]) {

	double area, peremeter, circumference;
	int exitLoop = 0, v1, v2 = 0, v3 = 0, i = 1;
	
	Scanner mScanner = new Scanner(new InputStreamReader(System.in));
	
	while (exitLoop == 0) {
		if (i == 1) {
			System.out.println("Welcome to the shape creator!\n"
					+ "type one of the following commands below to create your shape\n"
					+ "   R: rectangle        C: circle        T: trinagle");		
		}else {
			System.out.println("type one of the following commands below to create another shape\n"
					+ "   R: rectangle        C: circle        T: trinagle");
		}
		
	String input = mScanner.next();
	
	input.toLowerCase();
	
	switch (input) {
	case "r":
		makeRectangle newRect = new  makeRectangle();
		
		System.out.println("Enter height...");
		v1 = mScanner.nextInt(); 
		
		System.out.println("Enter width...");
		v2 = mScanner.nextInt(); 
		
		area = newRect.calculateArea(v1, v2, 0);
		peremeter = newRect.calculatePerimeter(v1, v2, 0);
		
		newRect.display(v1, v2, v3, area, peremeter);
		break;
		
	case "c":
		makeCircle newCir = new makeCircle();
		
		System.out.println("Enter radius...");
		v1 = mScanner.nextInt(); 
		
		area = newCir.calculateArea(v1, 0, 0);
		circumference = newCir.calculateCircumference(v1);
		
		newCir.display(v1, 0, 0, area, circumference);
		
		break;
	case "t":
		makeTriangle newTri = new  makeTriangle();
		
		System.out.println("Enter side 1...");
		v1 = mScanner.nextInt(); 
		
		System.out.println("Enter side 2...");
		v2 = mScanner.nextInt(); 
		
		System.out.println("Enter side 3...");
		v3 = mScanner.nextInt(); 
		
		area = newTri.calculateArea(v1, v2, v3);
		peremeter = newTri.calculatePerimeter(v1, v2, v3);
		
		newTri.display(v1, v2, v3, area, peremeter);
		
		break;		
	}	
	
	System.out.println("Press 'Y' to continue creating shapes, anything else will exit the program");
	input = mScanner.next();
	
	if (input.equals("Y") || input.equals("y")) {
		i = 0;
	}else {
		exitLoop = 1;
		System.out.println("now leaving program");
		}
	}
	}
}


