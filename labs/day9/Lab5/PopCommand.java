public class PopCommand implements Command {
    private final VStack vStack;
    private String state;

    public PopCommand(VStack vStack) {
        this.vStack = vStack;
    }

    @Override
    public void execute() {
        var pop = vStack.pop();
        if (pop == null) {
            state = pop;
        }
    }

    @Override
    public void undo() {
        if (state != null)
            vStack.push(state);
        state = null;
    }

}
