import java.util.List;

public class SeaSoups implements Soups{
    @Override
    public List<Food> createMenu() {
        return List.of(Food.getFood("Parihuela Peruvian Soup"));
    }
    @Override
    public String toString() {
        return "Sea Soups";
    }
}
