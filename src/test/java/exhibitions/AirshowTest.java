package exhibitions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vehicles.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AirshowTest {

    private Airborne boeing747;
    private Airshow airshow;

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
                100);

        airshow = new Airshow("Aircraft Exhibition");
    }

    @Test
    public void canAddVehicles(){
        airshow.addAircraft(boeing747);
        assertThat(airshow.countVehicles()).isEqualTo(1);
        airshow.addAircraft(boeing747);
        assertThat(airshow.countVehicles()).isEqualTo(2);
    }

}
