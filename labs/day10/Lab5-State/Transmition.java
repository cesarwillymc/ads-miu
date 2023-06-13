public class Transmition {
    private Gear currentState;
    private int speed;
    public Transmition() {
        this.currentState = new ParkState(this);
    }

    void changeSpeed(int speed){
        this.speed = speed;
        currentState.changeSpeed(speed);
    }
    public void nextGear() {
        this.currentState =currentState.nextGear();
        currentState.changeSpeed(speed);
    }


    public void previousGear() {
        this.currentState =currentState.previousGear();
        currentState.changeSpeed(speed);
    }

    public Gear getCurrentState() {
        return currentState;
    }
}
