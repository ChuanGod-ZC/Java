package com.itheima;

public class overAgain {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};

        //反转数组内元素
        reverse(arr);

        //遍历数组
        printArray(arr);
    }


    public static void reverse(int[] arr) {
        for(int start=0,end=arr.length-1; start<=end; start++,end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

    public static void printArray(int[] arr) {
        System.out.print("[");

        for(int x=0; x<arr.length; x++) {
            if(x == arr.length - 1) {
                System.out.print(arr[x]);
            } else {
                System.out.print(arr[x] + ",");
            }
        }

        System.out.println("]");
    }
}
