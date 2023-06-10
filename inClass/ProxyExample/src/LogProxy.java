public class LogProxy implements Thing {
    private Thing realSubject;
    public LogProxy(Thing t) {
        realSubject = t;
    }

    @Override
    public void compute(String message) {
        System.out.println("before");
        realSubject.compute(message);
        System.out.println("after");
    }
}
