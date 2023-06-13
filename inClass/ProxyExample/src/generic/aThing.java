package generic;

public class aThing <T> implements Thing <T>{

    private String name;

    public aThing(String name) {
        this.name=name;
    }

    @Override
    public void compute(T input) {
        System.out.println(input +":"+name);
    }


}
