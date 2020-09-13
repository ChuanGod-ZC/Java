package itheima_09;

import java.util.ArrayList;

public class ArrayListTest04 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student01> array = new ArrayList<Student01>();

        //创建学生对象
        Student01 s1 = new Student01("林青霞", 30);
        Student01 s2 = new Student01("风清扬", 33);
        Student01 s3 = new Student01("张曼玉", 18);

        //添加学生对象到集合中
        array.add(s1);
        array.add(s2);
        array.add(s3);

        //遍历集合，采用通用遍历格式实现
        for(int i=0; i<array.size(); i++) {
            Student01 s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
