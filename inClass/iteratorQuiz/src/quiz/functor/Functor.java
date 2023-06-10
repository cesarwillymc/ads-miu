package quiz.functor;

public interface Functor <T>{
    T compute(T element);
    T getValue();
}
