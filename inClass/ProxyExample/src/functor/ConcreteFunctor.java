package functor;

public class ConcreteFunctor implements Functor {
    @Override
    public void pre() {
        System.out.println("before ");
    }

    @Override
    public void post() {
        System.out.println("after ");
    }

}
