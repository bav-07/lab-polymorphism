package vehicles;

public class Airborne extends Vehicle{

    private int flightAltitude;
    private int cabinCrewSize;
    private int wingCondition;


    public Airborne(int numberOfWheels, int maximumOccupancy, double topSpeed, String make, String model, FuelType fuelType, TransportType transportType, int flightAltitude, int cabinCrewSize, int wingCondition){
        super(numberOfWheels, maximumOccupancy, topSpeed, make, model, fuelType, transportType);
        this.flightAltitude = flightAltitude;
        this.cabinCrewSize = cabinCrewSize;
        this.wingCondition = wingCondition;
    }

    // METHODS
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

    // GETTER & SETTER
    public int getWingCondition(){
        return this.wingCondition;
    }
    public void setWingCondition(int wingCondition){
        this.wingCondition = wingCondition;
    }

}
