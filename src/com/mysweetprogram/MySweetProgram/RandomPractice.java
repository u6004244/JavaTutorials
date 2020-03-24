package com.mysweetprogram.MySweetProgram;

import java.util.Random;

public class RandomPractice {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
           int num = r.nextInt(10); // 范围实际上是0-9， 100次 每次从0-9中抽取一个
           System.out.println(num);
        }

    }

}
/*
RandomPractice 类用来生成随机数字
1。 导包
import java.util.RandomPractice;

2。 创建
RandomPractice r = new RandomPractice(); 小括号中留空即可

3。 使用
a. 获取一个随机的int 数字（范围是int 所有范围，有正负两种）int num = r.nextInt()
如果整个小括号留空就是int中的随机数字
b. 获取一个随机的int 数字 （参数代表了范围，左边是inclusive， 右边是exclusive）
（0，3）= 0， 1， 2。
 */