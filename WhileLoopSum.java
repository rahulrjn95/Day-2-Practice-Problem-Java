package com.bridgelabz;

import java.util.Scanner;

//Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5.

public class WhileLoopSum {
        public static void main(String args[]) {
            System.out.println("Enter Natural Number:");
            Scanner obj1 = new Scanner(System.in);
            int number = obj1.nextInt();
            int sum = 0, i = 1;
            while(i<=number) {
                sum = sum + i;
                i++;
            }
            System.out.println("Sum of entered number" +sum);
        }
    }

