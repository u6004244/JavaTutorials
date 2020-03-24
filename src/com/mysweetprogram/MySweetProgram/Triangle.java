package com.mysweetprogram.MySweetProgram;

public class Triangle {
    public static void main(String[] args) {//which is counting down form 9 to 0


        for (int i = 9; i > 0; i--) {
            for (int k = i - 1; k >= 0; k--) {
                System.out.print("_");
            }
            System.out.print("*");
            if(i != 9 ) {
                for (int k = 7 - i; k >= 0; k--) {
                    System.out.print("__");
                }
                System.out.print("_");

                System.out.println("*");
            }
            if(i == 9){
                System.out.println(" ");
            }
        }
        for(int i = 19; i > 0; i--) {
            System.out.print("*");
        }
    }
}


// read form console


// the insider loop which will print the 9 to 0 in once in a line
// the outer loop will repeat it 10 times in 10 lines
//    public static void main(StringDefine[] args) {
//        for(int i = 9; i >= 0; i--){ //which is counting down form 9 to 0
//            for(int k = 9; k >= 0; k--) { //initialize a new variable
//                System.out.print(k + " ");//not using the print line and just using the print, which will print in a one line
//            }
//            System.out.println();
//        }
//    }