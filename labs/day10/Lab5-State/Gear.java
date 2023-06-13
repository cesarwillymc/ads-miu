public interface Gear {
    void changeSpeed(int speed);
    Gear nextGear();
    Gear previousGear();
    String getShift();
}
