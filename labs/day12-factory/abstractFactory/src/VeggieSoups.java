import java.util.List;

public class VeggieSoups implements Soups{
    @Override
    public List<Food> createMenu() {
        return List.of(Food.getFood("Quinua Soup"));
    }
    @Override
    public String toString() {
        return "Veggie Soups";
    }
}
