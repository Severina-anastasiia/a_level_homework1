package com.company;

import java.util.Scanner;

public class Rally {
    public void Rally(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two number (from 0 to 10000: ");
        int n = input.nextInt();
        int m = input.nextInt();
        int res = m / n;
        int temp = m % n;
        switch (temp){
            case 0:
                break;
            default:
                res++;
                break;
        }
        System.out.println("You need " + res + " day(s)");
    }
}
