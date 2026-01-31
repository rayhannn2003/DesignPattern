package Command.StockTrading;

public class Stock {
    private String name;
    private double price;
    private int quantity;
    
    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }
    
    public void buy(int quantity) {
        this.quantity += quantity;
        System.out.println("Bought " + quantity + " shares of " + name + " at $" + price);
        System.out.println("Total shares owned: " + this.quantity);
    }
    
    public void sell(int quantity) {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
            System.out.println("Sold " + quantity + " shares of " + name + " at $" + price);
            System.out.println("Remaining shares: " + this.quantity);
        } else {
            System.out.println("Not enough shares to sell");
        }
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
}
