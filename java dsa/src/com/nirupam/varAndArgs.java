package com.nirupam;

import java.util.Arrays;
// variable length arguments
//variable arguments -> when we dont know how many arguments we have to give
public class varAndArgs {
    public static void main(String[] args) {

      //fun(2,3,4,5,6,7,8,99);
        multiple(2,3,"Som","Sonu","Nirupam");

    }
    static void fun(int ...v) { // it takes array of integers / you can also give strings. you can give v or any alphabet
        System.out.println(Arrays.toString(v));
    }
    // we can also take multiple types of arguments
        static void multiple(int a, int b , String ...v){ // variable length arguments only in the lasr

        }

}
