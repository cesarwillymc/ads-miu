import java.util.List;

public class VeggieAppetizers implements Appetizers {
    @Override
    public List<Food> createMenu() {
        return List.of(Food.getFood("Solterito Peruvian"));
    }
    @Override
    public String toString() {
        return "Sea Appetizers";
    }
}
