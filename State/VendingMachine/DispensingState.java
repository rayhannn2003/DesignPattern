package State.VendingMachine;

public class DispensingState implements VendingMachineState {
    
    @Override
    public void insertMoney(VendingMachine machine, double amount) {
        System.out.println("Please wait, dispensing product...");
    }
    
    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("Already dispensing product...");
    }
    
    @Override
    public void dispense(VendingMachine machine) {
        System.out.println("Product dispensed!");
        double change = machine.getBalance() - machine.getProductPrice();
        if (change > 0) {
            System.out.println("Change returned: $" + change);
        }
        machine.setBalance(0);
        
        if (machine.getStock() > 0) {
            machine.setStock(machine.getStock() - 1);
            System.out.println("Remaining stock: " + machine.getStock());
            if (machine.getStock() == 0) {
                machine.setState(new OutOfStockState());
            } else {
                machine.setState(new IdleState());
            }
        } else {
            machine.setState(new OutOfStockState());
        }
    }
    
    @Override
    public void refund(VendingMachine machine) {
        System.out.println("Cannot refund while dispensing");
    }
    
    @Override
    public String getStateName() {
        return "DISPENSING";
    }
}
