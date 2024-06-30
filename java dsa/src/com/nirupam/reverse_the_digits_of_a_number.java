package com.nirupam;

public class reverse_the_digits_of_a_number {
    public static void main(String[] args) {
        int num = 123456789;

        int answer = 0;

        while (num > 0){
            int remainder = num % 10;
            num = num / 10;

            answer = answer * 10 +remainder;
        }
        System.out.println(answer);
    }
}
