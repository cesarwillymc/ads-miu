public class FiveSpeed implements Gear {
    Transmition car;
    public FiveSpeed(Transmition car) {
        this.car = car;
    }
    @Override
    public void changeSpeed(int speed) {
        if (speed < 55) {
            car.previousGear();
        }
    }

    @Override
    public Gear nextGear() {
        return null;
    }

    @Override
    public Gear previousGear() {
        return new FourSpeed(car);
    }

    @Override
    public String getShift() {
        return "5";
    }
}