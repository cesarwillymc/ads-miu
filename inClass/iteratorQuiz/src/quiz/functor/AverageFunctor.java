package quiz.functor;

public class AverageFunctor implements Functor<Integer> {
    private Integer sum = 0;
    private Integer counter=0;
    @Override
    public Integer compute(Integer element) {
        counter++;
        return sum+=element;
    }

    @Override
    public Integer getValue() {
        return sum/counter;
    }
}
