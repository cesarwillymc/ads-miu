package part1.usignOwnLibrary2.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable<T> {
    private final List<Observer<T>> observers= new ArrayList<>();
    private T data;

    public void setData(T data) {
        this.data = data;
        notifyChange();
    }

    public void attach(Observer<T> observer){
        observers.add(observer);
    }
    public void detach(Observer<T> observer){
        observers.remove(observer);
    }
    protected void notifyChange(){
        for (var obs:observers) {
            obs.update(data);
        }
    }
    
}
