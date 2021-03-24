import java.util.ArrayList;

public class Dealership {

    private int till;
    private ArrayList<Vehicle> vehicles;

    public Dealership(int till){
        this.till = till;
        this.vehicles = new ArrayList<Vehicle>();
    }

    public int getTill() {
        return till;
    }
}
