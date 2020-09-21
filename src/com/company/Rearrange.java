package com.company;

import java.util.Scanner;

public class Rearrange {
    public void rearrange(){
        Scanner input = new Scanner(System.in);
        System.out.print("The length of array: ");
        int n = input.nextInt();
        int array[] = new int[n];
        System.out.println("Enter number for array: ");
        for(int i = 0; i < n; i++){
            array[i] = input.nextInt();
        }
        if(n % 2 ==0) {
            for (int i = 0, j = 1; i < n - 1; i += 2) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j += 2;
            }
        }
        else{
            for(int i = 0, j = 1; i < n; i += 2){
                if(j == n){
                    break;
                }
                else{
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    j += 2;
                }
            }
        }
        System.out.print("New array: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
