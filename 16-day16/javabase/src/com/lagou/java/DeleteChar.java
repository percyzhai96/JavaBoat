package com.lagou.java;

public class DeleteChar {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("helloWorld");
        // 删除某个字符
        sb1.deleteCharAt(2);
        System.out.println(sb1); // 删除之后下标会向前补位
        // 删除多个字符
        for(int i=0;i<4;i++){
            sb1.deleteCharAt(i);
        }
        System.out.println(sb1);
        // 根据起始下标删除字符串
        sb1.delete(1,3);
        System.out.println(sb1);
        // 删除末尾字符串
        sb1.delete(1,sb1.length());
        System.out.println(sb1);
    }
}
