package com.nirupam;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {


       /* Syntax for for loop
       for(initialisation, condition, increment/decrement){
              // body
           }
        */
        //       print 1 to 5
//        for (int num=1; num<=5; num++){
//            System.out.println(num);
//        }

//       print number from 1 to n
//        Scanner input =new Scanner(System.in);
//        int n = input.nextInt();
//        for (int num = 0; num <= n ; num++) {
//            System.out.println(num);
//            System.out.println("hello world");
//
//        }
        //while loop syntax
        /*
        while (condition){
           //body
           }
             for(initialisation, condition, increment/decrement){
              // body
           }
         */
        int num = 1; //initialisation out side the body
        while (num<=5){    // condition
            System.out.println(num); //body
            num++;     //increment/decrement
        }
//        use for loop when you know how many times the loop is going to run
//    like print 1 to 5 and use while loop whem you dont know how many times the loops is going to run
//        like run the loop untill user press aa.


        //do while loop
        /*
        do{
          }
          while (condition);
         */
        int  n = 1  ; //initialisation
        do {
            System.out.println("hello world");  //body
        }
        while (n!=1);  //condition

//        do while loop will run atleast once like take input form user untill press aaa

    }
}
