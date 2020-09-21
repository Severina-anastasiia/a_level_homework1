package com.company;

import java.util.Scanner;

public class Max {
    public void Max(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two number (from 1 to 1000): ");
        int a = input.nextInt();
        int b = input.nextInt();
        int result = (a * (a / b) + b * (b / a)) / (b / a + a / b);
        System.out.println("Maximum number = " + result);
    }
}
