package src;

public class Bikee implements Vehicle1{
		
	        public void start() {
	        System.out.println("a value"+a);
	        System.out.println("turn key");
	        System.out.println("press self button");
	    }
	    
	        public void stop() {
	        System.out.println("turn key left");
	    }
	    public static void main (String[] args) {
	        //create object
	        Bikee b = new Bikee();
	        b.start();
	        b.stop();
	        b.offerDetails();
	    }
	}


