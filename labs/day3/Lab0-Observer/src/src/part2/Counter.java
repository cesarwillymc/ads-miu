package part2;

public class Counter  {
    public final Observable<Integer> events = new Observable<>();
    private Integer count;

    public Counter() {
        count = 0;
    }

    public void increment() {
        count++;
        events.notify(count);
    }

    public void decrement() {
        if (count > 0) {
            count--;
            events.notify(count);
        }
    }
}