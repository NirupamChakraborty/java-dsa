package com.nirupam.binary_search;

// Q. https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//leetcode 34

public class Question_2 {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

//       check for the first occurrence of target first
         int start = search(nums, target, true);
        int end = search(nums, target,  false);

        ans[0] = start;
        ans[1] = end;
        return ans;

    }
//    this function just returns the value of the target
    int search(int[] nums, int target, boolean fintStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1 ;

        while (start <= end){
//            find the middle element
//            int mid = (start + end) / 2 ;  might be possible that (start + end )  exceed the range of integers in java

            int mid = start + (end - start) / 2 ;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else{
//               potential answer found;
//                potential ans found
                ans = mid;
                if (fintStartIndex == true){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }

            }
        }
        return ans;
    }

}
