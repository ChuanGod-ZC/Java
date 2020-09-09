package com.itheima;

public class sameInarry {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int[] arr2 = {11, 22, 33, 33, 55};
        boolean res = compare(arr, arr2);
        System.out.println(res);
    }

    //定义一个方法，用于比较两个数组的内容是否相同
    public static boolean compare(int[] arr, int[] arr2) {
        if(arr.length != arr2.length) {
            return false;
        }

        for(int x=0; x<arr.length; x++) {
            if(arr[x] != arr2[x]) {
                return false;
            }
        }

        return true;

    }
}
