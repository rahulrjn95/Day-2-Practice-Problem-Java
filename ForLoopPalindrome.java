package com.bridgelabz;

import java.util.Scanner;

/* Write a Program to find Palindrome Number
    eg.Input n=121 then after  reverse output is same 121then it's a Palindrome.
    eg.Input n=321 then after revertse output is not same it's 123 then it's not a Palindrome Number.
 */

public class ForLoopPalindrome {
    public static void main(String args[]){
        int num,t,s,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number =");
        num=sc.nextInt();
        t=num;
        for(s=0;num>0;num/=10)
        {
            rem=num%10;
            s=(s*10)+rem;
        }
        if(s==t)
            System.out.println("Given number is Palindrome");
        else
            System.out.println("Given number is not Palindrome");
    }
}
