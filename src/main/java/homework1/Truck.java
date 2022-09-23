package homework1;

public class Truck extends Vehicle{
    public Truck(String name, double price, int qty, float speed, Engine engine) {
        super(name, price, qty, speed, engine);
    }

    //    public Truck(String name, double price, int qty, float speed) {
//        super(name, price, qty, speed);
//    }

    @Override
    public void totalAfterTax(Vehicle truck) {
        System.out.println(totalBeforeTax(truck) + calcTax(truck));

    }

}
