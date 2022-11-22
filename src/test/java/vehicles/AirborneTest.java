package vehicles;

import enumerations.FuelType;
import enumerations.TransportType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AirborneTest {

    private Airborne boeing747;

    @BeforeEach
    public void setUp(){
        boeing747 = new Airborne(18,
                400,
                583,
                "Boeing",
                "747",
                FuelType.PETROL,
                TransportType.TRAVEL,
                0,
                11000,
                3,
                50);
    }

    @Test
    public void canProvideDescription(){
        assertThat(boeing747.description()).isEqualTo("This is the Boeing 747, with a maximum flight altitude of 11000m, primarily used for travel.");
    }

    @Test
    public void canCheckIfWingRepairIsRequired(){
        assertThat(boeing747.isWingRepairRequired()).isEqualTo(true);
        boeing747.setWingCondition(100);
        assertThat(boeing747.isWingRepairRequired()).isEqualTo(false);
    }

    @Test
    public void canRepairWingsAndGetWingCondition(){
        boeing747.repairWings();
        assertThat(boeing747.isWingRepairRequired()).isEqualTo(false);
        assertThat(boeing747.getWingCondition()).isEqualTo(100);
    }

    @Test
    public void canRepairWingsWithSpecifiedAmount(){
        boeing747.repairWings(40);
        assertThat(boeing747.getWingCondition()).isEqualTo(90);
        boeing747.repairWings(20);
        assertThat(boeing747.getWingCondition()).isEqualTo(100);
    }

    // Testing interface methods
    @Test
    public void canTakeOff(){
        assertThat(boeing747.takeOff()).isEqualTo("Taking off");
        assertThat(boeing747.getCurrentFlightAltitude()).isEqualTo(boeing747.getMaxFlightAltitude());
        assertThat(boeing747.takeOff()).isEqualTo("Currently in flight");
    }

    @Test
    public void canLand(){
        assertThat(boeing747.land()).isEqualTo("Not in flight");
        boeing747.setMaxFlightAltitude(12000);
        boeing747.setCurrentFlightAltitude(12000);
        assertThat(boeing747.land()).isEqualTo("Landing procedure complete; flight ended");
        assertThat(boeing747.getCurrentFlightAltitude()).isEqualTo(0);
    }

    // Testing setter method
    @Test
    public void canSetCurrentAndMaxFlightAltitude(){
        boeing747.setMaxFlightAltitude(12000);
        boeing747.setCurrentFlightAltitude(15000);
        assertThat(boeing747.getCurrentFlightAltitude()).isEqualTo(12000);
        boeing747.setMaxFlightAltitude(15000);
        boeing747.setCurrentFlightAltitude(15000);
        assertThat(boeing747.getCurrentFlightAltitude()).isEqualTo(15000);
    }

}
