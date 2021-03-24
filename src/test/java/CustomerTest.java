import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer(10000);
    }

    @Test
    public void getMoney(){
        assertEquals(10000, customer.getMoney());
    }
}
