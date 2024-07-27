package com.nirupam.searching;

public class search_in_range {
    public static void main(String[] args) {
        int[] arr = { 18, 12, -7, 3, 14, 28};
        int target = 3;
        System.out.println(linearSearch(arr,3,1,4));

    }
    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        // run a for loop
        for (int i = 0; i < arr.length; i++) {
//          check for element at every index if it is the target
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        // this line will execute if none of the return statements above have executes
        // hence the target not found
        return -1;
    }
}
