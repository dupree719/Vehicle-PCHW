package homework1;

public abstract class Vehicle extends Product {
    private double price;
    private int qty;
    private float speed;

    private Engine engine;
    private final double tax = 0.15;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public double getTax() {
        return tax;
    }

    public Vehicle(String name, double price, int qty, float speed) {
        super(name);
        this.price = price;
        this.qty = qty;
        this.speed = speed;



    }
    public Vehicle(String name, double price, int qty, float speed, Engine engine) {
        super(name);
        this.price = price;
        this.qty = qty;
        this.speed = speed;
        this.engine = engine;
    }


    public double totalBeforeTax(Vehicle vehicle) {

        return price * qty;

    }

    public double calcTax(Vehicle vehicle) {
        return price * tax;

    }


    public abstract void totalAfterTax(Vehicle vehicle);
}
