package com.bridgelabz;

import java.util.Scanner;

/*
Write a Program Spring Season.java that takes two int values m and d from commamd line
and prints TRUE if day d of a month m is between March20(m = 3,d = 20) and
June 20(m = 6, d = 20), FALSE otherwise
 */

public class OperatorSpringSeason {
    public static void main(String args[]){
        Scanner object= new Scanner(System.in);
        System.out.println("enter day and month");
        int day= object.nextInt();
        int mon= object.nextInt();
        if((mon==3 && day>=20 && day<=31))
            System.out.println("True");
        else if((mon==4 && day>=1 && day<=30))
            System.out.println("True");
        else if((mon==5 && day>=1 && day<=31))
            System.out.println("True");
        else if((mon==6 && day>=1 && day<=20))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
