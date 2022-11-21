package exhibitions;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Exhibition {

    private String name;
    private ArrayList<Vehicle> vehicles;

    public Exhibition(String name){
        this.name = name;
        this.vehicles = new ArrayList<>();
    }

    // METHODS

    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public int countVehicles(){
        return this.vehicles.size();
    }

}
