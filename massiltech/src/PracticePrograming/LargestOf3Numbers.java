package PracticePrograming;

import java.util.Scanner;

public class LargestOf3Numbers {

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int a=sc.nextInt();
        System.out.println("enter the second number:");
        int b=sc.nextInt();
        System.out.println("enter the third number:");
        int c=sc.nextInt();
//        if(a>b && a>c){
//            System.out.println(a+" "+"is greater number ");
//        } else if (b>a && b>c) {
//            System.out.println(b+" "+"is greater number ");
//
//        }
//        else {
//            System.out.println(c+" "+"is greater number ");
//        }


        //ternary operator in multi line
//        int largest1=a>b?a:b;
//        int largest2=c>largest1?c:largest1;
//
//        System.out.println(largest2+" "+"is the largest number");

        //ternary operator in single line compare largest2 in above code
        int largest=c>(a>b?a:b)?c:(a>b?a:b);
        System.out.println(largest+" "+"is the largest number");





    }

}
