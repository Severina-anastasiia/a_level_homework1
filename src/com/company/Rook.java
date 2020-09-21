package com.company;

import java.util.Scanner;

public class Rook {
    public void Rook(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter position of rook: ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        System.out.print("Enter position of different figure: ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        if(x1 == x2 ^ y1 == y2) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
