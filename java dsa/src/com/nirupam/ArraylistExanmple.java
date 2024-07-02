package com.nirupam;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExanmple {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner input = new Scanner(System.in);
//        list.add(1);
//        list.add(66);
//        list.add(77);
//        list.add(88);
//        list.add(888);
//        list.add(99);
//        list.add(999);
//        list.add(1);
//        list.add(66);
//        list.add(77);
//        list.add(88);
//        list.add(888);
//        list.add(99);
//        list.add(999);
//        list.add(1);
//        list.add(66);
//        list.add(77);
//        list.add(88);
//        list.add(888);
//        list.add(99);
//        list.add(999);


//      INPUT
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }
//      get item at any index
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i));  // pass index here, list[index] syntax will not work here
        }
        System.out.println(list);
    }
}
