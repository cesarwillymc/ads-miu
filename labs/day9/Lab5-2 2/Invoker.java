import java.util.Stack;

public class Invoker {
    private Stack<Command> commandHistory = new Stack<>();
    private Stack<Command> redoHistory = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        commandHistory.push(command);
        redoHistory.clear();
    }

    public void undoCommand() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
            redoHistory.push(lastCommand);
        } else {
            System.out.println("Undo Empty");
        }
    }

    public void redoCommand() {
        if (!redoHistory.isEmpty()) {
            Command lastUndoneCommand = redoHistory.pop();
            lastUndoneCommand.execute();
            commandHistory.push(lastUndoneCommand);
        } else {
            System.out.println("Redo empty");
        }
    }
}
