package com.nirupam;

import java.util.Arrays;
import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
//      ARRAY OF PRIMITIVES
        int[] arr = new int[5];
      /*  arr[0] = 66;
        arr[1] = 77;
        arr[2] = 88;
        arr[3] = 99;
        arr[4] = 100;
        arr[5] = 999;
        // [66,77,88,99,100,999]
        System.out.println(arr[3]);
*/

        Scanner input = new Scanner(System.in);

        // input using for loops
//        for (int i = 0; i < arr.length; i++) {
 //           arr[i] = input.nextInt();
 //       }
        /*
        // print the output
       //  for (int i = 0; i < arr.length; i++) {
        //   System.out.print(arr[i] + " ");
       //    }


        //for each loop
        for (int num : arr){  // for every element in array , print the elements
            System.out.println(num);
        }

         */
//        System.out.println(Arrays.toString(arr));


      //  System.out.println(arr[5]); out of bound error if index is upto 4 you cant print index 5


        // ARRAY OF OBJECTS

        String [] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));

        // modify
        str[3] = "Nirupam";
        System.out.println(Arrays.toString(str));
    }
}
