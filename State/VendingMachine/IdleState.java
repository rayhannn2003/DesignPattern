package State.VendingMachine;

public class IdleState implements VendingMachineState {
    
    @Override
    public void insertMoney(VendingMachine machine, double amount) {
        System.out.println("Money inserted: $" + amount);
        machine.setBalance(amount);
        machine.setState(new HasMoneyState());
    }
    
    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("Please insert money first");
    }
    
    @Override
    public void dispense(VendingMachine machine) {
        System.out.println("Please insert money and select product first");
    }
    
    @Override
    public void refund(VendingMachine machine) {
        System.out.println("No money to refund");
    }
    
    @Override
    public String getStateName() {
        return "IDLE";
    }
}
