package com.itheima;

public class Array {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1, 2, 3};

        //输出数组名
        System.out.println(arr);

        //输出数组中的元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //索引越界
       System.out.println(arr[3]);

        //空指针异常
        arr = null;
        System.out.println(arr[0]);

    }
}
