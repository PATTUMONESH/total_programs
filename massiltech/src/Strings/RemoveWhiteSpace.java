package Strings;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String str="new       member     hi gayi";
        System.out.println("before:"+str);
       str= str.replaceAll("\\s","");
        System.out.println("after:"+str);

    }
}
