package com.lagou.java;

public class MathTest {
    public static void main(String[] args) {
        System.out.println("获取两个整数最大值的结果："+Math.max(123,567));
        System.out.println("获取两个整数最小值的结果："+Math.min(123,34));
        System.out.println("获取次方的结果："+Math.pow(2,3));
        System.out.println("获取绝对值的结果:"+Math.abs(-5));
        System.out.println("进行四舍五入的结果："+Math.round(3.14)); // 3
        System.out.println("该整数的平方根是："+Math.sqrt(16)); // 4.0
        System.out.println("生成随机数："+Math.random());
    }
}
