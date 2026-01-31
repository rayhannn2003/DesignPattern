package Command.Restaurant;

public class BurgerOrder implements Order {
    private Chef chef;
    private int tableNumber;
    
    public BurgerOrder(Chef chef, int tableNumber) {
        this.chef = chef;
        this.tableNumber = tableNumber;
    }
    
    @Override
    public void execute() {
        System.out.println("Table " + tableNumber + ":");
        chef.cookBurger();
    }
    
    @Override
    public void cancel() {
        System.out.println("Burger order for table " + tableNumber + " cancelled");
    }
    
    @Override
    public String getOrderDetails() {
        return "Burger for table " + tableNumber;
    }
}
