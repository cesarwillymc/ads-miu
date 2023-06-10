package quiz.iterator;

import quiz.MyVectorClass;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;


public class SelectiveIterator<T> implements Iterator<T> {
    private final Iterator<T> myVectorClass;
    private final Predicate<T> predicate;
    private T currentPosition;

    public SelectiveIterator(MyVectorClass<T> myVectorClass, Predicate<T> predicate) {
        this.myVectorClass = myVectorClass.iterator();
        this.predicate = predicate;
        findNextItem();
    }

    @Override
    public boolean hasNext() {
        return currentPosition != null;
    }

    @Override
    public T next() {
        if (currentPosition == null) {
            throw new NoSuchElementException("No more elements");
        }
        T current = currentPosition;
        findNextItem();
        return current;
    }

    private void findNextItem() {
        while (myVectorClass.hasNext()) {
            T element = myVectorClass.next();
            if (predicate.test(element)) {
                currentPosition = element;
                return;
            }
        }
        currentPosition = null;
    }
}
