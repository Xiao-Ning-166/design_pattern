package edu.xiao.行为型模式.状态模式;

/**
 * 状态接口
 */
public abstract class LiftState {

    /**
     * 定义一个环境角色，也就是封装状态的变化引起的功能变化
     */
    protected LiftContext context;

    public void setContext(LiftContext context) {
        this.context = context;
    }

    /**
     * 电梯开门动作
     */
    public abstract void open();

    /**
     * 电梯关门动作
     */
    public abstract void close();

    /**
     * 电梯运行动作
     */
    public abstract void run();

    /**
     * 电梯停止动作
     */
    public abstract void stop();
}
