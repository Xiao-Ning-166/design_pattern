package edu.xiao.软件设计原则;

/**
 * 依赖倒置原则
 */
public class DependencyInversionPrinciple {

    public static void main(String[] args) {
        Database mysql = new MySQLDatabase();
        Database mongodb = new MongoDBDatabase();

        new BudgetReport(mongodb).save();
        new BudgetReport(mongodb).open();

        System.out.println("===================");

        new BudgetReport(mysql).save();
        new BudgetReport(mysql).open();
    }

}

class BudgetReport {
    Database database;

    public BudgetReport(Database database) {
        this.database = database;
    }

    public void open() {
        database.select();
    }

    public void save() {
        database.insert();
    }
}

interface Database {

    void insert();

    void delete();

    void update();

    void select();

}

class MySQLDatabase implements Database {

    @Override
    public void insert() {
        System.out.println("mysql 增");
    }

    @Override
    public void delete() {
        System.out.println("mysql 删");
    }

    @Override
    public void update() {
        System.out.println("mysql 改");
    }

    @Override
    public void select() {
        System.out.println("mysql 查");
    }
}

class MongoDBDatabase implements Database {

    @Override
    public void insert() {
        System.out.println("MongoDB 增");
    }

    @Override
    public void delete() {
        System.out.println("MongoDB 删");
    }

    @Override
    public void update() {
        System.out.println("MongoDB 改");
    }

    @Override
    public void select() {
        System.out.println("MongoDB 查");
    }
}
