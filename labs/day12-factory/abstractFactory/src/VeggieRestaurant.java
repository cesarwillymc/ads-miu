public class VeggieRestaurant implements RestaurantFactory {
    @Override
    public Sandwiches createSandwiches() {
        return new VeggieSandwiches();
    }

    @Override
    public Soups createSoups() {
        return new VeggieSoups();
    }

    @Override
    public Appetizers createAppetizers() {
        return new VeggieAppetizers();
    }
}
