import java.util.*;

public class Board implements Container {
    private Container bus;
    private Vector<Container> cardlist = new Vector<>();

    public void setBus(Container b) {
        bus = b;
    }

    public void addCard(Container d) {
        cardlist.addElement(d);
    }

    public double netPrice() {
        return 26.00;
    }

    public double discountPrice() {
        return 6.00;
    }

    public double computePrice() {
        double tmp = discountPrice();
        if (bus != null)
            tmp += bus.computePrice();
        for (Container card : cardlist)
            tmp += card.computePrice();
        return tmp;
    }
}
