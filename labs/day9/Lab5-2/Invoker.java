import java.util.Stack;

public class Invoker {
    private Stack<Command> commandHistory = new Stack<>();
    private Stack<Command> redoHistory = new Stack<>();

    private Mediator mediator;

    public Invoker(Mediator mediator) {
        this.mediator = mediator;
    }

    public void executeCommand(Command command) {
        command.execute();
        commandHistory.push(command);
        redoHistory.clear();
        mediator.updateView();
    }

    public void undoCommand() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
            redoHistory.push(lastCommand);
        }
        mediator.updateView();
    }

    public void redoCommand() {
        if (!redoHistory.isEmpty()) {
            Command lastUndoneCommand = redoHistory.pop();
            lastUndoneCommand.execute();
            commandHistory.push(lastUndoneCommand);
        }
        mediator.updateView();
    }
    public void repeatCommand(){
        if(!commandHistory.isEmpty()){
            executeCommand(commandHistory.peek());
        }
    }
    public boolean isRedoEmpty(){
        return redoHistory.isEmpty();
    }
    public boolean isCommandEmpty(){
        return commandHistory.isEmpty();
    }
}
