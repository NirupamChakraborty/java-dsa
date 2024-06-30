package com.nirupam;

public class digits_in_number {
    public static void main(String[] args) {
        int n = 254554;
        int count = 0;
        while (n > 0) {

            int remainder = n % 10;
            if (remainder == 5) {
                count++;
            }
            n = n / 10 ; //  n/=10
        }
        System.out.println(count);

    }
}
