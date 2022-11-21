package vehicles;

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
                11000,
                3,
                50);
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

}
