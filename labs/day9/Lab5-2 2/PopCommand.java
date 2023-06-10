public class PopCommand implements Command {
    private final Mediator mediator;

    public PopCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.pop();
    }

    @Override
    public void undo() {
        mediator.push(mediator.getLastItemDeleted());
    }
}
