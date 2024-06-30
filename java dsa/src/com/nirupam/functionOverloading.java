package com.nirupam;

public class functionOverloading {
    // two or more functions with same name but different parameters
    public static void main(String[] args) {
        fun(99);
        fun("Nirupam");
       int ans= sum(9,8);
        System.out.println(ans);
      int answer =  sum(7,8,9);
        System.out.println(answer);

    }
    static int sum(int a, int b){
        return a + b;
    }
    static int sum(int a, int b, int c){
        return a + b + c;
    }
    static void fun(int a){
       System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
