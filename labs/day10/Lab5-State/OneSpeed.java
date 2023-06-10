public class OneSpeed implements State {
    Car car;

    public OneSpeed(Car car) {
        this.car = car;
    }

    @Override
    public void checkSpeed() {
        if (car.getSpeed() > 5) {
            car.changeState(new TwoSpeed(car));
        } else if (car.getSpeed() <= 0) {
            car.changeState(new ParkState(car));
        }
    }

    @Override
    public String getShift() {
        return "1";
    }
}
