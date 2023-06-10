package part1.usingOwnLibrary1;

import part1.usingOwnLibrary1.Observer.Observable;
import part1.usingOwnLibrary1.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Counter implements Observable {
    private int count;
    List<Observer> observers= new ArrayList<>();

    public Counter() {
        count = 0;
    }

    public void increment() {
        count++;
        notifyChange();
    }

    public void decrement() {
        if (count > 0) {
            count--;
            notifyChange();
        }
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyChange() {
        for (var ob: observers){
            ob.update();
        }
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public int getCount() {
        return count;
    }
}