package Strings;

public class StringPractice2 {
    public static void main(String [] args){
 StringBuffer sb1=new StringBuffer("mon");
 StringBuffer sb2=new StringBuffer("esh");
 sb1.insert(0,"esh");
 sb1.append("mon");
 sb1.delete(0,2);
 sb1.deleteCharAt(0);
 System.out.println(sb1.reverse());
 System.out.println(sb1);
 System.out.println(sb1.capacity());
 sb1.ensureCapacity(222);
        System.out.println(sb1.capacity());

System.out.println(sb1.compareTo(sb2));
    }
}
