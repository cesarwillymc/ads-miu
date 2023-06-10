public class Bus implements Container {
    public double netPrice() {
        return 5.00;
    }

    public double discountPrice() {
        return 1.00;
    }

    public double computePrice() {
        return netPrice();
    }
}
