package src;

public class Car extends Vehilce {

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Turn on ");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println(" Turn off");
		
	}
	 public static void main (String[] args) {
	        //create object
	        Car b = new Car();
	        b.start();
	        b.stop();
	        b.offerDetails();
	 }

}
