public class ThirdSpeed  implements State {
    Car car;

    public ThirdSpeed(Car car) {
        this.car = car;
    }

    @Override
    public void checkSpeed() {
        if (car.getSpeed() > 30) {
            car.changeState(new FourSpeed(car));
        } else if (car.getSpeed() <= 10) {
            car.changeState(new TwoSpeed(car));
        }
    }
    @Override
    public String getShift() {
        return "3";
    }
}