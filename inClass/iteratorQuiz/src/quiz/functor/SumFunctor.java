package quiz.functor;

public class SumFunctor implements Functor<Integer> {
    Integer sum=0;

    @Override
    public Integer compute(Integer element) {
        return sum+=element;
    }

    @Override
    public Integer getValue() {
        return sum;
    }
}
