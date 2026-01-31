package Command.BankingSystem;

import java.util.Stack;

class TransactionManager {
    private Stack<BankCommand> history = new Stack<>();

    public void executeCommand(BankCommand command) {
        command.execute();
        history.push(command);
    }

    public void undo() {
        if (!history.isEmpty()) {
            history.pop().undo();
        }
    }
}
