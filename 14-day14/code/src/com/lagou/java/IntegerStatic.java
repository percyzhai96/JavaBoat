package com.lagou.java;

public class IntegerStatic {
    public static void main(String[] args) {
        // 实现静态方法的调用
        int ic = Integer.parseInt("123");
        System.out.println("数字为"+ic);
        //int ie = Integer.parseInt("1234t");
        //System.out.println("这个是会异常的"+ie); //需要注意这个会报错的java.lang.NumberFormatException
        System.out.println("字符串转换为整数形式为="+ic);
        System.out.println("根据参数指定的整数获取对应的十进制字符串是"+Integer.toString(ic));
        System.out.println("根据参数指定的整数获取对应的二进制字符串是"+Integer.toBinaryString(ic));
        System.out.println("根据参数指定的整数获取对应的八进制字符串是"+Integer.toHexString(ic));
        System.out.println("根据参数指定的整数获取对应的十六进制字符串是"+Integer.toOctalString(ic));
    }
}
