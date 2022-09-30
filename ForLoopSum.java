package com.bridgelabz;

//Write a Program for the sum of n natural numbers eg. Input N=5 Output 1+2+3+4+5

public class ForLoopSum {
    public static void main(String args[]){
        int num=50 ,i, sum=0;
        for (i=1;i<=num;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of number is :"+sum);
    }
}
