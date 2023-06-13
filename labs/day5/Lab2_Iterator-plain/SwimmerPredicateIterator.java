import java.util.Iterator;
import java.util.function.Predicate;

public class SwimmerPredicateIterator implements Iterator<Swimmer> {
    private final SwimmersList swimmersList;
    private int currentPosition = 0;
    private final Predicate<Swimmer> swimmerPredicate;
    public SwimmerPredicateIterator(SwimmersList swimmersList, Predicate<Swimmer> swimmerPredicate) {
        this.swimmersList = swimmersList;
        this.swimmerPredicate = swimmerPredicate;
    }


    @Override
    public boolean hasNext() {
        return currentPosition < swimmersList.getVector().size();
    }

    @Override
    public Swimmer next() {
        Swimmer current;
        do {
            current =swimmersList.getVector().get(currentPosition);
            currentPosition++;
        }while (hasNext()&& !swimmerPredicate.test(current));
        return current;
    }
}
