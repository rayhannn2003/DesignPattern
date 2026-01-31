package State.ATM;

public class DispensingCashState implements ATMState {
    
    @Override
    public void insertCard(ATM atm) {
        System.out.println("Please wait, dispensing cash...");
    }
    
    @Override
    public void enterPin(ATM atm, int pin) {
        System.out.println("Please wait, dispensing cash...");
    }
    
    @Override
    public void selectTransaction(ATM atm) {
        System.out.println("Please wait, dispensing cash...");
    }
    
    @Override
    public void withdrawCash(ATM atm, double amount) {
        System.out.println("Cash dispensed successfully!");
        System.out.println("Remaining balance: $" + atm.getBalance());
        atm.setState(new EjectingCardState());
    }
    
    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Please wait, dispensing cash...");
    }
    
    @Override
    public String getStateName() {
        return "DISPENSING_CASH";
    }
}
