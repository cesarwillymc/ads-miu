import java.util.Iterator;
import java.util.function.Predicate;

public interface Collection<T> {
    Iterator<T> createIterator();

    Iterator<T> createReverseIterator();

    Iterator<T> createSelectiveIterator(Predicate<T> predicate);
}
