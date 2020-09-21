package com.company;

import java.util.Scanner;

public class EndOfLessons {
    public  void EndOfLessons(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lesson (from 1 to 10): ");
        int num_of_lesson = input.nextInt();
        int res = num_of_lesson * 45 + (num_of_lesson / 2) * 5 + ((num_of_lesson+1) / 2-1) *15;
        System.out.println("Time of the end: " + num_of_lesson/60 + "." + num_of_lesson % 60);


    }
}
