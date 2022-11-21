package vehicles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WatercraftTest {

    private Watercraft princessX80;

    @BeforeEach
    public void setUp(){
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
    }

    @Test
    public void canReplenishSafetyFlareCapacity(){
        princessX80.setSafetyFlareCapacity(1);
        princessX80.replenishSafetyFlareCapacity();
        assertThat(princessX80.getSafetyFlareCapacity()).isEqualTo(15);
    }

}
