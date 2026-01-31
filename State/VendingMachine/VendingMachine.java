package State.VendingMachine;

public class VendingMachine {
    private VendingMachineState state;
    private double balance;
    private double productPrice;
    private int stock;
    
    public VendingMachine(double productPrice, int stock) {
        this.state = new IdleState();
        this.balance = 0;
        this.productPrice = productPrice;
        this.stock = stock;
    }
    
    public void setState(VendingMachineState state) {
        this.state = state;
        System.out.println("State: " + state.getStateName());
    }
    
    public void insertMoney(double amount) {
        state.insertMoney(this, amount);
    }
    
    public void selectProduct() {
        state.selectProduct(this);
    }
    
    public void dispense() {
        state.dispense(this);
    }
    
    public void refund() {
        state.refund(this);
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double getProductPrice() {
        return productPrice;
    }
    
    public int getStock() {
        return stock;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public void displayStatus() {
        System.out.println("Current State: " + state.getStateName());
        System.out.println("Balance: $" + balance);
        System.out.println("Stock: " + stock);
    }
}
