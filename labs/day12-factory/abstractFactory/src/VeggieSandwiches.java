import java.util.List;

public class VeggieSandwiches implements Sandwiches {
    @Override
    public List<Food> createMenu() {
        return List.of(Food.getFood("Cucumber Sandwich"));
    }

    @Override
    public String toString() {
        return "Veggie Sandwich";
    }
}
