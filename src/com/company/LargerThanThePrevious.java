package com.company;

import java.util.Scanner;

public class LargerThanThePrevious {
    public void Larger(){
        Scanner input = new Scanner(System.in);
        System.out.print("The length of array: ");
        int n = input.nextInt();
        int array[] = new int[n];
        System.out.println("Enter number for array: ");
        for(int i = 0; i < n; i++){
            array[i] = input.nextInt();
        }
        int count = 0;
        for(int i = 0, j = 1; i < n; i++) {
            if(array[i] < array[j]){
                if(j == n-1){
                    j--;
                }
                else {
                    count++;
                    j++;
                }
            }
        }
        System.out.println(count);
    }
}
