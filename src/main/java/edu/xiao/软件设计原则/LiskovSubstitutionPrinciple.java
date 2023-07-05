package edu.xiao.软件设计原则;


/**
 * 里氏替换原则
 */
public class LiskovSubstitutionPrinciple {

    public static void main(String[] args) {
        Document readableDocument = new ReadableDocument();

        WritableDocument writableDocument = new WritableDocument();

        readableDocument.open();
        writableDocument.open();
        writableDocument.save();
    }

}


/**
 * 文档接口
 */
abstract class Document {

    void open() {
        System.out.println("读文档");
    }
}

class ReadableDocument extends Document {

}

/**
 * 可写文档
 */
class WritableDocument extends Document {

    public void save() {
        System.out.println("写文档");
    }
}


