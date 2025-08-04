package com.MovieBuzz;

import java.util.Scanner;

public class Movies {

    public static void main(String[] args) {
        // Step 1: Define two heroes and their movies
        String hero1 = "Bala Krishna";
        String[] movies1 = {"Legend", "Akanda", "Simha"};

        String hero2 = "Chiru";
        String[] movies2 = {"khadino 150", "Daddy", "Hitler"};

        // Step 2: Ask user to select a hero
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a hero:");
        System.out.println("1. " + hero1);
        System.out.println("2. " + hero2);
        System.out.print("Enter the hero's name: ");
        String userChoice = scanner.nextLine().trim();

        // Step 3: Show movies based on user's input
        System.out.println("\n--- Movie List ---");

        if (userChoice.equalsIgnoreCase(hero1)) {
            System.out.println("Movies of " + hero1 + ":");
            for (String movie : movies1) {
                System.out.println("- " + movie);
            }
        } else if (userChoice.equalsIgnoreCase(hero2)) {
            System.out.println("Movies of " + hero2 + ":");
            for (String movie : movies2) {
                System.out.println("- " + movie);
            }
        } else {
            // If user typed something else, show all movies
            System.out.println("Invalid input. Showing movies of both heroes:");

            System.out.println("\nMovies of " + hero1 + ":");
            for (String movie : movies1) {
                System.out.println("- " + movie);
            }

            System.out.println("\nMovies of " + hero2 + ":");
            for (String movie : movies2) {
                System.out.println("- " + movie);
            }
        }

        scanner.close();
    }
}
