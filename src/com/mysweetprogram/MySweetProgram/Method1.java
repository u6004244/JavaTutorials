package com.mysweetprogram.MySweetProgram;

public class Method1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println();//让它20个换一个行
        }
    }
}

/*
定义格式：

public static void 方法名称（){
     方法体
}

调用格式：
方法名称（）；

注意事项，
1。方法定义的先后顺序无所谓
2。方法定义必须是挨着的，不能在一个方法的内部定义另外一个方法
3。方法定义后，自己不会执行，要调用方法
 */