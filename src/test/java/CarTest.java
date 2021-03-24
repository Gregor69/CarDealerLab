import org.junit.Before;
import org.junit.Test;

public class CarTest {

    Car car;
    Engine engine;

    @Before
    public void before(){
        engine = new Engine("petrol");
        car = new Car("Blue", 5000, engine);
    }

    @Test
    public void
}
