package functor;

public class aThing  implements Thing {

    private String name;

    public aThing(String name) {
        this.name=name;
    }

    @Override
    public void compute(String message) {
        System.out.printf("%s: %s\n",message,name);
    }


}
