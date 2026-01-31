package State.ATM;

public class SelectingTransactionState implements ATMState {
    
    @Override
    public void insertCard(ATM atm) {
        System.out.println("Card already inserted");
    }
    
    @Override
    public void enterPin(ATM atm, int pin) {
        System.out.println("Already authenticated");
    }
    
    @Override
    public void selectTransaction(ATM atm) {
        System.out.println("Transaction already selected");
    }
    
    @Override
    public void withdrawCash(ATM atm, double amount) {
        if (atm.hasSufficientBalance(amount)) {
            System.out.println("Dispensing $" + amount);
            atm.deductBalance(amount);
            atm.setState(new DispensingCashState());
        } else {
            System.out.println("Insufficient balance");
            atm.setState(new EjectingCardState());
        }
    }
    
    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Transaction cancelled. Card ejected");
        atm.setState(new IdleState());
    }
    
    @Override
    public String getStateName() {
        return "SELECTING_TRANSACTION";
    }
}
