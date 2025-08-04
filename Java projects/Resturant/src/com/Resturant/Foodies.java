package com.Resturant;

import java.util.Scanner;

public class Foodies {

    // Variables to store registered user info
    static String registeredUsername = "";
    static String registeredPassword = "";

    // Menu items and prices
    static String[] items = {"Pizza", "Burger", "Pasta", "Fries"};
    static int[] prices = {250, 150, 200, 100};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // Main Menu
            System.out.println("\n--- Welcome to the Restaurant App ---");
            System.out.println("1. Signup");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    // Signup
                    System.out.print("Enter a username: ");
                    registeredUsername = scanner.nextLine();
                    System.out.print("Enter a password: ");
                    registeredPassword = scanner.nextLine();
                    System.out.println("Signup successful! You can now login.");
                    break;

                case 2:
                    // Login
                    if (registeredUsername.isEmpty()) {
                        System.out.println("No user registered. Please signup first.");
                        break;
                    }

                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();

                    if (username.equals(registeredUsername) && password.equals(registeredPassword)) {
                        System.out.println("\nLogin successful!");
                        displayMenu();
                    } else {
                        System.out.println("Invalid login details. Please enter valid username and password.");
                    }
                    break;

                case 3:
                    // Exit
                    System.out.println("Exiting the program. Thank you!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }

        scanner.close();
    }

    // Method to display menu
    public static void displayMenu() {
        System.out.println("\n--- Menu ---");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i] + " - ₹" + prices[i]);
        }
    }
}
