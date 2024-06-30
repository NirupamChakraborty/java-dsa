package com.nirupam;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.println("enter two numbers");
        Scanner input = new Scanner(System.in);
        int num1= input.nextInt();
        int num2 = input.nextInt();
        int sum= num1 + num2;
        System.out.println("sum is " +sum);



        float num3= input.nextFloat();
        float num4 = input.nextFloat();
        float sum2= num3 + num4;
        System.out.println("sum is " +sum2);

    }
}
