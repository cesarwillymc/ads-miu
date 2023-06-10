public class Mediator {
    private VStack vStack;
    private String lastItemDeleted;
    private Invoker invoker;
    private UpdateChanges updateChanges;

    public Mediator(VStack vStack, Invoker invoker, UpdateChanges updateChanges) {
        this.vStack = vStack;
        this.invoker = invoker;
        this.updateChanges = updateChanges;
        updateChanges.notifyList(vStack.getStackVector());
    }

    protected void push(String text) {
        vStack.push(text);
        updateChanges.notifyList(vStack.getStackVector());
    }

    protected void pop() {
        if (vStack.getSize() >= 0) {
            lastItemDeleted = vStack.pop();
        }
        updateChanges.notifyList(vStack.getStackVector());
    }

    public String getLastItemDeleted() {
        return lastItemDeleted;
    }

    public void executeCommand(Command command) {
        invoker.executeCommand(command);
    }

    public void undoCommand() {
        invoker.undoCommand();
    }

    public void redoCommand() {
        invoker.redoCommand();
    }
}
