package com.nirupam;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //take input from the user untill user does not press X or x
       int ans = 0;
        while (true){
            System.out.println("Enter operator");
            //take the operator as input
            char op = input.next().trim().charAt(0);
            if (op == '+' || op =='-' || op == '/' || op == '*' || op =='%' ){
                //take input of two numbers
                System.out.println("Enter any two numbers");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (op =='+'){
                    ans = num1 + num2;
                }
                if (op =='-'){
                    ans = num1 - num2;
                }
                if (op =='/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op =='*'){
                    ans = num1 * num2;
                }
                if (op =='%'){
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
              break;
            } else {
                System.out.println("Invalid operation");
            }
            System.out.println(ans);
        }

    }



}
