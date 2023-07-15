package edu.xiao.行为型模式.状态模式;

/**
 * 测试类
 */
public class Client {

    public static void main(String[] args) {
        LiftContext context = new LiftContext(new RunningState());
        // context.setState(new ClosingState());

        context.open();
        context.close();
        context.run();
        context.stop();

    }

}
