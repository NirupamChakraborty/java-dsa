package com.nirupam.binary_search;
// Q.    https://leetcode.com/problems/find-smallest-letter-greater-than-target/
//leetcode 744
public class Question_1 {
    // non decreasing means increasing
    //  wrap around means that if the r=target is not available then return the arr[0]
    public static void main(String[] args) {

    }

    public char nextGreatestLetter(char[] letters, char target) {

            int start = 0;
            int end = letters.length - 1 ;

            while (start <= end){
//            find the middle element
//            int mid = (start + end) / 2 ;  might be possible that (start + end )  exceed the range of integers in java

                int mid = start + (end - start) / 2 ;

                if (target < letters[mid]) {
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }

            }
            return letters[start % letters.length];
    }

}

