package com.lagou.java;

import java.math.BigDecimal;
import java.math.RoundingMode; // 用来进行四舍五入等

public class BigDecimalTest {
    public static void main(String[] args) {
        // 构造BigDecimal类的两个对象
        BigDecimal bd1 = new BigDecimal("5.2");
        BigDecimal bd2 = new BigDecimal("1.3");
        // 构造完毕的对象实现加减乘除的运算
        System.out.println("实现加法运算的结果"+bd1.add(bd2));
        System.out.println("实现减法运算的结果"+bd1.subtract(bd2));
        System.out.println("实现乘法运算的结果"+bd1.multiply(bd2));
        System.out.println("实现除法运算的结果"+bd1.divide(bd2));
        // 实现精确运算
        System.out.println(0.1+0.2);
        BigDecimal bd3 = new BigDecimal("0.1");
        BigDecimal bd4 = new BigDecimal("0.2");
        System.out.println("精确计算的结果："+bd3.add(bd4)); // 实现精确运算
        // 注意事项
        BigDecimal bd5 = new BigDecimal("2");
        BigDecimal bd6 = new BigDecimal("0.3");
        System.out.println(bd5.divide(bd6, RoundingMode.HALF_UP)); // 会报错无法精确运算 Non-terminating decimal expansion; no exact representable decimal result
    }
}
