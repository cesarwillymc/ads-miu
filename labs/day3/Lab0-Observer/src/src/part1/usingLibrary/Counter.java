package part1.usingLibrary;

import java.util.Observable;

public class Counter extends Observable {
    private Integer count;
    public Counter (){
        count = 0;
    }
    
    public void increment(){
        count++;
        setChanged();
        notifyObservers(count);
    }
    
    public void decrement(){
        if (count >0){
            count--;
            setChanged();
            notifyObservers(count);
        }
    }
}