package Command.Restaurant;

public class PizzaOrder implements Order {
    private Chef chef;
    private int tableNumber;
    
    public PizzaOrder(Chef chef, int tableNumber) {
        this.chef = chef;
        this.tableNumber = tableNumber;
    }
    
    @Override
    public void execute() {
        System.out.println("Table " + tableNumber + ":");
        chef.cookPizza();
    }
    
    @Override
    public void cancel() {
        System.out.println("Pizza order for table " + tableNumber + " cancelled");
    }
    
    @Override
    public String getOrderDetails() {
        return "Pizza for table " + tableNumber;
    }
}
