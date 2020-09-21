package com.company;

import java.util.Scanner;

public class LargeNeighbors {
    public void Large(){
        Scanner input = new Scanner(System.in);
        System.out.print("The length of array: ");
        int n = input.nextInt();
        int array[] = new int[n];
        System.out.println("Enter number for array: ");
        for(int i = 0; i < n; i++){
            array[i] = input.nextInt();
        }
        int count = 0;
        for (int i = 1, j = 0, k = 2; i < n; i++) {
            if(k >= n)
            {
                break;
            }
            else {
                if(array[j] < array[i] && array[i] > array[k]){
                    count++;
                }
            }
            j++;
            k++;
        }
        System.out.println(count);
    }
}
