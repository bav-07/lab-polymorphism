package vehicles;

public class Watercraft extends Vehicle {

    private boolean underwaterTravel;
    private int numberOfStores;
    private int safetyFlareCapacity;
    private int maxOperatingDepth;
    private int currentDepth;

    public Watercraft(int numberOfWheels, int maximumOccupancy, double topSpeed, String make, String model, FuelType fuelType, TransportType transportType, boolean underwaterTravel, int numberOfStores, int safetyFlareCapacity, int maxOperatingDepth, int currentDepth){
        super(numberOfWheels, maximumOccupancy, topSpeed, make, model, fuelType, transportType);
        this.underwaterTravel = underwaterTravel;
        this.numberOfStores = numberOfStores;
        this.safetyFlareCapacity = safetyFlareCapacity;
        this.maxOperatingDepth = maxOperatingDepth;
        this.currentDepth = currentDepth;
    }

    //METHODS
    public String description(){
        String firstSentence = String.format("The %s %s.",make,model);
        String secondSentence;
        if (underwaterTravel){
            secondSentence = String.format(" It is a marine vehicle that can travel underwater at a depth of %dm.", maxOperatingDepth);
        }
        else {
            secondSentence = "It is a marine vehicle.";
        }
        String thirdSentence = String.format(" It can carry a maximum of %d passengers.",maximumOccupancy);
        return firstSentence + secondSentence + thirdSentence;
    }

    public void replenishSafetyFlareCapacity(){
        if (safetyFlareCapacity < 6){
            safetyFlareCapacity = 15;
        }
    }

    public void diveUnderwater(){
        if ((underwaterTravel) && (currentDepth >= 0)){
            currentDepth = maxOperatingDepth;
        }
    }

    // OVERLOAD (diveUnderwater with argument to allow dive to a desired depth)
    public void diveUnderwater(int desiredDepth){
        if ((underwaterTravel) && (currentDepth > desiredDepth) && (desiredDepth >= maxOperatingDepth)){
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

    // GETTERS & SETTERS
    public int getSafetyFlareCapacity(){
        return this.safetyFlareCapacity;
    }

    public void setSafetyFlareCapacity(int safetyFlareCapacity){
        this.safetyFlareCapacity = safetyFlareCapacity;
    }

    public int getCurrentDepth(){
        return this.currentDepth;
    }

    public void setCurrentDepth(int desiredDepth){
        this.currentDepth = desiredDepth;
    }
}
