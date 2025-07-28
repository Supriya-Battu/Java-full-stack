package src;

public interface Vehicle1 {
	int a =10;
	abstract void start();
	abstract void stop();
	default  void offerDetails()
	{
		System.out.println("30% off");
	}
	
}
