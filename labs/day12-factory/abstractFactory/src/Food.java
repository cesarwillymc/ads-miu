import java.util.List;

public class Food {
    List<String> getIngredients;
    String description;
    List<String> photosUrl;
    Double price;
    String name;

    protected Food(List<String> getIngredients, String description, List<String> photosUrl, Double price) {
        this.getIngredients = getIngredients;
        this.description = description;
        this.photosUrl = photosUrl;
        this.price = price;
    }

    protected Food(String name) {
        this.name = name;
        this.price = 0.0;
    }

    static Food getFood(String name){
        return new Food(name);
    }

    @Override
    public String toString() {
        return String.format("Food: %s, price: %s", name,price);
    }
}
