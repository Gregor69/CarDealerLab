public abstract class Vehicle {

    private String colour;
    private Engine engine;
    private int price;

    public Vehicle(String colour, int price, Engine engine) {
        this.colour = colour;
        this.price = price;
        this.engine = engine;
    }

    public String getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }
}
