package com.company;

import java.util.Scanner;

public class Snail {
    public void Snail(){
        int h, a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three number: ");
        h = input.nextInt();
        a = input.nextInt();
        b = input.nextInt();
        int days = (h - a - 1) / (a - b + 2);
        System.out.println(days + "day(s) need snail to clibm");
    }
}
