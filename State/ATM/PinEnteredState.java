package State.ATM;

public class PinEnteredState implements ATMState {
    
    @Override
    public void insertCard(ATM atm) {
        System.out.println("Card already inserted");
    }
    
    @Override
    public void enterPin(ATM atm, int pin) {
        System.out.println("PIN already entered");
    }
    
    @Override
    public void selectTransaction(ATM atm) {
        System.out.println("Transaction selected: Withdrawal");
        atm.setState(new SelectingTransactionState());
    }
    
    @Override
    public void withdrawCash(ATM atm, double amount) {
        System.out.println("Please select transaction first");
    }
    
    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Transaction cancelled. Card ejected");
        atm.setState(new IdleState());
    }
    
    @Override
    public String getStateName() {
        return "PIN_ENTERED";
    }
}
