package itheima_07;

public class StringBuilderDemo03 {
    public static void main(String[] args) {
        //StringBuilder 转换为 String
        StringBuilder sb1 = new StringBuilder();
        sb1.append("hello");

        //String s = sb; //这是个错误用法

        //public String toString(); 通过 toString() 就可以实现把 StringBuilder 转换为 String
        String s1 = sb1.toString();
        System.out.println(s1);

        //String 转换为 StringBuilder
        String s2 = "hello";

        //StringBuilder sb = s; //这是个错误的做法

        //public StringBuilder(String s); 通过构造方法就可以实现把 String 转换为 StringBuilder
        StringBuilder sb2 = new StringBuilder(s2);

        System.out.println(sb2);

    }
}
