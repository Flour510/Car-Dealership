package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership
{
    // private variables
    private String name;
    private String location;
    private String phoneNumber;
    private ArrayList<Vehicle> vehicles; // instantiate the array list vehicle

    // constructor
    public Dealership(String name, String location, String phoneNumber)
    {
        this.name = name;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.vehicles = new ArrayList<>(); // instantiate the array list vehicle
    }

    public Dealership() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
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

    public void removeVehicle(Vehicle vehicle)
    {
        vehicles.remove(vehicle);
    }

    public Vehicle searchByYear(int year) {
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
