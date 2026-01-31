package State.VendingMachine;

public class VendingMachineDemo {
    public static void main(String[] args) {
        System.out.println("=== Vending Machine Simulation ===\n");
        
        VendingMachine machine = new VendingMachine(2.5, 3);
        
        System.out.println("--- Scenario 1: Successful Purchase ---");
        machine.insertMoney(3.0);
        machine.selectProduct();
        machine.dispense();
        
        System.out.println("\n--- Scenario 2: Insufficient Money ---");
        machine.insertMoney(1.0);
        machine.selectProduct();
        machine.insertMoney(2.0);
        machine.selectProduct();
        machine.dispense();
        
        System.out.println("\n--- Scenario 3: Request Refund ---");
        machine.insertMoney(5.0);
        machine.refund();
        
        System.out.println("\n--- Scenario 4: Out of Stock ---");
        machine.insertMoney(3.0);
        machine.selectProduct();
        machine.dispense();
        
        System.out.println("\n--- Scenario 5: Try to buy when out of stock ---");
        machine.insertMoney(3.0);
        machine.selectProduct();
        
        System.out.println("\n--- Final Status ---");
        machine.displayStatus();
    }
}
