package com.bus;

class Bus {
    // Array to track seat bookings (true = booked, false = available)
    boolean[] seats = new boolean[10];

    // Method to book a seat
    public synchronized void bookSeat(int seatNumber, String passengerName) {
        System.out.println(passengerName + " is trying to book seat " + seatNumber);

        if (seatNumber < 1 || seatNumber > 10) {
            System.out.println("Invalid seat number. Choose between 1 to 10.");
            return;
        }

        if (!seats[seatNumber - 1]) {
            // Seat is available
            System.out.println("Seat " + seatNumber + " successfully booked for " + passengerName);
            seats[seatNumber - 1] = true;

            // Simulate delay (to mimic real-time processing)
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        } else {
            // Seat is already booked
            System.out.println("Sorry, seat " + seatNumber + " is already booked!");
        }
    }
}

class BookingThread extends Thread {
    Bus bus;
    int seatNumber;
    String passengerName;

    BookingThread(Bus bus, int seatNumber, String passengerName) {
        this.bus = bus;
        this.seatNumber = seatNumber;
        this.passengerName = passengerName;
    }

    @Override
    public void run() {
        bus.bookSeat(seatNumber, passengerName);
    }
}

public class BusBookingApp {
    public static void main(String[] args) {
        Bus bus = new Bus();

        // Create multiple threads trying to book the same seat
        BookingThread user1 = new BookingThread(bus, 5, "Alice");
        BookingThread user2 = new BookingThread(bus, 5, "Bob");
        BookingThread user3 = new BookingThread(bus, 3, "Charlie");

        // Start threads
        user1.start();
        user2.start();
        user3.start();
    }
}
