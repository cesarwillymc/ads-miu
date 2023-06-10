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
    public Swimmer getNext() {
        Swimmer current;
        do {
            current =swimmersList.getVector().get(currentPosition);
            currentPosition++;
        }while (hasMore()&& !swimmerPredicate.test(current));
        return current;
    }

    @Override
    public Boolean hasMore() {
        return currentPosition < swimmersList.getVector().size();
    }
}
