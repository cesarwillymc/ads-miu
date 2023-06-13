package generic;


public class bThing <T> implements Thing<T> {
    private String name;
    public bThing(  String name) {
        this.name=name;
    }

    @Override
    public void compute(T input) {
        System.out.println(input +":"+name);
    }
}

