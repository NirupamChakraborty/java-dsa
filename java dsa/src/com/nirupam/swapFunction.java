package com.nirupam;

public class swapFunction {
    public static void main(String[] args) {
        int a = 80;
        int b = 90;

        //swap numbers code
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a+ " " +b);
        
        String name = "Nirupam Chakraborty";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String naam) {
        naam = "Rahul";  // java does not have reference only pass by value

    }
    static  void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;

        //this will chsnge only be valid in this function scope only
    }
}
