public class Mediator{
    private VStack vStack;
    private Invoker invoker;
    private UpdateChanges updateChanges;

    public Mediator(VStack vStack, Invoker invoker, UpdateChanges updateChanges) {
        this.vStack = vStack;
        this.invoker = invoker;
        this.updateChanges = updateChanges;
        updateChanges.notifyList(vStack.getStackVector());
    }

    public void executeCommand(Command command) {
        invoker.executeCommand(command);
        updateChanges.notifyList(vStack.getStackVector());
    }

    public void undoCommand() {
        invoker.undoCommand();
        updateChanges.notifyList(vStack.getStackVector());
    }

    public void redoCommand() {
        invoker.redoCommand();
        updateChanges.notifyList(vStack.getStackVector());
    }

    public VStack getvStack() {
        return vStack;
    }
}
