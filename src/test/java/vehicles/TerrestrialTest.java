package vehicles;

import enumerations.FuelType;
import enumerations.GroundVehicleType;
import enumerations.TransportType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TerrestrialTest {

    private Terrestrial nissanSilvia;
    private Terrestrial fordTransit;
    private Terrestrial mackPinnacle;
    private Terrestrial ducati750GT;

    @BeforeEach
    public void setUp(){
        nissanSilvia = new Terrestrial(4,
                5,
                150,
                "Nissan",
                "Silvia",
                FuelType.PETROL,
                TransportType.TRAVEL,
                GroundVehicleType.CAR,
                2);
        fordTransit = new Terrestrial(4,
                3,
                100,
                "Ford",
                "Transit",
                FuelType.DIESEL,
                TransportType.TRAVEL,
                GroundVehicleType.VAN,
                1);
        mackPinnacle = new Terrestrial(10,
                3,
                90,
                "Mack",
                "Pinnacle",
                FuelType.DIESEL,
                TransportType.CARGO,
                GroundVehicleType.HEAVY_VEHICLE,
                1);
        ducati750GT = new Terrestrial(2,
                1, 125,
                "Ducati",
                "750GT",
                FuelType.PETROL,
                TransportType.TRAVEL,
                GroundVehicleType.MOTORCYCLE,
                0.6);
    }

    @Test
    public void canProvideDescription(){
        assertThat(nissanSilvia.description()).isEqualTo("This is the Nissan Silvia, a car running on petrol, with a top speed of 150mph.");
        assertThat(mackPinnacle.description()).isEqualTo("This is the Mack Pinnacle, a heavy vehicle running on diesel, with a top speed of 90mph.");
        assertThat(fordTransit.description()).isEqualTo("This is the Ford Transit, a van running on diesel, with a top speed of 100mph.");
        assertThat(ducati750GT.description()).isEqualTo("This is the Ducati 750GT, a motorcycle running on petrol, with a top speed of 125mph.");
    }

    @Test
    public void canCheckRoadLegality(){
        assertThat(nissanSilvia.checkRoadLegality()).isEqualTo("Vehicle is road legal");
        assertThat(fordTransit.checkRoadLegality()).isEqualTo("Vehicle is not road legal");
        assertThat(mackPinnacle.checkRoadLegality()).isEqualTo("Vehicle is road legal");
        assertThat(ducati750GT.checkRoadLegality()).isEqualTo("Vehicle is not road legal");

    }

}
