package edu.xiao.行为型模式.状态模式;

/**
 * 上下文对象
 */
public class LiftContext {

    // 4个状态
    public static final LiftState OPEN_STATE = new OpenningState();
    public static final LiftState CLOSE_STATE = new ClosingState();
    public static final LiftState RUN_STATE = new RunningState();
    public static final LiftState STOP_STATE = new StoppingState();

    private LiftState state;


    public LiftContext(LiftState initState) {
        // 初始状态
        this.state = initState;
        this.state.setContext(this);
    }

    /**
     * 改变状态
     *
     * @param state
     */
    public void setState(LiftState state) {
        // 状态改变
        this.state = state;
        // 通知状态改变
        this.state.setContext(this);
    }

    /**
     * 电梯开门动作
     */
    public void open() {
        state.open();
    }

    /**
     * 电梯关门动作
     */
    public void close() {
        state.close();
    }

    /**
     * 电梯运行动作
     */
    public void run() {
        state.run();
    }

    /**
     * 电梯停止动作
     */
    public void stop() {
        state.stop();
    }
}
