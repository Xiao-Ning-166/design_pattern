package edu.xiao.行为型模式.责任链模式;

import java.util.List;

/**
 * 处理者接口
 */
public abstract class VerificationHandler {

    /**
     * 下一个处理者
     */
    private VerificationHandler next;

    /**
     * 构建执行链
     *
     * @param first
     * @param verificationHandlers
     * @return
     */
    public static VerificationHandler buildChain(VerificationHandler first, List<VerificationHandler> verificationHandlers) {
        VerificationHandler head = first;
        for (VerificationHandler nextHandler : verificationHandlers) {
            head.next = nextHandler;
            head = nextHandler;
        }
        return first;
    }

    /**
     * 具体检查逻辑，子类需要实现
     *
     * @param email
     * @param password
     * @return
     */
    public abstract boolean check(String email, String password);

    /**
     * 检查是否到了执行链尾
     *
     * @param email
     * @param password
     * @return
     */
    public boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }

}
