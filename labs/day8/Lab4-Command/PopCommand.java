public class PopCommand implements Command {
    private final VStack vStack;
    private String deleted;

    public PopCommand(VStack vStack) {
        this.vStack = vStack;
    }

    @Override
    public void execute() {
        var pop = vStack.pop();
        if (pop == null) {
            deleted = pop;
        }
    }

    @Override
    public void undo() {
        if (deleted != null)
            vStack.push(deleted);
        deleted = null;
    }

    @Override
    public void redo() {
        vStack.pop();
    }
}
