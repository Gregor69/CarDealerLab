import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Engine engine;

    @Before
    public void before() {
        engine = new Engine("petrol");
        car = new Car("Ford Focus", "Blue", 5000, engine);
    }

    @Test
    public void hasModel(){
        assertEquals("Ford Focus", car.getModel());
    }

    @Test
    public void hasColour(){
        assertEquals("Blue", car.getColour());
    }

    @Test
    public void hasPrice(){
        assertEquals(5000, car.getPrice());

    }

}
