package quiz;

import java.util.Iterator;
import java.util.function.Predicate;

public interface MyVectorCollection<T> {
    Iterator<T> iterator(Predicate<T> predicate);
}
