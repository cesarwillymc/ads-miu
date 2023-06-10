public class PopCommand implements Command {
    private final VStack vstack;
    private String lastItemDeleted;

    public PopCommand(VStack vstack) {
        this.vstack = vstack;
    }

    @Override
    public void execute() {
        lastItemDeleted = vstack.pop();
    }

    @Override
    public void undo() {
        vstack.push(lastItemDeleted);
    }
}
