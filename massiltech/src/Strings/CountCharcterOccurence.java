package Strings;

public class CountCharcterOccurence {
    public static void main(String[] args) {
        String s="java is a programing language";
        int totalcount=s.length();
        int totalcount_afterremove=s.replace("j","").length();
        int count=totalcount-totalcount_afterremove;
        System.out.println("j occurance:"+count);

    }

}
