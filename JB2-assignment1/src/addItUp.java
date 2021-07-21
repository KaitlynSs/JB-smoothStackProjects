public class addItUp {
	
	public static void main(String[] args) {
		double num = 0;
		double finalSum = 0;
		int i = 0;
		
		while (i < args.length) {
			//catches if the argument is a 
		    try {
		        num = Double.parseDouble(args[i]);
		    } catch (NumberFormatException e) {
		        System.err.println("Error: " + args[i] + " must be a valid number, please try again");
		        System.exit(1);
		    }
		    	finalSum += num;
		    	i++;
		}
		System.out.println("sum = " + finalSum);
	}
}