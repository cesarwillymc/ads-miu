import java.util.*;

public class Cabinet<T> implements Container<T> {
    private Container board;
    private Vector<Container> drivelist = new Vector<>();

    public void setBoard(Container b) {
        board = b;
    }

    public void addDrive(Container d) {
        drivelist.addElement(d);
    }

    public double netPrice() {
        return 6.00;
    }

    public double discountPrice() {
        return 3.00;
    }

    public double computePrice() {
        double tmp = netPrice();
        if (board != null)
            tmp += board.computePrice();
        for (Container drive : drivelist)
            tmp += drive.computePrice();
        return tmp;
    }

    private void doAll(Functor)
}
