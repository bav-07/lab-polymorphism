package exhibitions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vehicles.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ExhibitionTest {

    private Terrestrial nissanSilvia;
    private Airborne boeing747;
    private Watercraft princessX80;
    private Exhibition exhibition;

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
        boeing747 = new Airborne(18,
                400,
                583,
                "Boeing",
                "747",
                FuelType.PETROL,
                TransportType.TRAVEL,
                11000,
                3,
                100);
        princessX80 = new Watercraft(0,
                8,
                35,
                "Princess",
                "X80",
                FuelType.DIESEL,
                TransportType. TRAVEL,
                false,
                1,
                15);
        exhibition = new Exhibition("Vehicle Exhibition");
    }

    @Test
    public void canAddVehicles(){
        exhibition.addVehicle(nissanSilvia);
        assertThat(exhibition.countVehicles()).isEqualTo(1);
        exhibition.addVehicle(boeing747);
        assertThat(exhibition.countVehicles()).isEqualTo(2);
        exhibition.addVehicle(princessX80);
        assertThat(exhibition.countVehicles()).isEqualTo(3);
    }

}
