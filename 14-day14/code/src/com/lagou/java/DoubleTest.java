package com.lagou.java;

public class DoubleTest {
    public static void main(String[] args) {
        // 在java5之前装箱和拆箱的测试
        Double db1 = Double.valueOf("3.14"); // 装箱操作
        System.out.println("double装箱"+db1);
        double db2 = db1.doubleValue(); // 拆箱操作
        System.out.println("double拆箱"+db2);
        // 从java5开始实现自动装箱和自动拆箱
        Double db3 = 3.1415926; // 自动装箱
        double db4 = db3;  // 自动拆箱
        System.out.println(db4);
        //实现静态方法和成员方法的使用
        double db5 = Double.parseDouble("3.14");
        System.out.println(db5);
        System.out.println("打印结果是否是非数字"+db1.isNaN()); // 判断是否是非数字

    }
}
