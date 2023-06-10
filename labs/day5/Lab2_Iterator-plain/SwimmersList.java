import java.util.*;
import java.util.function.Predicate;

public class SwimmersList implements Collection<Swimmer> {
    private Vector<Swimmer> slist = new Vector<>();

    public void addSwimmer(Swimmer swimmer) {
        slist.addElement(swimmer);
    }

    public Vector<Swimmer> getVector() {
        return slist;
    }

    @Override
    public Iterator<Swimmer> createIterator() {
        return new SwimmerIterator(this, false);
    }

    @Override
    public Iterator<Swimmer> createReverseIterator() {
        return new SwimmerIterator(this, true);
    }

    @Override
    public Iterator<Swimmer> createSelectiveIterator(Predicate<Swimmer> predicate) {
        return new SwimmerPredicateIterator(this, predicate);
    }
}
