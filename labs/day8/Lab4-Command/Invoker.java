import java.util.Stack;

public class Invoker {
    private Stack<Command> commandHistory = new Stack<>();
    private Stack<Command> deletedHistory = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        commandHistory.push(command);
        deletedHistory.clear();
    }

    public void undoCommand() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
            deletedHistory.push(lastCommand);
        }
    }

    public void redoCommand() {
        if (!deletedHistory.isEmpty()) {
            Command lastUndoneCommand = deletedHistory.pop();
            lastUndoneCommand.redo();
            commandHistory.push(lastUndoneCommand);
        }
    }
}
