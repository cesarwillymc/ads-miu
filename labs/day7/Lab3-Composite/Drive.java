public class Drive implements Container<Double,Container> {
    @Override
    public void doAll(Functor doSomething) {
        doSomething.compute(this);
    }

    public Double netPrice() {
        return 10.00;
    }

    public Double discountPrice() {
        return 4.00;
    }

    public double computePrice() {
        return discountPrice();
    }
}

