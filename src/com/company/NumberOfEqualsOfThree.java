package com.company;

import java.util.Scanner;

public class NumberOfEqualsOfThree {
    public void Equals(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three number: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a == b && a == c){
            System.out.println("3");
        }
        else if(a == b || a == c || b == c){
            System.out.println("2");
        }
        else {
            System.out.println("1");
        }
    }
}
