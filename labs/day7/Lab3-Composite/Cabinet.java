import java.util.*;

public class Cabinet implements Container<Double,Container> {
    private Container<Double,Container> board;
    private Vector<Container> drivelist = new Vector<>();

    public void setBoard(Container<Double,Container> b) {
        board = b;
    }

    public void addDrive(Container<Double,Container> d) {
        drivelist.addElement(d);
    }


    @Override
    public void doAll(Functor doSomething) {
        doSomething.compute(this);
        if (board!=null)
          board.doAll(doSomething);
        for (var a : drivelist){
            a.doAll(doSomething);
        }
    }

    public Double netPrice() {
        return 6.00;
    }

    public Double discountPrice() {
        return 3.00;
    }




}
