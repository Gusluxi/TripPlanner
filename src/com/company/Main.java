package com.company;

public class Main {

    void run() {
        String headerText = "MENU:"; // Text to print ABOVE menu
        String leadText = "Please choose: "; // Lead text to print when asking user to make choice
        // Array of menu items:
        String[] menuItems = {"Create trip", "List trip", "9. Quit"};
        boolean run = true; // Don't change!
        int choice = -1; // Don't change!

        while (run) {
            Trip trip = new Trip();
            Menu menu = new Menu(headerText, leadText, menuItems); // Create new menu instance
            menu.printMenu(); // Print menu
            choice = menu.readChoice(); // Ask user to choose menu item

            // Switch on user's choice:
            switch (choice) {
                case 1:
                    System.out.println("You chose ONE");
                    trip.createTrip();

                    break;
                case 2:
                    System.out.println("You chose TWO");
                    trip.displayTrips();
                    break;
                case 9:
                    System.out.println("Quitting.");
                    run = false;
                    break;
                default:
                    System.out.println("You chose an INVALID NUMBER");
                    break;
            }
        }
    }

        public static void main (String[]args){
            new Main().run();
        }

}


