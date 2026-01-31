package State.VendingMachine;

public class HasMoneyState implements VendingMachineState {
    
    @Override
    public void insertMoney(VendingMachine machine, double amount) {
        System.out.println("Additional money inserted: $" + amount);
        machine.setBalance(machine.getBalance() + amount);
    }
    
    @Override
    public void selectProduct(VendingMachine machine) {
        if (machine.getBalance() >= machine.getProductPrice()) {
            System.out.println("Product selected. Dispensing...");
            machine.setState(new DispensingState());
        } else {
            System.out.println("Insufficient balance. Need $" + machine.getProductPrice() + ", have $" + machine.getBalance());
        }
    }
    
    @Override
    public void dispense(VendingMachine machine) {
        System.out.println("Please select a product first");
    }
    
    @Override
    public void refund(VendingMachine machine) {
        System.out.println("Refunding $" + machine.getBalance());
        machine.setBalance(0);
        machine.setState(new IdleState());
    }
    
    @Override
    public String getStateName() {
        return "HAS_MONEY";
    }
}
