package com.bridgelabz;

//Write a Program to Reverse the Integer number eg. Input n=321 reverse is 123.

public class WhileLoopReverse {
    public static void main(String args[])
    {
        int number =9876543, r=0;
        while(number!=0)
        {
            int remainder = number%10;
            r=r*10+remainder;
            number=number/10;
        }
        System.out.println("The reverse of given number is:"+r);
    }
}
