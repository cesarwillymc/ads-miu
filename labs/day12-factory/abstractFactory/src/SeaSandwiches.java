import java.util.List;

public class SeaSandwiches implements Sandwiches{
    @Override
    public List<Food> createMenu() {
        return List.of(Food.getFood("Shrimp Sandwich"));
    }
    @Override
    public String toString() {
        return "Sea Sandwich";
    }
}
