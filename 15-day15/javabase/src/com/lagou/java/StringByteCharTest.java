package com.lagou.java;

public class StringByteCharTest {
    public static void main(String[] args) {
        // 创建String类型数据
        String str = new String("Hello");
        System.out.println("str="+str);
        // 实现将String类型转为Byte类型数组
        byte[] arr = str.getBytes();
        for(int i=0;i<arr.length;i++){
            System.out.println("下标为i的元素是："+arr[i]); // 打印的ascll码值
        }
        // 将byte数组转回字符串
        String str1 = new String(arr);
        System.out.println(str1);
        // 实现将String类型转为char类型的数据并打印
        char [] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.println("打印下标为i的字符"+ch[i]);
        }
        // 将char数组转回字符串
        String str2 = new String(ch);
        System.out.println(str2);


    }
}
