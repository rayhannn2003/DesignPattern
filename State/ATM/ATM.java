package State.ATM;

public class ATM {
    private ATMState state;
    private int correctPin;
    private double balance;
    
    public ATM(int pin, double balance) {
        this.state = new IdleState();
        this.correctPin = pin;
        this.balance = balance;
    }
    
    public void setState(ATMState state) {
        this.state = state;
        System.out.println("→ State: " + state.getStateName());
    }
    
    public void insertCard() {
        state.insertCard(this);
    }
    
    public void enterPin(int pin) {
        state.enterPin(this, pin);
    }
    
    public void selectTransaction() {
        state.selectTransaction(this);
    }
    
    public void withdrawCash(double amount) {
        state.withdrawCash(this, amount);
    }
    
    public void ejectCard() {
        state.ejectCard(this);
    }
    
    public boolean validatePin(int pin) {
        return this.correctPin == pin;
    }
    
    public boolean hasSufficientBalance(double amount) {
        return this.balance >= amount;
    }
    
    public void deductBalance(double amount) {
        this.balance -= amount;
    }
    
    public double getBalance() {
        return balance;
    }
}
