package generic;

public class LogProxy<T> implements Thing <T>{
    Thing<T> t;
    Functor<T> functor;
    public LogProxy(Thing<T> t, Functor<T> functor) {
        this.t = t;
        this.functor=functor;
    }

    @Override
    public void compute(T input) {
        functor.pre(input);
        t.compute(input);
        functor.post(input);
    }
}
