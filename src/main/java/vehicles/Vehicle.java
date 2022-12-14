package vehicles;

import enumerations.FuelType;
import enumerations.TransportType;

public abstract class Vehicle {

    protected int numberOfWheels;
    protected int maximumOccupancy;
    protected double topSpeed;
    protected String make;
    protected String model;
    protected FuelType fuelType;
    protected TransportType transportType;

    public Vehicle(int numberOfWheels, int maximumOccupancy, double topSpeed, String make, String model, FuelType fuelType, TransportType transportType){
        this.numberOfWheels = numberOfWheels;
        this.maximumOccupancy = maximumOccupancy;
        this.topSpeed = topSpeed;
        this.make = make;
        this.model = model;
        this.fuelType = fuelType;
        this.transportType = transportType;
    }

    public abstract String description();

}
