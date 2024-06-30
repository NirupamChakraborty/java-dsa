package com.nirupam;

import java.util.Scanner;

public class temperature_program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter temperature in C : ");
        float tempC = input.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println(tempF);
    }
}
