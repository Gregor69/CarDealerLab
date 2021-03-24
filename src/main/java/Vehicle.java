public abstract class Vehicle {

    private String model;
    private String colour;
    private Engine engine;
    private int price;

    public Vehicle(String model, String colour, int price, Engine engine) {
        this.model = model;
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

    public String getModel(){
        return model;
    };
}
