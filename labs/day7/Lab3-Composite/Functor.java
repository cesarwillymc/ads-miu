public interface Functor <T,O>{
    T compute(T element);
    O getValue();
}
