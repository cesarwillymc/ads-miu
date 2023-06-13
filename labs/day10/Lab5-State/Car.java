public class Car {

    private Transmition transmition;

    public Car(Transmition transmition) {
        this.transmition = transmition;
    }

    public void changeSpeed(int speed) {
        transmition.changeSpeed(speed);
    }

    public Transmition getTransmition() {
        return transmition;
    }

}
    
