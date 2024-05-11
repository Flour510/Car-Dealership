package com.pluralsight;

// imports
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DealershipFileManager
{
    public Dealership getDealership() // load and read the csv file
    {
        // file path
        String filePath = "file/inventory.csv";

        // dealership object
        Dealership dealership = new Dealership();
        List<Vehicle> inventory = new ArrayList<>(); // populate the inventory with a list of vehicles

        // read the file and populate the inventory
        try(Scanner fileScanner = new Scanner(new File(filePath)))
        {
            fileScanner.nextLine(); // skips the first line
            fileScanner.nextLine(); // skips the second line

            // read the contents of the file
            while(fileScanner.hasNextLine())
            {
                String line = fileScanner.nextLine();
                String[] fields = line.split("\\|"); // split on the pipe

                int year = Integer.parseInt(fields[1].trim());
                String make = fields[2];
                String model = fields[3];
                String color = fields[4];
                double price = Double.parseDouble(fields[5].replace("$", "").replace(",", "").trim());

                // create vehicle object and add it to inventory
                Vehicle vehicle = new Vehicle(year, make, model, color, price);
                inventory.add(vehicle);

                System.out.println(line); // prints out the inventory csv file list
            }
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Error, file not found. ");
        }
        return dealership;
    }

    public Dealership saveDealership()
    {
        return null;
    }
}
