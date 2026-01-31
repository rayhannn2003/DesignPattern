package Command.BankingSystem;

class DepositCommand implements BankCommand {
    private BankAccount account;
    private int amount;

    public DepositCommand(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void execute() {
        account.deposit(amount);
    }

    public void undo() {
        account.withdraw(amount);
    }
}

