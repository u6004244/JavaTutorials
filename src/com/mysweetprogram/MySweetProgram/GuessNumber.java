package com.mysweetprogram.MySweetProgram;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1; // 1-100, 在括号里加1是0-100
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Enter your guess number: ");
            int guessNum = scanner.nextInt(); // 键盘输入猜测的数字

            if (guessNum > randomNum) {
                System.out.println("go smaller, try again");
            } else if (guessNum < randomNum) {
                System.out.println("go bigger, try again");
            } else {
                System.out.println("bingo!!!");
                break;//如果猜中，游戏结束，不再重试
            }
        }
        System.out.println("Congratulation！");
    }

}

/*
题目
用代码模拟数字的小游戏

思路
1。 需要产生一个随机的数字，并且一旦产生不再变化。用Random的nextInt方法
2。 需要键盘输入，所以用到了Scanner
3。 获取键盘输入的数字，用Scanner中的nextInt的方法
4。 已经得到了两个数字，判断一下（if）
    如果太大了，提示太大，并且重试
    如果太小了，提示太小，并且重试
    如果猜中了，游戏结束
5。 重试就是再来一次，循环次数不确定，用while（true）
 */
