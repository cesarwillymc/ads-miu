public class bThing implements Thing {
    private String name;
    public bThing(String name) {
        this.name = name;
    }

    @Override
    public void compute(String message) {
        System.out.printf("%s: %s\n",message,name);
    }
}
