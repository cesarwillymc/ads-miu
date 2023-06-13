import java.util.*;

public class Board implements Container<Double,Container> {
    private Container<Double,Container> bus;
    private Vector<Container> cardlist = new Vector<>();

    public void setBus(Container<Double,Container> b) {
        bus = b;
    }

    public void addCard(Container<Double,Container> d) {
        cardlist.addElement(d);
    }

    @Override
    public void doAll(Functor doSomething) {
        doSomething.compute(this);
        if (bus!=null)
             bus.doAll(doSomething);
        for (var a: cardlist){
            a.doAll(doSomething);
        }
    }

    public Double netPrice() {
        return 26.00;
    }

    public Double discountPrice() {
        return 6.00;
    }


}
