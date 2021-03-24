import org.junit.Before;

public class HybridCarTest {

    HybridCar hybridCar;
    Engine engine;

    @Before
    public void before(){
        engine = new Engine("hybrid");
        hybridCar = new HybridCar("Black", 8000, engine);
    }

}
