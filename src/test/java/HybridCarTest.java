import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;
    Engine engine;

    @Before
    public void before(){
        engine = new Engine("hybrid");
        hybridCar = new HybridCar("Audi Etron", "Black", 8000, engine);
    }

    @Test
    public void hasModel(){
        assertEquals("Audi Etron", hybridCar.getModel());
    }

    @Test
    public void hasColour(){
        assertEquals("Black", hybridCar.getColour());
    }

    @Test
    public void hasPrice(){
        assertEquals(8000, hybridCar.getPrice());

    }

}
