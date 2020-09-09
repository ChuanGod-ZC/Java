package com.itheima;

public class overSeven {
    public static void main(String[] args) {
        //数据在1-100之间，用for循环实现数据的获取
        for(int x=1; x<100; x++) {
            if(x%10==7 || x/10%10==7 || x%7==0) {
                System.out.println(x);
            }
        }
    }
}
