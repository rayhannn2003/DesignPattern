package Mediator.StockExchange;

public interface StockMediator {
    void registerTrader(Trader trader);
    void placeBuyOrder(String stockSymbol, int quantity, double price, Trader buyer);
    void placeSellOrder(String stockSymbol, int quantity, double price, Trader seller);
}
