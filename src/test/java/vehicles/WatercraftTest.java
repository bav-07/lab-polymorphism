package vehicles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WatercraftTest {

    private Watercraft princessX80;
    private Watercraft w_subMK3;

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
                15,
                0,
                0);
        w_subMK3 = new Watercraft(0,
                50,
                10,
                "W-Submarine",
                "MK3",
                FuelType.HYBRID,
                TransportType. TRAVEL,
                true,
                0,
                15,
                -60,
                0);
    }

    @Test
    public void canReplenishSafetyFlareCapacity(){
        princessX80.setSafetyFlareCapacity(1);
        princessX80.replenishSafetyFlareCapacity();
        assertThat(princessX80.getSafetyFlareCapacity()).isEqualTo(15);
    }

    @Test
    public void canDiveUnderwater(){
        w_subMK3.diveUnderwater();
        assertThat(w_subMK3.getCurrentDepth()).isEqualTo(-60);
    }

    @Test
    public void depthDoesNotChangeDuringDiveIfInputDepthIsLessDeepThanCurrentDepth(){
        w_subMK3.setCurrentDepth(-60);
        w_subMK3.diveUnderwater(-40);
        assertThat(w_subMK3.getCurrentDepth()).isEqualTo(-60);
    }

    @Test
    public void canRiseToSurface(){
        w_subMK3.setCurrentDepth(-60);
        w_subMK3.riseTowardsSurface();
        assertThat(w_subMK3.getCurrentDepth()).isEqualTo(0);
    }

    @Test
    public void depthDoesNotChangeDuringRiseIfInputDepthIsMoreDeepThanCurrentDepth(){
        w_subMK3.setCurrentDepth(-40);
        w_subMK3.riseTowardsSurface(-50);
        assertThat(w_subMK3.getCurrentDepth()).isEqualTo(-40);
    }

}
