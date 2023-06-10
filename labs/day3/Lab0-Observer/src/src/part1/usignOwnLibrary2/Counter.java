package part1.usignOwnLibrary2;

import part1.usignOwnLibrary2.Observer.Observable;

public class Counter extends Observable<Integer> {
    private int count;

    public Counter() {
        count = 0;
    }

    public void increment() {
        count++;
        setData(count);
    }

    public void decrement() {
        if (count > 0) {
            count--;
            setData(count);
        }
    }

}