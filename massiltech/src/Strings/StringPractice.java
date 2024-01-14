package Strings;

public class StringPractice {

    public static void main(String [] args){

        //StringBuffer------>used in multithreaded environment
        StringBuffer sb1=new StringBuffer("monesh");   //20
        StringBuffer sb2=new StringBuffer("monesh");   //25
        System.out.println(sb1==sb2);
        sb1=sb1.append("vijay");                      //20
        System.out.println(sb1==sb2);
        StringBuffer sb3=new StringBuffer("moneshvijay");   //29
        System.out.println(sb1==sb3);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");

        //StringBuilder------->used in single thread or normal environment
        StringBuilder sbc1=new StringBuilder("monesh");   //78
        StringBuilder sbc2=new StringBuilder("monesh");  //79
        System.out.println(sbc1==sbc2);
        sbc1=sbc1.append("vijay");                       //78
        System.out.println(sbc1==sbc2);
        StringBuilder sbc3=new StringBuilder("moneshvijay"); //80
        System.out.println(sbc1==sbc3);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");


        String s1="monesh";            //52
        String s2="monesh";            //57
        System.out.println(s1==s2);
         s1=s1 +"vijay";               //45
         System.out.println(s1==s2);
         String s3="moneshvijay";       //14
         System.out.println(s1==s3);

    }

}
