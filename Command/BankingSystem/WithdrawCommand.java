package Command.BankingSystem;

class WithdrawCommand implements BankCommand {
    private BankAccount account;
    private int amount;

    public WithdrawCommand(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void execute() {
        account.withdraw(amount);
    }

    public void undo() {
        account.deposit(amount);
    }
}
