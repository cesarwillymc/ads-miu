public class Car {
    private State currentState;
    private int speed;

    public void changeState(State speed) {
        currentState = speed;
        currentState.checkSpeed();
    }
    public void setSpeed(int speed) {
        this.speed = speed;
        currentState.checkSpeed();
    }

    public Car() {
        this.currentState = new ParkState(this);
    }

    public State getCurrentState() {
        return currentState;
    }

    public int getSpeed() {
        return speed;
    }
}
    
