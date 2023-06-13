package generic;

public interface Functor<T> {

    void pre(T input);

    void post(T input);

}
