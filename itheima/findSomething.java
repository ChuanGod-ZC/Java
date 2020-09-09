package com.itheima;

import java.util.Scanner;

public class findSomething {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要查找的数据：");
        int number = sc.nextInt();

        //调用方法
        int index = getIndex(arr, number);

        //定义一个索引变量，初始值为-1
//        int index = -1;
//
//        for(int x=0; x<arr.length; x++) {
//            if(arr[x] == number) {
//                index = x;
//                break;
//            }
//        }

        System.out.println("index:" + index);
    }

    public static int getIndex(int[] arr, int number) {
        int index = -1;

        for(int x=0; x<arr.length; x++) {
            if(arr[x] == number) {
                index = x;
                break;
            }
        }

        //返回索引
        return index;
    }
}
