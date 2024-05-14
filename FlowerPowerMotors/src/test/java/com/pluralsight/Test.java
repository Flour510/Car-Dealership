package com.pluralsight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DealershipTest
{
    private Dealership dealership;

    @BeforeEach
    public void setUp()
    {
        // sample dealership to test
        dealership = new Dealership("Test Dealership", "Oakland Ca", "510-444-4444");
        dealership.addVehicle(new Vehicle(0, 4000, "Volkswagen", "Flying Beetle", "Opal", 900000));
        dealership.addVehicle(new Vehicle(1, 50, "Donkey", "Mammal", "Grey", 20));
    }

    @Test
    public void testListAll_Vehicles()
    {
        // arrange
        List<Vehicle> vehicleList = dealership.getAllVehicles();

        // act
        assertEquals(2, vehicleList.size());

        // assert
        Vehicle firstVehicle = vehicleList.get(0);
        assertEquals(0, firstVehicle.getId());
        assertEquals(4000, firstVehicle.getYear());
        assertEquals("Volkswagen", firstVehicle.getMake());
        assertEquals("Flying Beetle", firstVehicle.getModel());
        assertEquals("Opal", firstVehicle.getColor());
        assertEquals(900000, firstVehicle.getPrice());

        Vehicle secondVehicle = vehicleList.get(1);
        assertEquals(1, secondVehicle.getId());
        assertEquals(50, secondVehicle.getYear());
        assertEquals("Donkey", secondVehicle.getMake());
        assertEquals("Mammal", secondVehicle.getModel());
        assertEquals("Grey", secondVehicle.getColor());
        assertEquals(20, secondVehicle.getPrice());
    }
}
