package homework1;

public class Bike extends Vehicle implements Rideable{


    public Bike(String name, double price, int qty, float speed) {
        super(name, price, qty, speed);
    }

    @Override
    public void totalAfterTax(Vehicle bike) {
        System.out.println(totalBeforeTax(bike) + calcTax(bike));

    }


    @Override
    public int milesPerHour() {
        return 0;
    }

}
