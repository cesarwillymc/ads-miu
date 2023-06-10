import java.util.Stack;

public class Invoker {
    private Stack<Command> commandHistory = new Stack<>();
    private Stack<Command> deletedHistory = new Stack<>();
    private UpdateMediator mediator;

    public Invoker(UpdateMediator mediator) {
        this.mediator = mediator;
    }

    public void executeCommand(Command command) {
        command.execute();
        commandHistory.push(command);
        deletedHistory.clear();
        mediator.notifyListener(ActionsEnum.ENABLE_UNDO);
    }

    public void undoCommand() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
            deletedHistory.push(lastCommand);
            mediator.notifyListener(ActionsEnum.ENABLE_REDO);
        }
        if (commandHistory.isEmpty()) {
            mediator.notifyListener(ActionsEnum.DISABLE_UNDO);
        }
    }

    public void redoCommand() {
        if (!deletedHistory.isEmpty()) {
            Command lastUndoneCommand = deletedHistory.pop();
            lastUndoneCommand.execute();
            commandHistory.push(lastUndoneCommand);
            mediator.notifyListener(ActionsEnum.ENABLE_UNDO);
        }
        if (deletedHistory.isEmpty()) {
            mediator.notifyListener(ActionsEnum.DISABLE_REDO);
        }
    }
}
