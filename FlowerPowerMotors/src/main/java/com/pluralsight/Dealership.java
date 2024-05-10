package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership
{
    // private variables
    private String name;
    private String location;
    private String phoneNumber;
    private List<Vehicle> vehicles;

    // constructor
    public Dealership(String name, String location, String phoneNumber)
    {
        this.name = name;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.vehicles = new ArrayList<>(); // instantiate the array list vehicle
    }

    // methods
    public void addVehicle(Vehicle vehicle)
    {
        vehicles.add(vehicle);
    }

    public List<Vehicle> getAllVehicles()
    {
        return vehicles;
    }

    public void removeVehicle()
    {

    }

    public Vehicle searchByYear(int year) {
        return null;
    }

    public Vehicle searchByMake(String make) {
        return null;
    }

    public Vehicle searchByModel(String model) {
        return null;
    }

    public Vehicle searchByColor(String color)
    {
        return null;
    }

    public Vehicle searchByPrice(double price)
    {
        return null;
    }


}
