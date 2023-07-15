package edu.xiao.行为型模式.命令模式;

/**
 * 测试
 */
public class Client {

    public static void main(String[] args) {
        StockReceiver abcStock = new StockReceiver();

        BuyStockCommand buyStockOrder = new BuyStockCommand(abcStock);
        SellStockCommand sellStockOrder = new SellStockCommand(abcStock);

        BrokerInvoker broker = new BrokerInvoker();
        broker.takeStock(buyStockOrder);
        broker.takeStock(sellStockOrder);

        broker.placeStocks();
    }

}
