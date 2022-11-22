package exhibitions;

import interfaces.ITakeOff;

import java.util.ArrayList;

public class Airshow {

    private String name;
    private ArrayList<ITakeOff> manyAircraft;

    public Airshow(String name){
        this.name = name;
        this.manyAircraft = new ArrayList<>();
    }

    // METHODS

    public void addAircraft(ITakeOff aircraft){
        this.manyAircraft.add(aircraft);
    }

    public int countVehicles(){
        return this.manyAircraft.size();
    }

}