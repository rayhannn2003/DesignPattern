package State.VendingMachine;

public interface VendingMachineState {
    void insertMoney(VendingMachine machine, double amount);
    void selectProduct(VendingMachine machine);
    void dispense(VendingMachine machine);
    void refund(VendingMachine machine);
    String getStateName();
}
