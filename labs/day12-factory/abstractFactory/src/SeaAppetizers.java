import java.util.List;

public class SeaAppetizers implements Appetizers {
    @Override
    public List<Food> createMenu() {
        return List.of(Food.getFood("Shrimp Spice"));
    }
    @Override
    public String toString() {
        return "Sea Appetizer";
    }
}
