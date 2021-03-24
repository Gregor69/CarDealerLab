import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;

    @Before
    public void Dealership(){
        dealership = new Dealership(100000);

    }

    @Test
    public void getTill(){
        assertEquals(100000, dealership.getTill());
    }
}
