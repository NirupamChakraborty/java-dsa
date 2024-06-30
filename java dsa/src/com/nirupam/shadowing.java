package com.nirupam;

public class shadowing {
    static int x = 90;  // this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); //90

      /*
        int x = 99;
        System.out.println(x); //99
        fun();
*/
        int x;
       // System.out.println(x); Scope will begin when value is initialised
        x = 99;
    }
    static void fun(){
        System.out.println(x);
    }
}
