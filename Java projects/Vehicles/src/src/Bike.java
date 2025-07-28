package src;

public class Bike extends Vehilce {
    
    @Override
    void start() {
        System.out.println("turn key");
        System.out.println("press self button");
    }
    @Override
    void stop() {
        System.out.println("turn key left");
    }
    public static void main (String[] args) {
        //create object
        Bike b = new Bike();
        b.start();
        b.stop();
        b.offerDetails();
    }
}

