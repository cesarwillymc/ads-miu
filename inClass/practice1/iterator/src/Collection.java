import java.util.function.Predicate;

public interface Collection<T> {
    Iterator<T> createIterator();

    Iterator<T> createReverseIterator();

    Iterator<T> createSelectiveIterator(Predicate<T> predicate);
}/*

class clase implements  Collection<String>{

    @Override
    public Iterator<String> createIterator() {
        return ;
    }

    @Override
    public Iterator<String> createReverseIterator() {
        return null;
    }

    @Override
    public Iterator<String> createSelectiveIterator(Predicate<String> predicate) {
        return predicate.test(s);
    }

    public static void main(String[] args) {
        var data=new clase();
        data.createSelectiveIterator(s -> s.length()<5);
    }
}
*/