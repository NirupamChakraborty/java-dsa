package com.nirupam;

import java.sql.SQLOutput;
import java.util.Scanner;

public class greet_functionStrings {
    public static void main(String[] args) {
      //  String message = greet();
      //  System.out.println(message);
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name");
        String name = input.next();
        String personalised = myGreeting(name);

       // String personalised = myGreeting("Nirupam Chakraborty" );
        System.out.println(personalised);
    }

    static String myGreeting(String name) {
        String message = "hello " + name;
        return message;
    }


    //return a string
    static String greet(){
        String greeting = "how are you ";
                return greeting;
    }
}
