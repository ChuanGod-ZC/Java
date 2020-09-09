package com.itheima;

public class Return {
//      just return for one
//    public static void main(String[] args) {
//
//        boolean flag = isEvenNumber(10);
//        System.out.println(flag);
//    }
//    public static boolean isEvenNumber(int number) {
//        if(number%2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    public static void main(String[] args) {
        int result = getMax(20, 10);
        System.out.println(result);
        System.out.println(getMax(20, 10));
        System.out.println();
        System.out.print(20);
    }
    public static int getMax(int a, int b) {
        if(a > b) {
             return a;
        } else {
            return b;
        }
    }
}
