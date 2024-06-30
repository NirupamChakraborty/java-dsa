package com.nirupam;

import java.util.Arrays;

public class changeValue {
    public static void main(String[] args) {
        // create an array
        int [] arr = {1, 2, 3, 46, 99};
        change(arr);
        System.out.println(Arrays.toString(arr));  //takes array and return string
    }
    static void change(int[] nums){
        nums[0] = 90;
    }
}
