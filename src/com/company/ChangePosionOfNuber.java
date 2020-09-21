package com.company;

import java.util.Scanner;

public class ChangePosionOfNuber {
    public void ChangePosionOfNumber(){
        int a, b, temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = input.nextInt();
        System.out.print("Enter second number: ");
        b = input.nextInt();
        temp = b;
        b = a;
        a = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
