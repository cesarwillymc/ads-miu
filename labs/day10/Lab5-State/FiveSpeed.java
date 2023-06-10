public class FiveSpeed implements State {
    Car car;

    public FiveSpeed(Car car) {
        this.car = car;
    }

    @Override
    public void checkSpeed() {
        if (car.getSpeed() < 55) {
            car.changeState(new FourSpeed(car));
        }
    }
    @Override
    public String getShift() {
        return "5";
    }
}