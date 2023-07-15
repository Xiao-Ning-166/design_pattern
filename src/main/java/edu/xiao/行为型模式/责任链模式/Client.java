package edu.xiao.行为型模式.责任链模式;

import java.util.Arrays;

/**
 * 测试类
 */
public class Client {

    public static void main(String[] args) {
        VerificationHandler verificationHandler = VerificationHandler.buildChain(
                new RequestCountVerificationHandler(),
                Arrays.asList(new UserVerificationHandler())
        );

        boolean result = verificationHandler.check("12321", "fdsf");

        System.out.println(result);
    }

}
