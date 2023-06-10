public class FourSpeed implements State {
    Car car;

    public FourSpeed(Car car) {
        this.car = car;
    }

    @Override
    public void checkSpeed() {
        if (car.getSpeed() > 55) {
            car.changeState(new FiveSpeed(car));
        } else if (car.getSpeed() <= 30) {
            car.changeState(new ThirdSpeed(car));
        }
    }
    @Override
    public String getShift() {
        return "4";
    }
}