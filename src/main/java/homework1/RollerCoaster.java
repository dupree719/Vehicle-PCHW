package homework1;

public class RollerCoaster implements Rideable{
    private double price;
    private float speed;
    private final double tax = 0.20;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public double getTax() {
        return tax;
    }

    public RollerCoaster(double price, float speed) {
        this.price = price;
        this.speed = speed;

    }

    public double rollerCoasterTotalBeforeTax() {

        return price;

    }

    public double calcRollerCoasterTax() {
        return price * tax;

    }

    public void rollerCoasterAfterTax() {
        System.out.println(rollerCoasterTotalBeforeTax() + calcRollerCoasterTax());
    }


    @Override
    public int milesPerHour() {
        return 0;
    }
}
