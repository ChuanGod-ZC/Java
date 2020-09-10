package itheima_01;

public class Student {
    //成员变量
    String name;
//    int age;
    private int age;

    //提供get/set方法
    public void setAge(int a) {

        if(a<0 || a>120) {
            System.out.println("你给的年龄有误");
        } else {
            age = a;
        }
    }

    //成员变量
    public void show() {
        System.out.println(name + "," + age);
    }
}
