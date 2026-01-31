package Command.Restaurant;

public class PastaOrder implements Order {
    private Chef chef;
    private int tableNumber;
    
    public PastaOrder(Chef chef, int tableNumber) {
        this.chef = chef;
        this.tableNumber = tableNumber;
    }
    
    @Override
    public void execute() {
        System.out.println("Table " + tableNumber + ":");
        chef.cookPasta();
    }
    
    @Override
    public void cancel() {
        System.out.println("Pasta order for table " + tableNumber + " cancelled");
    }
    
    @Override
    public String getOrderDetails() {
        return "Pasta for table " + tableNumber;
    }
}
