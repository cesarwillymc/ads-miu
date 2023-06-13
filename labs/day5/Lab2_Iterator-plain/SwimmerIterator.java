import java.util.Iterator;

public class SwimmerIterator implements Iterator<Swimmer> {
    private final SwimmersList swimmersList;
    private int currentPosition;
    private final Boolean isReverse;

    public SwimmerIterator(SwimmersList swimmersList, Boolean isReverse) {
        this.swimmersList = swimmersList;
        this.isReverse = isReverse;
        if (isReverse) {
            currentPosition = swimmersList.getVector().size() - 1;
        } else {
            currentPosition = 0;
        }
    }

    @Override
    public boolean hasNext() {
        if (isReverse) {
            return currentPosition >= 0;
        }
        return currentPosition < swimmersList.getVector().size();
    }

    @Override
    public Swimmer next() {
        if (hasNext()) {
            var current = swimmersList.getVector().get(currentPosition);
            if (isReverse){
                currentPosition--;
            }else{
                currentPosition++;
            }
            return current;
        }
        throw new IllegalArgumentException("Dont have more items");
    }
}
