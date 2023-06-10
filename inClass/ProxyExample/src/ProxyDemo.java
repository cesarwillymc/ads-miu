/**

    Hello: A
    before
    Hello: A
    after
    Hello: B
    before
    Hello: B
    after

 */
public class ProxyDemo {
    public static void main(String[] args) {

        Thing t  = new aThing("A");
        t.compute("Hello");

        t = new LogProxy(t);
        t.compute("Hello");

        t = new bThing("B");
        t.compute("Hello");

        t = new LogProxy(t);
        t.compute("Hello");
    }
}