public class PushCommand implements Command {
    private final VStack vstack;
    private final String element;

    public PushCommand(VStack vstack, String element) {
        this.vstack = vstack;
        this.element = element;
    }

    @Override
    public void execute() {
        vstack.push(element);
    }

    @Override
    public void undo() {
        vstack.pop();
    }

}
