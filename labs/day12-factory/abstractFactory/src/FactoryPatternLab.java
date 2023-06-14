
public class FactoryPatternLab {
    public static void main(String[] args) {
        RestaurantFactory seaRestaurant = getSeaRestaurant(); // P2I
        System.out.println("\n----Sea Restaurant---");
        Soups soup = seaRestaurant.createSoups(); // POLY
        Sandwiches sandwich = seaRestaurant.createSandwiches(); // POLY
        Appetizers appetizers = seaRestaurant.createAppetizers(); // POLY
        System.out.println(soup);
        System.out.println("\t"+soup.createMenu());  // POLY
        System.out.println(sandwich);
        System.out.println("\t"+sandwich.createMenu());  // POLY
        System.out.println(appetizers);
        System.out.println("\t"+appetizers.createMenu());  // POLY

        System.out.println("\n----Veggie Restaurant---");
        RestaurantFactory veggieRestaurant = getVeggieRestaurant(); // P2I
        soup = veggieRestaurant.createSoups(); // POLY
        sandwich = veggieRestaurant.createSandwiches(); // POLY
        appetizers = veggieRestaurant.createAppetizers(); // POLY
        System.out.println(soup);
        System.out.println("\t"+soup.createMenu());  // POLY
        System.out.println(sandwich);
        System.out.println("\t"+sandwich.createMenu());  // POLY
        System.out.println(appetizers);
        System.out.println("\t"+appetizers.createMenu());  // POLY
    }
    private static RestaurantFactory getSeaRestaurant() { // Simple Factory
        return new SeaRestaurant();  // P2C
    }

    private static RestaurantFactory getVeggieRestaurant() { // Simple Factory
        return new VeggieRestaurant(); // P2C
    }
}