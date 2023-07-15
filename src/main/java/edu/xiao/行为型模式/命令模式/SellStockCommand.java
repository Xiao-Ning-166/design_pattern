package edu.xiao.行为型模式.命令模式;

/**
 * 具体命令
 */
public class SellStockCommand implements StockCommand {

    private StockReceiver stock;

    public SellStockCommand(StockReceiver stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
