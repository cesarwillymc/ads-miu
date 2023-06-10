public interface Container<T> {
    double computePrice(Functor<T>  doSomething);

    double netPrice();

    double discountPrice();
}
