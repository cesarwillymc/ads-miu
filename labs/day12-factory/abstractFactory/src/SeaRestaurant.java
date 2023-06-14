public class SeaRestaurant implements RestaurantFactory {
    @Override
    public Sandwiches createSandwiches() {
        return new SeaSandwiches();
    }

    @Override
    public Soups createSoups() {
        return new SeaSoups();
    }

    @Override
    public Appetizers createAppetizers() {
        return new SeaAppetizers();
    }
}
