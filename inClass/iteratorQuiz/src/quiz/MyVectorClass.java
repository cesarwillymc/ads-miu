package quiz;

import quiz.functor.Functor;
import quiz.iterator.SelectiveIterator;

import java.util.Iterator;
import java.util.Vector;
import java.util.function.Predicate;

public class MyVectorClass<T> extends Vector<T> implements MyVectorCollection<T> {
    void doAll(Functor<T> tasks) {
        for (T a : this) {
            tasks.compute(a);
        }
    }

    void doAll(Functor<T> tasks, Predicate<T> predicate) {
        for (T a : this) {
            if (predicate.test(a))
                tasks.compute(a);
        }
    }

    @Override
    public Iterator<T> iterator(Predicate<T> predicate) {
        return new SelectiveIterator<T>(this, predicate);
    }
}
