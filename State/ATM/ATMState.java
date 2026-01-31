package State.ATM;

public interface ATMState {
    void insertCard(ATM atm);
    void enterPin(ATM atm, int pin);
    void selectTransaction(ATM atm);
    void withdrawCash(ATM atm, double amount);
    void ejectCard(ATM atm);
    String getStateName();
}
