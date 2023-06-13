public class SumFunctor implements Functor<Container,Integer> {
    Integer sum=0;

    @Override
    public Container compute(Container element) {
        System.out.println("sum"+sum);
        sum++;
        return element;
    }

    @Override
    public Integer getValue() {
        return sum;
    }
}
