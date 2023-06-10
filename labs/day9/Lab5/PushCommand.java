public class PushCommand implements Command {
    private final VStack vStack;
    private final String element;

    public PushCommand(VStack vStack, String element) {
        this.vStack = vStack;
        this.element = element;
    }

    @Override
    public void execute() {
        vStack.push(element);
    }

    @Override
    public void undo() {
        vStack.pop();
    }

}
