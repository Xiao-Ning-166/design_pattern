package edu.xiao.行为型模式.状态模式;

/**
 * 具体状态
 */
public class OpenningState extends LiftState {

    //开启当然可以关闭了，我就想测试一下电梯门开关功能
    @Override
    public void open() {
        System.out.println("电梯门开启...");
    }

    @Override
    public void close() {
        // 状态修改
        super.context.setState(LiftContext.CLOSE_STATE);
        // 动作委托为CloseState来执行，也就是委托给了ClosingState子类执行这个动作
        super.context.close();
    }

    //电梯门不能开着就跑，这里什么也不做
    @Override
    public void run() {
        //do nothing
    }

    //开门状态已经是停止的了
    @Override
    public void stop() {
        //do nothing
    }
}
