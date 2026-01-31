package Command.BankingSystem;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        TransactionManager manager = new TransactionManager();

        manager.executeCommand(new DepositCommand(account, 500));
        System.out.println("Balance: " + account.getBalance());

        manager.executeCommand(new WithdrawCommand(account, 200));
        System.out.println("Balance: " + account.getBalance());

        manager.undo();
        System.out.println("After Undo: " + account.getBalance());
    }
}
