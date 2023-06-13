package functor;

/**
 * Hello: A
 * before
 * Hello: A
 * after
 * Hello: B
 * before
 * Hello: B
 * after
 */
public class ProxyDemoGeneric {
    public static void main(String[] args) {

        Functor myFunctor = new ConcreteFunctor();

        Thing t = new aThing("A");

        t.compute("Hello");

        t = new LogProxy(t, myFunctor);
        t.compute("Hello");

        t = new bThing("B");
        t.compute("Hello");

        t = new LogProxy(t, myFunctor);
        t.compute("Hello");


    }
}
