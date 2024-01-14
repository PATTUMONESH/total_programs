package PracticePrograming;

public class Swaping2Numbers {


    public static void main(String[] args){
        //logic1---using third variable
//        int a=10;
//        int b=20;
//        System.out.println("before swaping:"+a+" "+b);
//        int t=a;
//        a=b;
//        b=t;
//
//        System.out.println("after swaping:"+a+" "+b);

        //logic2---using "+" & "-" without using third variable
//        int a=10;
//        int b=20;
//        System.out.println("before swaping:"+a+" "+b);
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println("after swaping:"+a+" "+b);

        //logic3----using "*" and "/" without using third variable -->here a & b values should not be zero
//        int a=10;
//        int b=20;
//        System.out.println("before swaping:"+a+" "+b);
//        a=a*b;
//        b=a/b;
//        a=a/b;
//        System.out.println("after swaping:"+a+" "+b);

        //logic4---using bitwise XOR(^)
//        int a=10;
//       int b=20;
//        System.out.println("before swaping:"+a+" "+b);
//        a=a^b;
//        b=a^b;
//        a=a^b;
//        System.out.println("before swaping:"+a+" "+b);

        //logic5----single statement
        int a=10;
        int b=20;
        System.out.println("before swaping:"+a+" "+b);
        b=a-b+(a=b);
        System.out.println("before swaping:"+a+" "+b);






    }
}
