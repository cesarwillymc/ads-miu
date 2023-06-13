package generic;

public class ConcreteFunctor<T> implements Functor<T> {
    @Override
    public void pre(T input) {
        System.out.println("before " + input);
    }

    @Override
    public void post(T input) {
        System.out.println("after " + input);
    }

}
