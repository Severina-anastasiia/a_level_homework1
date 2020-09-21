package com.company;

import java.util.Scanner;

public class TimeDifference {
    public void TimeDifference(){
        Scanner input = new Scanner(System.in);
        int hour1, minute1, second1, hour2, minute2, second2;
        for(;;) {
            System.out.print("Enter hour of the first time: ");
            hour1 = input.nextInt();
            if(hour1 >= 0 && hour1 <= 23)
                break;
        }
        for(;;) {
            System.out.print("Enter minutes of the first time: ");
            minute1 = input.nextInt();
            if(minute1 >= 0 && minute1 <= 59)
                break;
        }
        for(;;) {
            System.out.print("Enter seconds of the first time: ");
            second1 = input.nextInt();
            if(second1 >= 0 && second1 <= 59)
                break;
        }
        for(;;) {
            System.out.print("Enter hour of the second time: ");
            hour2 = input.nextInt();
            if(hour2 >= 0 && hour2 <= 23 && hour1 <= hour2)
                break;
        }
        for(;;) {
            System.out.print("Enter minutes of the second time: ");
            minute2 = input.nextInt();
            if(minute2 >= 0 && minute2 <= 59 && minute1 <= minute2)
                break;
        }
        for(;;) {
            System.out.print("Enter seconds of the second time: ");
            second2 = input.nextInt();
            if(second2 >= 0 && second2 <= 59 && second1 <= second2)
                break;
        }
        int alltime1 = hour1 * 3600 + minute1 * 60 + second1;
        int alltime2 = hour2 * 3600 + minute2 * 60 + second2;
        System.out.println("The time difference: " + (alltime2 - alltime1));
    }
}
