package com.nirupam;

import javax.swing.text.DefaultEditorKit;
import java.util.Scanner;

public class nestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int employeeID = input.nextInt();

        String department = input.next();

        switch (employeeID) {
            case 1 -> System.out.println("Nirupam Chakraborty");
            case 2 -> System.out.println("sonu bhai");
            case 3 -> {
                System.out.println("Employee number 3 ");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("Invalid department");
                }
            }
        }

    }
}
