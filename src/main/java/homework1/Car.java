package homework1;

public class Car extends Vehicle{
    public Car(String name, double price, int qty, float speed, Engine engine) {
        super(name, price, qty, speed, engine);
    }

    //    public Car(String name, double price, int qty, float speed) {
//        super(name, price, qty, speed);
//    }

    @Override
    public void totalAfterTax(Vehicle car) {
        System.out.println(totalBeforeTax(car) + calcTax(car));
    }


}
