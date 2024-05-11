package com.pluralsight;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class UserInterface
{
    static Scanner userInput = new Scanner(System.in);
    static String userName;
    static int choice = 0;

    private Dealership dealership;

    // constructor
    public UserInterface()
    {
        this.dealership = new Dealership(); // initialize dealership object
    }

    public static void personalize()
    {
        // prompt the user for their first name for a more personalized experience
        System.out.println();
        System.out.println("Enter your first name: ");
        userName = userInput.nextLine().trim().toUpperCase();
        System.out.println();
    }

    // method to display greeting
    public static void greeting()
    {
        // greet the user
        System.out.println("_".repeat(65));
        System.out.println();
        System.out.println("                           Hi, " + userName + " \uD83D\uDC4B");
        System.out.println("              Welcome to \uD83C\uDF38 Flower Power Motors! \uD83D\uDE99\uD83D\uDCA8");
        System.out.println("Where we specialize exclusively in Volkswagen Beetle Inventory ✨ ");

        UserInterface userInterface = new UserInterface();
        userInterface.display();
    }

    // method to display menu
    public void display() {

        do {
            // print the menu screen
            System.out.println("_".repeat(65));
            System.out.println();
            System.out.println("                             \uD83D\uDD0D \uD83D\uDE97 ");
            System.out.println("                              Menu");
            System.out.println("_".repeat(65));
            System.out.println();
            System.out.println("What do you want to do " + userName + "?");
            System.out.println();
            System.out.println("1 - List all Available Vehicles");
            System.out.println("2 - Add a Vehicle to the Inventory");
            System.out.println("3 - Remove a Vehicle from the Inventory");
            System.out.println("4 - Exit the Application");
            System.out.println();
            System.out.println("Make a selection below: ");
            choice = Integer.parseInt(userInput.nextLine().trim());

            // create a switch statement from menu options
            switch (choice) {
                case 1:
                    processGetAllVehiclesRequest();
                    break;
                case 2:
                    processAddVehicleRequest();
                    break;
                case 3:
                    processRemoveVehicleRequest();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Goodbye for now " + userName + "!");
                    System.out.println("👋");
                    System.exit(1);
                default:
                    System.out.println();
                    System.out.println("Error: Invalid selection. ");
                    return;
            }
        } while (choice != 4);
      }

    public void processGetAllVehiclesRequest()
    {
         System.out.println();
         System.out.println("_".repeat(65));
         System.out.println();
         System.out.println("                     \uD83D\uDE99 Current Inventory \uD83D\uDE97 ");
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

         // prompt user to make their next move with the following options
        System.out.println();
        System.out.println("What do you want to do next " + userName + "?");
        System.out.println();
        System.out.println("A - Return to Menu Screen");
        System.out.println("B - Exit the Application");
        System.out.println();
        System.out.println("Enter your choice below: ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        // process the users choice
        switch (choice.toUpperCase())
        {
            case "A":
                display();
                break;
            case "B":
                System.out.println();
                System.out.println("Goodbye for now " + userName + "!");
                System.out.println("👋");
                System.exit(1);
            default:
                System.out.println();
                System.out.println("An error has occurred while retrieving selection. ");
                break;
        }
    }

    public void processAddVehicleRequest()
    {
        System.out.println();
        System.out.println("-".repeat(65));
        System.out.println("                         ➕ Add Vehicle");
        System.out.println("-".repeat(65));
        System.out.println();
        System.out.println("Enter two digit ID number: ");
        int twoDigitIdNumber = Integer.parseInt(userInput.nextLine()); // prompt user for id number
        System.out.println("Enter vehicle Year in this format (YYYY): ");
        int year = Integer.parseInt(userInput.nextLine()); // prompt the user to enter year
        System.out.println("Enter vehicle Make: ");
        String make = userInput.nextLine(); // prompt the user to enter the make
        System.out.println("Enter the vehicle Model: ");
        String model = userInput.nextLine(); // prompt the user to enter the model
        System.out.println("Enter the vehicle Color: ");
        String color = userInput.nextLine(); // prompt the user to enter the color
        System.out.println("Enter the vehicle Price (type a $ sign, followed by the price): ");
        String price = userInput.nextLine(); // prompt the user to enter the price
        System.out.println();

        // format the users provided information
        String addedVehicleInformation = twoDigitIdNumber + "|" + year + "|" + make + "|" + model + "|" + color + "|" + price;

        // save the added information into the csv file
        File file = new File("file/inventory.csv");

        try (FileWriter fileWriter = new FileWriter(file, true);
             PrintWriter writer = new PrintWriter(fileWriter);
        ){
            writer.println(addedVehicleInformation); // write the added information to the file
            writer.flush();
            System.out.println("New vehicle added successfully! ✨ ");
        } catch (IOException ex) {
            System.out.println("An error has occurred. New vehicle was not added. ");
            ex.printStackTrace();
        }

        // prompt user to make their next move with the following options
        System.out.println();
        System.out.println("What do you want to do next " + userName + "?");
        System.out.println();
        System.out.println("A - Add another Vehicle");
        System.out.println("B - Return to Menu Screen");
        System.out.println("C - Exit the Application");
        System.out.println();
        System.out.println("Enter your choice below: ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        // process the users choice
        switch (choice.toUpperCase())
        {
            case "A":
                processAddVehicleRequest();
                break;
            case "B":
                display();
                break;
            case "C":
                System.out.println();
                System.out.println("Goodbye for now " + userName + "!");
                System.out.println("👋");
                System.exit(1);
            default:
                System.out.println();
                System.out.println("An error has occurred while retrieving selection. ");
                break;
        }
    }

    public void processRemoveVehicleRequest()
    {

    }

    public void processGetByPriceRequest()
    {

    }

    public void processGetByModelRequest()
    {

    }

    public void processGetByYearRequest()
    {

    }

    public void processGetByColorRequest()
    {

    }

}
