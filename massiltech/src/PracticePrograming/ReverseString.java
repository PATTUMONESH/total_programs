package PracticePrograming;

public class ReverseString {
    public static void main(String [] args){

        String str="abcd";
        //String rev="";     ---->stringbuffer we need to comment it


//using + (string concatenation) operator
//        int len=str.length();
//        for(int i=len-1;i>=0;i--){
//            rev=rev+str.charAt(i);
//        }
//        System.out.println(rev);

        //2.using character array
//        char a[]=str.toCharArray();
//        int len=a.length;
//        for(int i=len-1;i>=0;i--){
//            rev=rev+a[i];
//        }
//        System.out.println(rev);


        //3.using StringBuffer class
        StringBuffer sb=new StringBuffer(str);
         StringBuffer rev=sb.reverse();
         System.out.println(rev);








    }
}
