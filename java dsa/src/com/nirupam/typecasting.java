package com.nirupam;

public class typecasting{
    public static void main(String[] args) {
//    casting into compatible types
//        type casting
        int num=(int)(99.999);
        System.out.println(num);
//        automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte) (a); // 257 % 256 = 1


        byte a = 90;
        byte b = 99;
        byte c = 100;
        float d = (float) (a+b) / c;
        System.out.println(d);


        int number = 'A';
        System.out.println(number);
//        java follows unicode values means that it can print in any language like it canb print namaste in hindi


//        byte, short, char values are promoted to intergers
//    if any operand is of higher value them it will give that higher value
//        int * float will give float

        if (true){
            System.out.println("hello world");
        }
    }
}
