package vehicles;

public class Seafaring extends Vehicle {

    private boolean underwaterTravel;
    private int numberOfStores;

    public Seafaring(int numberOfWheels, int maximumOccupancy, double topSpeed, String make, String model, FuelType fuelType, TransportType transportType, boolean underwaterTravel, int numberOfStores){
        super(numberOfWheels, maximumOccupancy, topSpeed, make, model, fuelType, transportType);
        this.underwaterTravel = underwaterTravel;
        this.numberOfStores = numberOfStores;
    }

}
