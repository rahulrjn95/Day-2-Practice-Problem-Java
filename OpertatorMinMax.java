package com.bridgelabz;

public class OpertatorMinMax {
    public static void main(String[] args){
        int a=20,b=14,c=40;
        int d=a+b*c;
        int e=c+a/b;
        int f=a%b+c;
        int g=a*b+c;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        if(d>e && d>f && d>g)
        {
            System.out.println("The max value is:" + d);
        }
        if(e>d && e>f && e>g){
            System.out.println("The max value is:" + e);
        }
        if(f>d && f>e && f>g){
            System.out.println("The max value is:" + f);
        }
        if(g>d && g>e && g>f){
            System.out.println("The max value is:" + g);
        }
        if(d<e && d<f && d<g)
        {
            System.out.println("The min value is:" + d);
        }
        if(e<d && e<f && e<g){
            System.out.println("The min value is:" + e);
        }
        if(f<d && f<e && f<g){
            System.out.println("The min value is:" + f);
        }
        if(g<d && g<e && g<f){
            System.out.println("The min value is:" + g);
        }

    }
}
