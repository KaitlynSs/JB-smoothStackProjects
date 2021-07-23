public class deadlockClass {
		 
	    String s1 = "this is string 1";
	    String s2 = "this is string 2";
	     
	    Thread t1 = new Thread("thread for s1") {
	        public void run() {
	            while(true) {
	                synchronized(s1) {
	                    synchronized(s2) {
	                    	System.out.println(Thread.currentThread().getName() + " locked s2");
	                    	try {
	            				Thread.sleep(500);
	            			} catch (InterruptedException e){
	            				e.printStackTrace();
	            			}
	                    }
	                }
	            }
	        }
	    };
	     
	    Thread t2 = new Thread("thread for s2") {
	        public void run() {
	            while(true) {
	                synchronized(s2) {
	                    synchronized(s1) {
	                    	System.out.println(Thread.currentThread().getName() + " locked s1");
	                    	try {
	            				Thread.sleep(500);
	            			} catch (InterruptedException e){
	            				e.printStackTrace();
	            			}
	                    }
	                }
	            }
	        }
	    };
		
		public static void main (String[] args) {
			
			deadlockClass dc = new deadlockClass();
			
			//will eventually stop printing and create a deadlock
	        dc.t1.start();
	        dc.t2.start();
		}
	}

