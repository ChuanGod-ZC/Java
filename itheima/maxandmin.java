package com.itheima;

public class maxandmin {
    //max
    public static void main(String[] args) {
        int[] arr = {12, 23, 43, 54, 64, 42, 87};

        int max = arr[0];

        for(int x=0; x<arr.length; x++) {
            if(arr[x] > max) {
                max = arr[x];
            }
        }

        System.out.println("max:" + max);
    }

    //min
//    public static void main(String[] args) {
//        int[] arr = {12, 23, 43, 54, 64, 42, 87};
//
//        int min = arr[0];
//
//        for(int x=0; x<arr.length; x++) {
//            if(arr[x] < min) {
//                min = arr[x];
//            }
//        }
//
//        System.out.println("min:" + min);
//    }
}
