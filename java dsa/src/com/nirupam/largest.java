package com.nirupam;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();


        //Q. Find the largest of three numbers
     /*   int max = a;
        if ( b > max){
            max = b ;
        }
        if (c > max){
            max = c;
        }
        System.out.println(max);

      */
//        another method is to use Math class in java
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
