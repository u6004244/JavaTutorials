package com.mysweetprogram.MySweetProgram;

import java.util.Scanner;

public class Stringcomparison {
    public static void main(String[] args) {
        String password = "let me in";
        System.out.println("Guess the password:");

        //input
        Scanner scanner = new Scanner(System.in);
        java.lang.String guess = scanner.nextLine();
        System.out.println(password.equals(guess));

        //password == guess //this is actually compare the memory location of the two
        System.out.println(password == guess);
        //primitive - this works
        String a = "hi";
        String b = "hi";
        System.out.println(a == b);

        //StringDefine a = new StringDefine("hi");
        //StringDefine b = new StringDefine("hi");
        //System.out.println(a == b); which is false, because it compare the two objects

        int x =10;
        int y = 10;
        System.out.println(x == y);//which is true, compare the values

        //objects - this does not work
        //values of objects is a reference to the object
    }
}