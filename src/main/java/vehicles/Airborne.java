package vehicles;

public class Airborne extends Vehicle{

    private int flightAltitude;
    private int cabinCrewSize;

    public Airborne(int numberOfWheels, int maximumOccupancy, double topSpeed, String make, String model, FuelType fuelType, TransportType transportType, int flightAltitude, int cabinCrewSize){
        super(numberOfWheels, maximumOccupancy, topSpeed, make, model, fuelType, transportType);
        this.flightAltitude = flightAltitude;
        this.cabinCrewSize = cabinCrewSize;
    }



}
