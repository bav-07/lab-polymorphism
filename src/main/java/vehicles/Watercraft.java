package vehicles;

public class Watercraft extends Vehicle {

    private boolean underwaterTravel;
    private int numberOfStores;
    private int safetyFlareCapacity;
    private int currentDepth;

    public Watercraft(int numberOfWheels, int maximumOccupancy, double topSpeed, String make, String model, FuelType fuelType, TransportType transportType, boolean underwaterTravel, int numberOfStores, int safetyFlareCapacity, int currentDepth){
        super(numberOfWheels, maximumOccupancy, topSpeed, make, model, fuelType, transportType);
        this.underwaterTravel = underwaterTravel;
        this.numberOfStores = numberOfStores;
        this.safetyFlareCapacity = safetyFlareCapacity;
        this.currentDepth = currentDepth;
    }

    //METHODS
    public void replenishSafetyFlareCapacity(){
        if (safetyFlareCapacity < 6){
            safetyFlareCapacity = 15;
        }
    }

    public void diveUnderwater(){
        if ((underwaterTravel) && (currentDepth >= 0)){
            currentDepth = -1000;
        }
    }

    // OVERLOAD (diveUnderwater with argument to allow dive to a desired depth)
    public void diveUnderwater(int desiredDepth){
        if ((underwaterTravel) && (currentDepth > desiredDepth)){
            currentDepth = desiredDepth;
        }
    }
    
    public void riseTowardsSurface(){
        if (currentDepth < 0){
            currentDepth = 0;
        }
    }

    // OVERLOAD (riseTowardsSurface with argument to allow rising to a desired depth (subtly different from dive, which allows diving deeper down, compared to rise, which allows rising up towards the surface and no diving deeper)
    public void riseTowardsSurface(int desiredDepth){
        if ((underwaterTravel) && (currentDepth < desiredDepth)){
            currentDepth = desiredDepth;
        }
    }

    public int getSafetyFlareCapacity(){
        return this.safetyFlareCapacity;
    }

    public void setSafetyFlareCapacity(int safetyFlareCapacity){
        this.safetyFlareCapacity = safetyFlareCapacity;
    }

}
