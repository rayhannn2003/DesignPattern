package Mediator.StockExchange;

import java.util.ArrayList;
import java.util.List;

public class StockExchange implements StockMediator {
    private List<Trader> traders;
    private List<Order> buyOrders;
    private List<Order> sellOrders;
    
    public StockExchange() {
        this.traders = new ArrayList<>();
        this.buyOrders = new ArrayList<>();
        this.sellOrders = new ArrayList<>();
        System.out.println("Stock Exchange opened for trading\n");
    }
    
    @Override
    public void registerTrader(Trader trader) {
        traders.add(trader);
        System.out.println("Trader registered: " + trader.getName());
    }
    
    @Override
    public void placeBuyOrder(String stockSymbol, int quantity, double price, Trader buyer) {
        System.out.println("\n[BUY ORDER] " + buyer.getName() + " wants to buy " + quantity + " shares of " + stockSymbol + " at $" + price);
        
        Order buyOrder = new Order(stockSymbol, quantity, price, buyer, "BUY");
        
        for (Order sellOrder : sellOrders) {
            if (sellOrder.getStockSymbol().equals(stockSymbol) && sellOrder.getPrice() <= price) {
                matchOrders(buyOrder, sellOrder);
                return;
            }
        }
        
        buyOrders.add(buyOrder);
        System.out.println("Buy order added to order book");
    }
    
    @Override
    public void placeSellOrder(String stockSymbol, int quantity, double price, Trader seller) {
        System.out.println("\n[SELL ORDER] " + seller.getName() + " wants to sell " + quantity + " shares of " + stockSymbol + " at $" + price);
        
        Order sellOrder = new Order(stockSymbol, quantity, price, seller, "SELL");
        
        for (Order buyOrder : buyOrders) {
            if (buyOrder.getStockSymbol().equals(stockSymbol) && buyOrder.getPrice() >= price) {
                matchOrders(buyOrder, sellOrder);
                return;
            }
        }
        
        sellOrders.add(sellOrder);
        System.out.println("Sell order added to order book");
    }
    
    private void matchOrders(Order buyOrder, Order sellOrder) {
        int tradedQuantity = Math.min(buyOrder.getQuantity(), sellOrder.getQuantity());
        double tradePrice = sellOrder.getPrice();
        
        System.out.println("\n*** TRADE EXECUTED ***");
        System.out.println("Stock: " + buyOrder.getStockSymbol());
        System.out.println("Quantity: " + tradedQuantity);
        System.out.println("Price: $" + tradePrice);
        System.out.println("Buyer: " + buyOrder.getTrader().getName());
        System.out.println("Seller: " + sellOrder.getTrader().getName());
        System.out.println("Total: $" + (tradedQuantity * tradePrice));
        
        buyOrder.getTrader().notifyTrade(buyOrder.getStockSymbol(), tradedQuantity, tradePrice, "BOUGHT");
        sellOrder.getTrader().notifyTrade(sellOrder.getStockSymbol(), tradedQuantity, tradePrice, "SOLD");
        
        buyOrders.remove(buyOrder);
        sellOrders.remove(sellOrder);
    }
}
