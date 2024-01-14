package PracticePrograming;

import java.util.Scanner;

public class ReverseNumber {


    public static void main(String[] args){
        //logic1----using alogorithm
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();



        //logic1----using alogorithm
//        int rev=0;
//        while(num!=0){
//             rev=rev*10 + num%10;
//             num=num/10;
//        }
//        System.out.println(rev);

        //logic2---using StringBuffer class
//        StringBuffer rev;
//        StringBuffer sb=new StringBuffer(String.valueOf(num));
//        rev=sb.reverse();
//        System.out.println(rev);

    //logic3---using StringBuilder class
        StringBuilder sbl=new StringBuilder();
        sbl.append(num);
        StringBuilder rev=sbl.reverse();
        System.out.println(rev);


    }
}
