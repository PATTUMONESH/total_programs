package PracticePrograming;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args){
//        String str="monesh";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String str=sc.next();

        String rev="";
        String org_str=str;
        int len=str.length();
        for (int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if (org_str==rev){
            System.out.println(rev+" "+"is a palindrome string");
        }
        else {
            System.out.println(rev+" "+"is not a palindrome string");
        }


    }
}
