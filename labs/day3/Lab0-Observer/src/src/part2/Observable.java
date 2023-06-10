package part2;

import java.util.ArrayList;
import java.util.List;

public class Observable<T> {
    private final List<Observer<T>> observers = new ArrayList<>();
    private T data;

    public void notify(T data) {
        this.data = data;
        notifyChange();
    }

    public void attach(Observer<T> observer) {
        observers.add(observer);
    }

    public void detach(Observer<T> observer) {
        observers.remove(observer);
    }

    private void notifyChange() {
        for (var obs : observers) {
            obs.update(data);
        }
    }

}
