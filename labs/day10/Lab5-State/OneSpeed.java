public class OneSpeed implements Gear {
    Transmition car;

    public OneSpeed(Transmition car) {
        this.car = car;
    }


    @Override
    public void changeSpeed(int speed) {
        if (speed> 5) {
            car.nextGear();
        } else if (speed <= 0) {
            car.previousGear();
        }
    }

    @Override
    public Gear nextGear() {
        return new TwoSpeed(car);
    }

    @Override
    public Gear previousGear() {
        return new ParkState(car);
    }

    @Override
    public String getShift() {
        return "1";
    }
}
