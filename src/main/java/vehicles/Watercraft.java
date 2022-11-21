package vehicles;

public class Watercraft extends Vehicle {

    private boolean underwaterTravel;
    private int numberOfStores;
    private int safetyFlareCapacity;

    public Watercraft(int numberOfWheels, int maximumOccupancy, double topSpeed, String make, String model, FuelType fuelType, TransportType transportType, boolean underwaterTravel, int numberOfStores, int safetyFlareCapacity){
        super(numberOfWheels, maximumOccupancy, topSpeed, make, model, fuelType, transportType);
        this.underwaterTravel = underwaterTravel;
        this.numberOfStores = numberOfStores;
        this.safetyFlareCapacity = safetyFlareCapacity;
    }

    //METHODS
    public void replenishSafetyFlareCapacity(){
        if (safetyFlareCapacity < 6){
            safetyFlareCapacity = 15;
        }
    }

    public int getSafetyFlareCapacity(){
        return this.safetyFlareCapacity;
    }

    public void setSafetyFlareCapacity(int safetyFlareCapacity){
        this.safetyFlareCapacity = safetyFlareCapacity;
    }

}
