package edu.xiao.行为型模式.中介者模式;

import edu.xiao.行为型模式.责任链模式.UserVerificationHandler;

/**
 * 中介者接口
 */
public interface Mediator {

    void notify(User sender, String message);

}
