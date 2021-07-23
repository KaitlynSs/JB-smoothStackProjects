public class doubleSingletonCheck {
	
	private static doubleSingletonCheck obj = null;
	private doubleSingletonCheck() {
		//used to check singleton class
		s = " is an instance of my singleton class";
	}
	
	public String s;
	public doubleSingletonCheck getInstance() {
		
		if (obj == null) {        //check
			synchronized(this) {    //lock
				if (obj == null) {    //check
					obj = new doubleSingletonCheck();
				}
			}
		}
		return obj;
	}
	
	public static void main (String[] args) {
		doubleSingletonCheck sClass = new doubleSingletonCheck();
		
		doubleSingletonCheck A = sClass.getInstance();
		doubleSingletonCheck B = sClass.getInstance();
		doubleSingletonCheck C = sClass.getInstance();
		
		System.out.println("test of my singleton class...");
		System.out.println("object A " + A.s);
		
		B.s = B.s.toUpperCase();
		System.out.println("object B " + B.s);
		
		C.s += " HOORAY!!";
		System.out.println("object C " + C.s);		
	}
}