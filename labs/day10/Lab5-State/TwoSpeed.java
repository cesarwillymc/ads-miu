public class TwoSpeed implements Gear {
    Transmition car;

    public TwoSpeed(Transmition car) {
        this.car = car;
    }



    @Override
    public void changeSpeed(int speed) {
        if (speed > 10) {
            car.nextGear();
        } else if (speed <= 5) {
            car.previousGear();
        }
    }

    @Override
    public Gear nextGear() {
        return new ThirdSpeed(car);
    }

    @Override
    public Gear previousGear() {
        return new OneSpeed(car);
    }

    @Override
    public String getShift() {
        return "2";
    }

}