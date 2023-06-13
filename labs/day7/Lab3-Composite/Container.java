public interface Container<T,A> {
    void doAll(Functor  doSomething);

    T netPrice();

    T discountPrice();
}
