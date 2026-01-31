package State.ATM;

public class EjectingCardState implements ATMState {
    
    @Override
    public void insertCard(ATM atm) {
        System.out.println("Please wait...");
    }
    
    @Override
    public void enterPin(ATM atm, int pin) {
        System.out.println("Transaction complete");
    }
    
    @Override
    public void selectTransaction(ATM atm) {
        System.out.println("Transaction complete");
    }
    
    @Override
    public void withdrawCash(ATM atm, double amount) {
        System.out.println("Transaction complete");
    }
    
    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Card ejected. Thank you!");
        atm.setState(new IdleState());
    }
    
    @Override
    public String getStateName() {
        return "EJECTING_CARD";
    }
}
