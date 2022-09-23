package homework2;

public class Main {

    public static void main(String[] args) {

        Dimensions myDem = new Dimensions(7,1,9);
        Resolution myResolution = new Resolution(3,5);
        Monitor myMonitor = new Monitor(myResolution);
        Motherboard myMotherboard = new Motherboard("TheSecondWorst", "TrashManufacturer", 6, 5, "Bios" );
        Case myCase = new Case("TheWorst", "TrashManufacturer", "Hydro-Powered", myDem);
        PC laptop = new PC(myMonitor, myMotherboard,myCase);

        laptop.description();
        laptop.powerUp();
    }



}
