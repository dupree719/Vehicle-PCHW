package homework1;

public class Main {

    public static void main(String[] args) {

        //Vehicle objects
        Engine engine = new Engine(4);
        Car car = new Car("Honda",10000, 1, 60.0f, engine);
        Bike bike = new Bike("Mountain Bike", 500, 1, 10.0f);
        Truck truck = new Truck ("Ram", 50000, 1, 50.0f, engine);
        Horse horse = new Horse ("Diamondback", 5000, 1, 20.0f);


        //Rideable objects
        //Rollercoaster cost 10 bucks to ride, 20% tax on top of that
        RollerCoaster rollerCoaster = new RollerCoaster(10.0, 5.0f);

        //Call rollercoaster price after tax method on rollercoaster
        rollerCoaster.rollerCoasterAfterTax();



        //Array of vehicles
        Vehicle [] vehicles = {car, bike, truck, horse};
        for(Vehicle x : vehicles){
            x.totalBeforeTax(vehicles[3]);
            x.totalAfterTax(vehicles[3]);
        }

        //Calling method from VehicleApp class to print the names of vehicles + their original price (before tax)
        VehicleApp.printVehicleNamesAndPrices(vehicles);



        Rideable [] rideables = {rollerCoaster, bike, horse};

        VehicleApp.getSpeedOfRideableObjects(rideables);





    }
}
