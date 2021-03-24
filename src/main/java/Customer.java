import java.util.ArrayList;

public class Customer {

    private int money;
    private ArrayList<Vehicle> vehicles;

    public Customer(int money){
        this.money = money;
        this.vehicles = new ArrayList<Vehicle>();

    }

    public int getMoney() {
        return money;
    }
}
