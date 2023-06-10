import java.util.*;

public class VStack {
    private Vector<String> stackvector;

    public VStack() {
        stackvector = new Vector<>();
    }

    public void push(String obj) {
        stackvector.insertElementAt(obj, 0);
    }

    public String pop() {
        if (stackvector.size() > 0) {
            String obj = stackvector.firstElement();
            stackvector.removeElementAt(0);
            return obj;
        } else
            return null;
    }

    public String peek() {
        if (stackvector.size() > 0) {
            return stackvector.firstElement();
        } else
            return null;
    }

    public boolean isEmpty() {
        return stackvector.isEmpty();
    }

    public Vector<String> getStackVector() {
        return stackvector;
    }

}
