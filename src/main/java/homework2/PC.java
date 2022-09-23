package homework2;

public class PC {

    private Monitor monitor;
    private Motherboard motherboard;
    private Case myCase;

    public PC(Monitor monitor, Motherboard motherboard, Case myCase) {
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.myCase = myCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Case getMyCase() {
        return myCase;
    }

    public void setMyCase(Case myCase) {
        this.myCase = myCase;
    }


    private void drawLogo(){
        monitor.drawPixel(3,4,"blue");

    }
    public void description(){
        System.out.println("Welcome to worst buy below is the description of the pc on sale today: \n\n" + monitor + motherboard + myCase);

    }
    @Override
    public String toString() {
        return "PC{" +
                "Monitor type:" + monitor +
                ", Motherboard type:" + motherboard +
                ", PC Case:" + myCase +
                '}';
    }
    public void powerUp(){
        myCase.pressPowerButton();
        drawLogo();
        motherboard.loadProgram("FL Studio");
    }

}
