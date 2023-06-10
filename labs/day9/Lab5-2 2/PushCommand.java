public class PushCommand implements Command {
    private final Mediator mediator;
    private final String element;

    public PushCommand(Mediator mediator, String element) {
        this.mediator = mediator;
        this.element = element;
    }

    @Override
    public void execute() {
        mediator.push(element);
    }

    @Override
    public void undo() {
        mediator.pop();
    }

}
