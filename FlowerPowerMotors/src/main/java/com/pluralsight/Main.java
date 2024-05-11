package com.pluralsight;

/*
The main class should be where you call all of your classes
*/

public class Main
{
    public static void main(String[] args)
    {
        UserInterface userInterface = new UserInterface(); // instantiate UI class
        userInterface.personalize(); // activate the personalize class by calling it here
        userInterface.display(); // activate the user interface class by calling it here

     // System.out.println();
     // System.out.println("                        Current Inventory ");
     // System.out.println("_".repeat(65));
     //
     // // creates an instance of dealership file manager
     // DealershipFileManager dealershipFileManager = new DealershipFileManager();
     //
     // // gets the dealership object
     // Dealership dealership = dealershipFileManager.getDealership();
     //
     // // print information about the dealership by using a loop
     // for (Vehicle vehicle : dealership.getAllVehicles())
     // {
     //     System.out.println(vehicle);
     // }

    }
}