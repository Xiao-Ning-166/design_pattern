package edu.xiao.结构型模式.组合模式;

public class Client {

    public static void main(String[] args) {
        MenuComponent root = new MenuContainer("系统管理", 1);

        MenuComponent menu1 = new MenuContainer("菜单管理", 2);
        menu1.add(new MenuLeaf("页面访问", 3));
        menu1.add(new MenuLeaf("展开菜单", 3));
        menu1.add(new MenuLeaf("编辑菜单", 3));
        menu1.add(new MenuLeaf("删除菜单", 3));
        menu1.add(new MenuLeaf("新增菜单", 3));

        MenuComponent menu2 = new MenuContainer("权限配置", 2);
        menu2.add(new MenuLeaf("页面访问", 3));
        menu2.add(new MenuLeaf("提交保存", 3));

        MenuComponent menu3 = new MenuContainer("权限配置", 2);
        menu3.add(new MenuLeaf("页面访问", 3));
        menu3.add(new MenuLeaf("新增角色", 3));
        menu3.add(new MenuLeaf("修改角色", 3));

        root.add(menu1);
        root.add(menu2);
        root.add(menu3);

        root.print();
    }

}
