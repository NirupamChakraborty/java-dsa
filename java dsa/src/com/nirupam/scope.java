package com.nirupam;

import com.sun.security.jgss.GSSUtil;

public class scope {
    public static void main(String[] args) {
        // scope means you can access the something inside the function
        int a = 10;
        int b = 20;
        String name = "Nirupam";
        //block scope
        {
            // int a = 90 is an error because you cannot initialise the same variable but you can modify it
            a = 90;
            System.out.println(a);  //reassign the original ref variable to some other value
            //values initialised in this block , will remain in block
            int c = 99;
            name = "Sonu";
            System.out.println(name);
        }
        int c = 999; // anything initiatised inside the box can be initialised outside the box once again
  //      System.out.println(c); // cannot use outside the block
        System.out.println(a);
        System.out.println(name);

        //scoping in for loop
        for (int i = 0;  i < 5 ; i++) {
            System.out.println(i);
            int num = 99;

        }
      //  System.out.println(i); cant print outside
    }
    static void random(int marks){
        int num = 99;
        System.out.println(num);
        System.out.println(marks);
    }
}
