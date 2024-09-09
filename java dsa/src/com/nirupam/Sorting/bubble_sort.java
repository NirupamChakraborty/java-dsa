package com.nirupam.Sorting;

import java.util.Arrays;


public class bubble_sort {
    public static void main (String[] args) {
        int[] arr ={1,2,4,5,3,9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
//    void is because mo new array is created, nio new array is returned
    static void bubbleSort(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;

            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }


            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            //break;
            if (!swapped){  // not false or !false = true
                break;
            }
        }
    }
}
