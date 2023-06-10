public class TwoSpeed implements State {
    Car car;

    public TwoSpeed(Car car) {
        this.car = car;
    }

    @Override
    public void checkSpeed() {
        if (car.getSpeed() > 10) {
            car.changeState(new ThirdSpeed(car));
        } else if (car.getSpeed() <= 5) {
            car.changeState(new OneSpeed(car));
        }
    }
    @Override
    public String getShift() {
        return "2";
    }

}