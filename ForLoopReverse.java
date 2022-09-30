package com.bridgelabz;

//Write a Program to Reverse the integer number  eg. Input n=321 reverse is 123.

public class ForLoopReverse {
    public static void main(String args[]){
        int reverse=0 ,a,n=987654321;
        for( ;n!=0;){
            a=n%10;
            reverse=(reverse*10)+a;
            n=n/10;
        }
        System.out.println("Reverse of number is= "+reverse);
    }
}
