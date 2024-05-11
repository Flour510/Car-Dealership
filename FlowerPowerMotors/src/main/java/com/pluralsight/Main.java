package com.pluralsight;

// imports
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner userInput = new Scanner(System.in);
    static String userName;

    public static void main(String[] args)
    {
        // prompt the user for their first name for a more personalized experience
        System.out.println();
        System.out.println("Enter your first name: ");
        userName = userInput.nextLine().trim().toUpperCase();
        System.out.println();

        // greet the user
        System.out.println("_".repeat(65));
        System.out.println("                            Hi, " + userName + " \uD83D\uDC4B");
        System.out.println("              Welcome to \uD83C\uDF38 Flower Power Motors! \uD83D\uDE99\uD83D\uDCA8");
        System.out.println("Where we specialize exclusively in Volkswagen Beetle Inventory ✨ ");
        System.out.println("_".repeat(65));

        System.out.println();
        System.out.println("                        Current Inventory ");
        System.out.println("_".repeat(65));

        // creates an instance of dealership file manager
        DealershipFileManager dealershipFileManager = new DealershipFileManager();

        // gets the dealership object
        Dealership dealership = dealershipFileManager.getDealership();

        // print information about the dealership by using a loop
        for (Vehicle vehicle : dealership.getAllVehicles())
        {
            System.out.println(vehicle);
        }




    }
}