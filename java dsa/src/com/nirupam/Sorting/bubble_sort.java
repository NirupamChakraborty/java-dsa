package com.nirupam.Sorting;

import java.util.Arrays;


public class bubble_sort {
    public static void main (String[] args) {
        int[] arr ={1,2,4,58,3,99,9};
//        selectionSort(arr);
//        bubbleSort(arr);
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    // INSERTION SORT
    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }

        }
    }
//     .................................................

    // SELECTION SORT
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr, maxIndex, last);

        }

    }
    static void swap(int[] arr, int first, int seacond){
        int temp = arr[first];
        arr[first] = arr[seacond];
        arr[seacond] = temp;
    }


     static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }

        }

        return max;
    }

    //    ....................................
    // BUBBLE SORT
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
