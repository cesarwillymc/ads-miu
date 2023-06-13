public class ParkState implements Gear {

    Transmition car;

    public ParkState(Transmition car) {
        this.car = car;
    }

    @Override
    public void changeSpeed(int speed) {
        if(speed>0){
            car.nextGear();
        }
    }

    @Override
    public Gear nextGear() {
        return new OneSpeed(car);
    }

    @Override
    public Gear previousGear() {
        return null;
    }

    @Override
    public String getShift() {
        return "Park";
    }
}
