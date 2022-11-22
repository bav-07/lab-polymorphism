package vehicles;

import enumerations.FuelType;
import enumerations.TransportType;
import interfaces.ITakeOff;

public class Airborne extends Vehicle implements ITakeOff {

    private int currentFlightAltitude;
    private int maxFlightAltitude;
    private int cabinCrewSize;
    private int wingCondition;


    public Airborne(int numberOfWheels, int maximumOccupancy, double topSpeed, String make, String model, FuelType fuelType, TransportType transportType, int currentFlightAltitude, int maxFlightAltitude, int cabinCrewSize, int wingCondition){
        super(numberOfWheels, maximumOccupancy, topSpeed, make, model, fuelType, transportType);
        this.currentFlightAltitude = currentFlightAltitude;
        this.maxFlightAltitude = maxFlightAltitude;
        this.cabinCrewSize = cabinCrewSize;
        this.wingCondition = wingCondition;
    }

    // METHODS
    public String description(){
        String ignoreCaseTransportType = transportType.toString().toLowerCase();
        String description = String.format("This is the %s %s, with a maximum flight altitude of %dm, primarily used for %s.", make, model,maxFlightAltitude,ignoreCaseTransportType);
        return description;
    }

    public boolean isWingRepairRequired(){
        if (wingCondition <= 70) {
            return true;
        }
        return false;
    }

    public void repairWings(){
        if (isWingRepairRequired()) {
            wingCondition = 100;
        }
    }

    // OVERLOAD: repairs wings by a specified amount, rather than to full health. The specified amount will not cause the wingCondition to exceed 100 (full health). Using this overloaded method can ignore the maximum health of 70 that is required to do a full fix.
    public void repairWings(int repairAmount){
        wingCondition += repairAmount;
        if (wingCondition > 100){
            wingCondition = 100;
        }
    }

    // Methods from interface ITakeOff
    public String takeOff(){
        if (currentFlightAltitude == 0){
            currentFlightAltitude = maxFlightAltitude;
            return "Taking off";
        }
        return "Currently in flight";
    }

    public String land(){
        if (currentFlightAltitude > 0){
            currentFlightAltitude = 0;
            return "Landing procedure complete; flight ended";
        }
        return "Not in flight";
    }

    // GETTERS & SETTERS
    public int getWingCondition(){
        return this.wingCondition;
    }
    public void setWingCondition(int wingCondition){
        this.wingCondition = wingCondition;
    }

    public int getCurrentFlightAltitude(){
        return this.currentFlightAltitude;
    }
    public void setCurrentFlightAltitude(int currentFlightAltitude){
        if (currentFlightAltitude <= maxFlightAltitude) {
            this.currentFlightAltitude = currentFlightAltitude;
        }
        else {
            this.currentFlightAltitude = maxFlightAltitude;
        }
    }

    public int getMaxFlightAltitude(){
        return this.maxFlightAltitude;
    }
    public void setMaxFlightAltitude(int maxFlightAltitude){
        this.maxFlightAltitude = maxFlightAltitude;
    }
}
