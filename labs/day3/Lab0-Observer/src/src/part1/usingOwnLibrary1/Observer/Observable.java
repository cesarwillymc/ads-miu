package part1.usingOwnLibrary1.Observer;

public interface Observable {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyChange();
}
