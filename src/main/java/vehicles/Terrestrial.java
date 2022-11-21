package vehicles;

public class Terrestrial extends Vehicle{

    private GroundVehicleType groundVehicleType;
    private boolean roadLegal;
    private double tyreTreadDepth;

    public Terrestrial(int numberOfWheels, int maximumOccupancy, double topSpeed, String make, String model, FuelType fuelType, TransportType transportType, GroundVehicleType groundVehicleType, double tyreTreadDepth){
        super(numberOfWheels, maximumOccupancy, topSpeed, make, model, fuelType, transportType);
        this.groundVehicleType = groundVehicleType;
        this.tyreTreadDepth = tyreTreadDepth;
    }

    public String checkRoadLegality(){
        if (((groundVehicleType.equals(GroundVehicleType.CAR)) || (groundVehicleType.equals(GroundVehicleType.VAN)))) {
            if (tyreTreadDepth >= 1.6){
                roadLegal = true;
                return "Vehicle is road legal";
            }
            return "Vehicle is not road legal";
        }
        if (tyreTreadDepth >= 1){
            roadLegal = true;
            return "Vehicle is road legal";
        }
        return "Vehicle is not road legal";
    }

}
