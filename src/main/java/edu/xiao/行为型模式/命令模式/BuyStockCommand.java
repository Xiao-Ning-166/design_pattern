package edu.xiao.行为型模式.命令模式;

/**
 * 具体命令
 */
public class BuyStockCommand implements StockCommand {

    private StockReceiver stock;

    public BuyStockCommand(StockReceiver stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
