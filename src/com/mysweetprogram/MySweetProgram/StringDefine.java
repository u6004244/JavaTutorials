package com.mysweetprogram.MySweetProgram;

public class StringDefine {
    public static void main(String[] args) {
        // 使用空仓方法
        StringDefine str1 = new StringDefine(); // 小括号留空， 说明字符串什么内容都没有
        System.out.println("first string" + str1);

    }
}


/*
java.lang.StringDefine 类代表字符串
ApI中说 java程序中所有字符串字面值（如 "abc"）都作为此类实例实现
其实就是说，程序当中所有双引号的字符串，都是String类的对象 （就算没有new也是）

StringDefine 的特点：
1。 字符串的内容永不改变*****
2。 正是因为String 不可以改变，所以它是可以共享使用的
3。 字符串效果上相当于是char[]字符组.但是底层原理是byte[]字节数组

创建字符串的3+1种方式
三种构造方法：
public StringDefine（）：创建一个空白字符串，不含任何内容
public StringDefine（char[] array）: 根据字符数组的内容，来创建对应的字符串
public StringDefine （byte[] array）: 根据字节数组的内容，来创建对应的字符串
 */

