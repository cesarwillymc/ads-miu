public class FourSpeed implements Gear {
    Transmition car;

    public FourSpeed(Transmition car) {
        this.car = car;
    }
    @Override
    public void changeSpeed(int speed) {
        if (speed > 55) {
            car.nextGear();
        } else if (speed<= 30) {
            car.previousGear();
        }
    }

    @Override
    public Gear nextGear() {
        return new FiveSpeed(car);
    }

    @Override
    public Gear previousGear() {
        return new ThirdSpeed(car);
    }

    @Override
    public String getShift() {
        return "4";
    }
}