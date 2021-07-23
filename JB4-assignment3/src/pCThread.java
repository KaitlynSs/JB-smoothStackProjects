import java.util.ArrayList;

public class pCThread {

	int randomInt;
	ArrayList<Integer> PCAList = new ArrayList<Integer>();
	
	public static void main (String[] args) throws InterruptedException {
		
		pCThread PCT = new pCThread();
		
		System.out.println("now starting the program...\n"
				+ "producing and consuming integers");
		while (true) {
        PCT.p.run();
        PCT.c.run();
		}

	}
	     
	    Thread p = new Thread("producer thread") {
	        public void run() {
	        	synchronized (this) {
	                while (PCAList.size() == 3) {
						try {
							wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
							System.out.println("error: c couldn't wait");
						}
	                }
	                	
	                for (int i = 0; i < 3; i++) {
	                	randomInt = (int) Math.floor(Math.random() * 100);
		        	    PCAList.add(randomInt);
		        	    System.out.println("   + " + Thread.currentThread().getName() + " produced int " + randomInt);
		        	    try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}	        	
	                }
	                notify();
	                try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	        	}
	        }
	    };
	    
	    Thread c = new Thread("consumer thread") {
	        public void run() {
	        	synchronized (this) {
	        		while (PCAList.size() == 0) {
						try {
							wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
							System.out.println("error: p couldn't wait");
						}
	                }
	                	
	                for (int j = 2; j >= 0; j--) {
	                	int temp = PCAList.get(j);
	                	PCAList.remove(j);
	                	
		        	    System.out.println("   - " + Thread.currentThread().getName() + " consumed int " + temp);
		        	    try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}	        	
	                }
	                notify();
	                try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	        	}
	        }
	    };
}

