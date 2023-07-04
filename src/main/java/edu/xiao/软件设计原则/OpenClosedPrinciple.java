package edu.xiao.软件设计原则;

/**
 * 开闭原则
 */
public class OpenClosedPrinciple {

    public static void main(String[] args) {
        SouGouInput souGouInput = new SouGouInput();
        // souGouInput.setSkin(new DefaultSkin());
        souGouInput.setSkin(new OtherSkin());
        souGouInput.display();
    }

}

class SouGouInput {

    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        skin.display();
    }
}

abstract class AbstractSkin {

    abstract void display();
}

class DefaultSkin extends AbstractSkin {

    @Override
    void display() {
        System.out.println("默认皮肤");
    }
}

class OtherSkin extends AbstractSkin {

    @Override
    void display() {
        System.out.println("其他皮肤");
    }
}
