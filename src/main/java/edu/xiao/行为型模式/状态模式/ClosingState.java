package edu.xiao.行为型模式.状态模式;

/**
 * 具体状态
 */
public class ClosingState extends LiftState {

    @Override
    //电梯门关闭，这是关闭状态要实现的动作
    public void close() {
        System.out.println("电梯门关闭...");
    }

    //电梯门关了再打开，逗你玩呢，那这个允许呀
    @Override
    public void open() {
        super.context.setState(LiftContext.OPEN_STATE);
        super.context.open();
    }


    //电梯门关了就跑，这是再正常不过了
    @Override
    public void run() {
        super.context.setState(LiftContext.RUN_STATE);
        super.context.run();
    }

    //电梯门关着，我就不按楼层
    @Override
    public void stop() {
        super.context.setState(LiftContext.STOP_STATE);
        super.context.stop();
    }

}
