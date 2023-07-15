package edu.xiao.行为型模式.责任链模式;

/**
 * 具体处理者
 */
public class UserVerificationHandler extends VerificationHandler {

    /**
     * 具体检查逻辑，子类需要实现
     *
     * @param email
     * @param password
     * @return
     */
    @Override
    public boolean check(String email, String password) {
        System.out.println("检查用户的逻辑。。。。。。");

        return checkNext(email, password);
    }
}
