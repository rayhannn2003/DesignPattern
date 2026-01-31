package State.ATM;

public class CardInsertedState implements ATMState {
    
    @Override
    public void insertCard(ATM atm) {
        System.out.println("Card already inserted");
    }
    
    @Override
    public void enterPin(ATM atm, int pin) {
        if (atm.validatePin(pin)) {
            System.out.println("PIN accepted. Select transaction");
            atm.setState(new PinEnteredState());
        } else {
            System.out.println("Invalid PIN. Card ejected");
            atm.setState(new IdleState());
        }
    }
    
    @Override
    public void selectTransaction(ATM atm) {
        System.out.println("Please enter PIN first");
    }
    
    @Override
    public void withdrawCash(ATM atm, double amount) {
        System.out.println("Please enter PIN first");
    }
    
    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Card ejected");
        atm.setState(new IdleState());
    }
    
    @Override
    public String getStateName() {
        return "CARD_INSERTED";
    }
}
