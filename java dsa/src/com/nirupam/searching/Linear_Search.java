package com.nirupam.searching;

public class Linear_Search {
    public static void main(String[] args) {
        int[] nums = {55, 66, 777, 77, 88, 99, 999};
        int target = 99;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
        int ans2 = linearSearch2(nums, target);
        System.out.println(ans2);

    }
    //search in the array : return the index if item found
    // otherwise if item not found return -1

    static int linearSearch(int[] arr, int target) {
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

    // this will find the element
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // run a for loop
        for (int element : arr) {
//          check for element at every index if it is the target
            if (element == target) {
                return element;
            }
        }
        // this line will execute if none of the return statements above have executes
        // hence the target not found
        return -1;
    }
}
