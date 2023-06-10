package part2;

public class Counter extends Observable<Integer> {
    private Integer count;

    public Counter() {
        count = 0;
    }

    public void increment() {
        count++;
        notify(count);
    }

    public void decrement() {
        if (count > 0) {
            count--;
            notify(count);
        }
    }
}