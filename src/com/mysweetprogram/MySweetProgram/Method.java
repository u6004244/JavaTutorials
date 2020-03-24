package com.mysweetprogram.MySweetProgram;

public class Method {
    public static void main(String[] args) {
        cook();//在main中调用了cook
        seller();//调用seller的方法
        me();//调用我的方法

    }

    public static void me(){

    }

    public static void seller(){

    }

    public static void cook(){

    }


}



//定义一个方法的格式
//public static void 方法名称（）{小括号固定留空
//   方法体；
//}

//方法名称的命名为规则和变量是一样的
//方法体：也就是大括号中可以包含任意语句

//注意事项
//1. 方法定义的先后顺序无所谓
//2. 方法定义不能产生嵌套关系
//3. 如果要执行已经定义好的方法一定要调用

//如何调用方法
//. 1. 调用格式： 方法名称()；