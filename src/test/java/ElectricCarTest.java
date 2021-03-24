import org.junit.Before;

public class ElectricCarTest {

    ElectricCar electricCar;
    Engine engine;

    @Before
    public void before(){
        engine = new Engine("hybird");
        electricCar = new ElectricCar("White", 10000, engine);
    }
}
