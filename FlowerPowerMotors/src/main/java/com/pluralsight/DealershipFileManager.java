package com.pluralsight;

// imports
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
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
        Dealership dealership = null;
        List<Vehicle> inventory = new ArrayList<>(); // populate the inventory with a list of vehicles

        // read the file and populate the inventory
        try(Scanner fileScanner = new Scanner(new File(filePath)))
        {
            String dealershipLine = fileScanner.nextLine();
            String[] dealerInfo = dealershipLine.split("\\|");
            String name = dealerInfo[0]; // only does this once
            String addLocation = dealerInfo[1];
            String phoneNumber = dealerInfo[2];
            dealership = new Dealership(name, addLocation, phoneNumber);

            // read the contents of the file
            while(fileScanner.hasNextLine())
            {
                String line = fileScanner.nextLine();
                String[] fields = line.split("\\|"); // split on the pipe

                int id = Integer.parseInt(fields[0].trim());
                int year = Integer.parseInt(fields[1].trim());
                String make = fields[2];
                String model = fields[3];
                String color = fields[4];
                double price = Double.parseDouble(fields[5].replace("$", "").replace(",", "").trim());

                // create vehicle object and add it to inventory
                Vehicle vehicle = new Vehicle(id, year, make, model, color, price);
                dealership.addVehicle(vehicle);

                //System.out.println(line); // prints out the inventory csv file list
            }
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Error, file not found. ");
        }
        return dealership;
    }

    public void saveDealership(Dealership dealership)
    {
        File file = new File("file/inventory.csv");

        try (FileWriter fileWriter = new FileWriter(file))
        {
            fileWriter.write(dealership.getName() + "|" + dealership.getLocation() + "|" + dealership.getPhoneNumber() + "\n");
            for (Vehicle vehicle : dealership.getAllVehicles())
            {
                fileWriter.write(vehicle.getId() + "|" + vehicle.getYear() + "|" + vehicle.getMake() + "|" + vehicle.getModel() + "|" + vehicle.getColor() + "|" + vehicle.getPrice() + "\n");
            }
        }
        catch (Exception e)
        {
            System.out.println("Error. ");
        }
    }
}
