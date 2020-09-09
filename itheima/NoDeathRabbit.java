package com.itheima;

public class NoDeathRabbit {
    public static void main(String[] args) {
        //定义一个数组，用动态初始化来存储多个月的兔子对数
        int[] arr = new int[20];

        //由已知可得
        arr[0] = 1;
        arr[1] = 1;

        //用循环实现计算每个月的兔子对数
        for(int x=2; x<arr.length; x++) {
            arr[x] = arr[x-2] + arr[x-1];
        }

        //数组中的最后一个元素的值，就是第20个月的兔子对数
        System.out.println(arr[19]);
    }
}
