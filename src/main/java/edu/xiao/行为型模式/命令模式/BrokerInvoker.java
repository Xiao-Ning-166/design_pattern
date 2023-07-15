package edu.xiao.行为型模式.命令模式;

import edu.xiao.结构型模式.外观模式.Light;

import java.util.ArrayList;
import java.util.List;

/**
 * 调用者
 */
public class BrokerInvoker {

    private List<StockCommand> commands;

    public BrokerInvoker() {
        this.commands = new ArrayList<>();
    }

    public void takeStock(StockCommand command) {
        commands.add(command);
    }

    public void placeStocks() {
        for (StockCommand command : commands) {
            command.execute();
        }
        commands.clear();
    }

}
