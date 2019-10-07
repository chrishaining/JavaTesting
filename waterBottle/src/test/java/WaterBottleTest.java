import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {


    private WaterBottle bottle;

    @Before
    public void before() {bottle = new WaterBottle(100);}

    //test that the starting volume is 100
    @Test
    public void volumeStartsAt100() {
        assertEquals(100, bottle.getVolume());

    }

    //test that the drink function subtracts 10 from the volume. the way to test is to get the volume after the drink method has been called
    @Test
    public void drinkReducesVolumeBy10() {
        bottle.drink();
        assertEquals(90, bottle.getVolume());
    }


    //test that the empty function sets volume to zero. again, to test this we will get the volume after the empty method has been called
    @Test
    public void canEmptyBottle() {
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    //test that the fill function sets volume to 100. to test this we will have to reduce the volume (either by using drink or empty), then call the fill method, then  get the volume
    @Test
    public void canFillBottle() {
        bottle.empty();
        bottle.fill();
        assertEquals(100, bottle.getVolume());
    }
}
