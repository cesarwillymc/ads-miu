public class Bus implements Container<Double,Container> {


    @Override
    public void doAll(Functor doSomething) {
        doSomething.compute(this);
    }

    public Double netPrice() {
        return 5.00;
    }

    public Double discountPrice() {
        return 1.00;
    }

    public double computePrice() {
        return netPrice();
    }
}
