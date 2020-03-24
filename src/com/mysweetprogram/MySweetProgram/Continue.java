package com.mysweetprogram.MySweetProgram;

public class Continue {
    public static void main(String[] args) {
        for(int i = 1; i<=10; i++) {
            if(i==4){ //如果当前是第四层
                continue;// 那么跳过当前循环，马上开始下一次（第五层）
            }
            System.out.println("level" + i);
        }
    }

    public static void aBreak(){
        for (int i = 1; i<=10; i++){
            //如果希望从第四次开始，后续全部不要了，就要打断循环
            if (i==4){//如果当前是第四次
                break; //就打断整个循环
            }
            System.out.println("Hello"+ i);
        }
    }


}
/*
break 关键字的用法有常见的两种：
1。 可以用在switch语句中，一旦执行，整个switch语句立刻结束
2。 还可以用在循环语句中，一旦执行，整个循环语句立刻结束，打断循环

continue
1。 一旦执行，立刻跳过当前循环剩余内容，马上开始下一次循环

break and continue key difference
continue 只是当前的一个没有了 之后的不受任何影响
break 是从当前这个开始（包括当前这个）往后的都没有了

关于循环选择的建议：
凡是次数确定的场景多用for循环，否则多用while循环
 */