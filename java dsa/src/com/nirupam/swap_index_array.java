package com.nirupam;

import java.util.Arrays;

public class swap_index_array {
    public static void main(String[] args) {
        // swap elements at indices
        int[] arr ={ 1, 3, 26, 99, 90};
 //       System.out.println(Arrays.toString(arr));
 //       swap(arr, 1,3);

        reverse(arr);

       System.out.println(Arrays.toString(arr));
    }


    // reverse an array

    static  void reverse(int[] arr){
        int start = 0;         // it is also called two pointer method
        int end = arr.length-1;   // size = 5 then last index = 4
        while (start < end){
            //swap
            swap(arr, start, end);
            start++;
            end--;

        }
    }



    static void swap(int [] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
