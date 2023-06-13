public class ThirdSpeed  implements Gear {
    Transmition car;

    public ThirdSpeed(Transmition car) {
        this.car = car;
    }


    @Override
    public void changeSpeed(int speed) {
        if (speed > 30) {
            car.nextGear();
        } else if (speed <= 10) {
            car.previousGear();
        }
    }

    @Override
    public Gear nextGear() {
        return new FourSpeed(car);
    }

    @Override
    public Gear previousGear() {
        return new TwoSpeed(car);
    }

    @Override
    public String getShift() {
        return "3";
    }
}