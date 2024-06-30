package com.nirupam;

import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // int n = input.nextInt();
       // System.out.println(isArmStrong(n));
        for (int i = 100; i < 1000; i++) {
            if(isArmStrong(i)){
                System.out.println(i +" ");
            }

        }
    }

    // print all three digit armstrong numbers
    static boolean isArmStrong(int n){
        int original = n;
        int sum = 0;
        while(n > 0){
            int remainder = n % 10;
            n = n /10;
            sum = sum + remainder*remainder*remainder;
        }
        return sum == original; //it will return true if armstrong.
    }
}
