package Mediator.StockExchange;

public class StockTrader extends Trader {
    
    public StockTrader(StockMediator mediator, String name) {
        super(mediator, name);
    }
    
    @Override
    public void buyStock(String stockSymbol, int quantity, double price) {
        mediator.placeBuyOrder(stockSymbol, quantity, price, this);
    }
    
    @Override
    public void sellStock(String stockSymbol, int quantity, double price) {
        mediator.placeSellOrder(stockSymbol, quantity, price, this);
    }
}
