package com.nirupam;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimArray {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9
         */

      //  int[][] arr = new int[3][];
//        int [][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//               {6, 7, 8}
//        };
        Scanner input = new Scanner(System.in);
//        int[][] arr2D = {
//                {1,2,3},  //0th index
 //               {4,5},     //1st index
//                {6,7,8,9}   //2nd index -> arr2Dp[2] = {6,7,8,9}
//        };


        int[][] arr = new int[3][3];
        System.out.println(arr.length);   // this will give number of rows

        //INPUT

        for (int row = 0; row < arr.length; row++) {
            //for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] =input.nextInt();
            }

        }
//         OUTPUT
        for (int row = 0; row < arr.length; row++) {
            //for each column in every row
            for (int col = 0; col < arr[row].length; col++) {

                System.out.print(arr[row][col] +" ");
            }
            System.out.println();
        }



        // using to string


        //         OUTPUT
        for (int row = 0; row < arr.length; row++) {
            //for each column in every row

            System.out.println(Arrays.toString(arr[row]));
        }



        // using enhanced for loop ( for each loop)

        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
