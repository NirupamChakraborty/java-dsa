package com.nirupam;

import java.util.Scanner;

public class casecheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch = input.next().trim().charAt(0);
//
// we take character input like this with the help of strings
        // trim is used to keep the first letter and trim the rest letters in the word
    //  String word = "hello";
//        System.out.println(ch);
     //   System.out.println(word.charAt(0));

        if(ch >= 'a' && ch <= 'z' ){
            System.out.println("lower case");
        }
        else {
            System.out.println("its upper case");
        }
   }
}
