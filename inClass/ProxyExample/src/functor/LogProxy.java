package functor;

public class LogProxy implements Thing {
    Thing t;
    Functor functor;
    public LogProxy(Thing t, Functor functor) {
        this.t = t;
        this.functor=functor;
    }

    @Override
    public void compute(String input) {
        functor.pre();
        t.compute(input);
        functor.post();
    }
}
