public class ParkState implements State {

    Car car;

    public ParkState(Car car) {
        this.car = car;
    }

    @Override
    public void checkSpeed() {
        if(car.getSpeed()>0){
            car.changeState(new OneSpeed(car));
        }
    }
    @Override
    public String getShift() {
        return "Park";
    }
}
