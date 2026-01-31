package State.VendingMachine;

public class OutOfStockState implements VendingMachineState {
    
    @Override
    public void insertMoney(VendingMachine machine, double amount) {
        System.out.println("Machine is out of stock. Returning money: $" + amount);
    }
    
    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("Out of stock. Please try another machine");
    }
    
    @Override
    public void dispense(VendingMachine machine) {
        System.out.println("Out of stock");
    }
    
    @Override
    public void refund(VendingMachine machine) {
        if (machine.getBalance() > 0) {
            System.out.println("Refunding $" + machine.getBalance());
            machine.setBalance(0);
        } else {
            System.out.println("No money to refund");
        }
    }
    
    @Override
    public String getStateName() {
        return "OUT_OF_STOCK";
    }
}
