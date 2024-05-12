package com.pluralsight;

public class Vehicle {
    private int id;
    private int year;
    private String make;
    private String model;
    private String color;
    private double price;

    public Vehicle(int id, int year, String make, String model, String color, double price) {
        this.id = id;
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String toString()
    {
        return String.format(
                "%-15d  %-15d %-15s %-15s %-15s %.2f" ,
                id, year, make,model, color, price);
    }
}
