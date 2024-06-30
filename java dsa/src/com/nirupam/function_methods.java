package com.nirupam;

import java.util.Scanner;

import static java.lang.Long.sum;

public class function_methods {
        public static void main(String[] args) {
        //Q. take input of 2 numbers and  print the sum

           // int ans = sum2();
            // System.out.println(ans);

            int ans = sum3(90, 99);
            System.out.println(ans);

        }

        // pass the value of numbers when you are calling the method in main()
              static int sum3 (int a, int b){
            int sum = a + b;
            return sum;
              }

            static void sum() {

                Scanner input = new Scanner(System.in);
                System.out.println("enter number 1 ");
                int  num1 = input.nextInt();
                System.out.println("enter number 2 ");
                int num2 = input.nextInt();
                int sum = num1 + num2;
                System.out.println(sum);

    }



//    RETURN THE VALUE
    static int sum2() {

        Scanner input = new Scanner(System.in);
        System.out.println("enter number 1 ");
        int num1 = input.nextInt();
        System.out.println("enter number 2 ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        return sum;
        //return means function over
    }
    /*
    access modifier (we'll look in OOP) return_type name() {
             //body
             return statement;
             }

             //generally when not inside class it is written as

             return_type name() {
             //body
             return statement;
             }
     */

}
